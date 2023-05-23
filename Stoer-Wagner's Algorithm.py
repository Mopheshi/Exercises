"""
The Stoer-Wagner algorithm is used to find the minimum cut of a graph. It is an iterative algorithm that works by
contracting vertices of the graph until there are only two vertices left. The minimum cut is then the sum of the
weights of the edges that connect these two vertices.
"""
from sys import maxsize


def minimum_cut(graph):
    """
    Computes the minimum cut in an undirected graph using the Stoer-Wagner algorithm.

    Args:
        graph (List[List[int]]): Adjacency matrix representation of the graph.

    Returns:
        Tuple[int, List[int]]: Tuple containing the minimum cut value and the nodes in the cut.
    """

    n = len(graph)  # Number of vertices
    mincut = maxsize  # Initialize mincut with a large value
    bestcut = []  # Store the nodes in the best cut

    # Iterate over all possible subsets of nodes
    for i in range(n):
        # Active vertices that haven't been contracted
        active = [True] * n
        # Potential nodes for contraction
        v = list(range(n))
        a = i

        # Contract vertices until only 2 nodes are left
        for _ in range(n - 1):
            active[a] = False  # Mark vertex 'a' as inactive

            # Find the most tightly connected vertex to 'a'
            b = -1
            mincutval = -maxsize - 1
            for j in range(n):
                if active[j]:
                    cutval = graph[a][j]
                    if cutval > mincutval:
                        mincutval = cutval
                        b = j

            # Contract vertex 'a' and 'b'
            if _ == n - 2:
                # Last iteration, store the cut value and nodes
                last = [a, b]
                cut = min(graph[a][b], mincut)
                if cut == mincut:
                    bestcut = last
                mincut = min(cut, mincut)
            else:
                # Contract vertices 'a' and 'b'
                for j in range(n):
                    graph[a][j] += graph[b][j]
                    graph[j][a] += graph[j][b]

                active[b] = False  # Mark vertex 'b' as inactive

                # Update the weights of the merged vertex
                for j in range(n):
                    if active[j]:
                        graph[a][j] -= graph[b][j]
                        graph[j][a] -= graph[j][b]

                a = b  # Contracted vertex

    return mincut, bestcut


# Example usage with adjacency matrix
graph = [
    [0, 2, 3, 0, 0],
    [2, 0, 5, 1, 0],
    [3, 5, 0, 4, 2],
    [0, 1, 4, 0, 3],
    [0, 0, 2, 3, 0]
]

cut_value, cut_nodes = minimum_cut(graph)
print("Minimum Cut Value:", cut_value)
print("Nodes in the Cut:", cut_nodes)
