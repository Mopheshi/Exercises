def topologicalSort(adjacency_list):
    """
    The function takes as input an adjacency list as a dictionary, where the keys are the nodes and the values are lists
    of neighbors.

    The algorithm works as follows:
        1. Initialize a dictionary 'in_degree' to count the number of incoming edges for each node, and set it initially
        to 0 for all nodes.
        2. Traverse the adjacency list to update the 'in_degree' of each node.For each neighbor of a node, increment its
            'in_degree' by 1.
        3. Initialize a queue to store nodes with 'in_degree' 0 (i.e., no incoming edges). Add all such nodes to the
            queue.
        4. While the queue is not empty, remove a node from the front of the queue, add it to the sorted list, and
            decrement the 'in_degree' of its neighbors. If a neighbor has 'in_degree' 0 after the decrement, add it to
            the queue.
        5. After the loop, if the length of the sorted list is less than the number of nodes, the graph has at least one
            cycle and the function raises a 'ValueError'.

    The time complexity of the algorithm is O(V + E), where V is the number of nodes and E is the number of edges, since
    each node and edge is visited once.

    :parameter adjacency_list: Adjacency List
    :return sorted_list: Sorted Adjacency List
    """

    # count incoming edges for each node
    in_degree = {v: 0 for v in adjacency_list}
    for neighbors in adjacency_list.values():
        for v in neighbors:
            in_degree[v] += 1

    # use a queue to store nodes with in-degree 0
    queue = [v for v, degree in in_degree.items() if degree == 0]
    sorted_list = []

    while queue:
        # remove a node with in-degree 0 from the queue
        v = queue.pop(0)
        sorted_list.append(v)

        # update in-degree of neighbors
        for neighbor in adjacency_list[v]:
            in_degree[neighbor] -= 1
            # if a neighbor has no more incoming edges, add it to the queue
            if in_degree[neighbor] == 0:
                queue.append(neighbor)

    # check if the graph has cycles (i.e., there are nodes with positive in-degree)
    if len(sorted_list) != len(adjacency_list):
        raise ValueError("Graph has at least one cycle.")

    return sorted_list


"""
The following graph:

A ---> B ---> D <---> E
^           |
|           v
+-----------C

can be represented as:
"""

adjacencyList = dict(A=['B'], B=['D', 'C'], C=['D'], D=['E'], E=['D'])

print(topologicalSort(adjacencyList))
