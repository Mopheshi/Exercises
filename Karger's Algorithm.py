"""
Karger's algorithm is a randomized algorithm that finds a minimum cut of a connected graph.
"""

import random


def kargerMinCut(graph):
    """
    Takes a graph as input and returns the minimum cut of the graph. The function uses a while loop to
    repeatedly contract edges in the graph until only two nodes remain. The function then returns the number of edges
    between the two remaining nodes.

    :argument graph: graph
    :returns minimum cut: minimum cut
    """
    while len(graph) > 2:
        v1 = random.choice(list(graph.keys()))
        v2 = random.choice(graph[v1])
        contract(graph, v1, v2)
    return len(graph[list(graph.keys())[0]])


def contract(graph, v1, v2):
    """
    Takes a graph and two vertices as input and contracts the edge between the two vertices. The
    function first merges the adjacency lists of the two vertices. It then removes all references to v2 in the adjacency
    lists of other vertices and replaces them with references to v1. Finally, it deletes v2 from the graph.

    :argument graph: graph, v1: vertex, v2: vertex
    """
    graph[v1].extend(graph[v2])
    for node in graph[v2]:
        graph[node].remove(v2)
        graph[node].append(v1)
    del graph[v2]


graph = {0: [1, 2], 1: [0, 2], 2: [0, 1, 3], 3: [2]}
print(f"Minimum cut of {graph} with v1 and v2 chosen at random is = {kargerMinCut(graph)}")
