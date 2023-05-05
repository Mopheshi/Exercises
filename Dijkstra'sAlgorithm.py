import heapq

"""
@Chatbot AI
@Mopheshi

I used a priority queue in this implementation, 'graph' is a dictionary that contains the graph represented as an 
adjacency list, where each key represents a node and its value is another dictionary that contains its adjacent nodes 
and their weights.

For example, the following graph can be represented as a dictionary:


      7
  A ----- B
  |\      |\
  | \     | \
4 |  2    |  3
  |   \   |   \
  |    \  |    \
  C----- D ----- E
      5       2
"""


# This returns a dictionary with the shortest distances from node A to all other nodes in the graph.
def dijkstra(graph, start):
    # Initialize distances to all other nodes as infinity
    dists = {node: float('inf') for node in graph}
    dists[start] = 0

    # Use min-heap to keep track of next node to visit
    heap = [(0, start)]

    while heap:
        # Pop the node with the smallest distance
        current_dist, current_node = heapq.heappop(heap)

        # If distance to current node is already less than the distance in heap, ignore it
        if current_dist > dists[current_node]:
            continue

        # Visit adjacent nodes and update distances if a shorter path is found
        for neighbor, weight in graph[current_node].items():
            new_distance = current_dist + weight
            if new_distance < dists[neighbor]:
                dists[neighbor] = new_distance
                heapq.heappush(heap, (new_distance, neighbor))

    return dists


# Declare the graph as a dictionary
graph = {
    'A': {'B': 7, 'C': 4},
    'B': {'A': 7, 'D': 3, 'E': 2},
    'C': {'A': 4, 'D': 6},
    'D': {'B': 3, 'C': 6, 'E': 2},
    'E': {'B': 2, 'D': 2}
}

# To find the shortest path from node A to all other nodes, we can call the 'dijkstra' function with the graph and the
# starting node
distances = dijkstra(graph, 'A')
print(distances)
