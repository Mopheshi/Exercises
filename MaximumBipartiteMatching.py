from collections import deque


class MaximumBipartiteMatching:
    def __init__(self, graph):
        self.graph = graph
        self.num_left = len(graph)
        self.num_right = len(graph[0])

    def bfs(self, source, sink, parent):
        visited = [False] * self.num_left
        queue = deque()
        queue.append(source)
        visited[source] = True

        while queue:
            u = queue.popleft()

            for v in range(self.num_right):
                if not visited[v] and self.graph[u][v] > 0:
                    queue.append(v)
                    visited[v] = True
                    parent[v] = u

        return visited[sink]

    def ford_fulkerson(self, source, sink):
        parent = [-1] * self.num_right
        max_flow = 0

        while self.bfs(source, sink, parent):
            path_flow = float("inf")
            v = sink

            while v != source:
                u = parent[v]
                path_flow = min(path_flow, self.graph[u][v])
                v = u

            v = sink
            while v != source:
                u = parent[v]
                self.graph[u][v] -= path_flow
                self.graph[v][u] += path_flow
                v = u

            max_flow += path_flow

        return max_flow


# Example usage
graph = [[0, 1, 1, 0],
         [1, 0, 0, 1],
         [1, 1, 0, 1],
         [0, 0, 0, 1]]

matching = MaximumBipartiteMatching(graph)
source = 0
sink = 3
max_matching = matching.ford_fulkerson(source, sink)
print("Maximum Bipartite Matching:", max_matching)
