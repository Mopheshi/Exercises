"""
A topological sort or topological ordering of a directed graph is a linear ordering of its vertices such that for 
every directed edge uv from vertex u to vertex v, u comes before v in the ordering.
"""


def topologicalSort(graph):
    visited = set()
    stack = []

    def dfs(node):
        visited.add(node)
        for neighbor in graph[node]:
            if neighbor not in visited:
                dfs(neighbor)
        stack.append(node)

    for node in graph:
        if node not in visited:
            dfs(node)

    return stack[::-1]


# Example usage:
graph_sample = {
    'A': ['B', 'C'],
    'B': ['D'],
    'C': ['D', 'E'],
    'D': ['F'],
    'E': ['F'],
    'F': []
}

result = topologicalSort(graph_sample)
print(result)

"""
In this implementation, we use a dictionary ('graph') to represent the directed graph, where each key is a node 
and its corresponding value is a list of its neighbors. The 'topologicalSort' function takes this graph as input and 
returns a list representing the topological order.

We use a set 'visited' to keep track of the nodes we have visited during the Depth-First Search. The 'dfs' function 
performs a depth-first search starting from a given node, recursively visiting its neighbors. After visiting all the 
neighbors, the current node is added to the stack.

Finally, we iterate through all nodes in the graph, calling 'dfs' on any unvisited node. The resulting stack contains 
the topological order, which we reverse to obtain the correct order.
"""
