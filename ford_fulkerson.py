from collections import defaultdict

"""
Implementation of the Ford-Fulkerson algorithm.
"""


def bfs(graph, source, sink, parent):
    """
    Breadth-First Search algorithm
    :param graph:
    :param source:
    :param sink:
    :param parent:
    :return boolean:
    """
    visited = set()
    queue = [(source, float('inf'))]
    visited.add(source)

    while queue:
        u, flow = queue.pop(0)
        for v, capacity in graph[u]:
            if v not in visited and capacity > 0:
                visited.add(v)
                parent[v] = (u, capacity)
                if v == sink:
                    return True
                queue.append((v, min(flow, capacity)))
    return False


def ford_fulkerson(graph, source, sink):
    """
    Ford-Fulkerson algorithm.
    :param graph:
    :param source:
    :param sink:
    :return maximum flow:
    """
    parent = {}
    max_flow = 0

    while bfs(graph, source, sink, parent):
        path_flow = float('inf')
        s = sink
        while s != source:
            path_flow = min(path_flow, parent[s][1])
            s = parent[s][0]

        max_flow += path_flow
        v = sink
        while v != source:
            u = parent[v][0]
            graph[u][v] -= path_flow
            graph[v][u] += path_flow
            v = parent[v][0]

    return max_flow


# Implementation to find the maximum flow through a network:
graph = defaultdict(dict)
graph[0][1] = 16
graph[0][2] = 13
graph[1][2] = 10
graph[1][3] = 12
graph[2][1] = 4
graph[2][4] = 14
graph[3][2] = 9
graph[3][5] = 20
graph[4][3] = 7
graph[4][5] = 4

source = 0
sink = 5

max_flow = ford_fulkerson(graph, source, sink)
print("Maximum Flow:", max_flow)
