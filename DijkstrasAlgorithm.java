/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

import java.util.*;

/**
 *
 * @Chatbot AI
 * @author MOPHE
 */
public class DijkstrasAlgorithm {

    public static void main(String[] args) {
        // Create a graph as an adjacency list
        Map<String, Map<String, Integer>> graph = new HashMap<>();
        graph.put("A", new HashMap<>() {
            {
                put("B", 7);
                put("C", 4);
            }
        });
        graph.put("B", new HashMap<>() {
            {
                put("A", 7);
                put("D", 3);
                put("E", 2);
            }
        });
        graph.put("C", new HashMap<>() {
            {
                put("A", 4);
                put("D", 6);
            }
        });
        graph.put("D", new HashMap<>() {
            {
                put("B", 3);
                put("C", 6);
                put("E", 2);
            }
        });
        graph.put("E", new HashMap<>() {
            {
                put("B", 2);
                put("D", 2);
            }
        });

        // Find the shortest path from node A to all other nodes
        Map<String, Integer> distances = dijkstra(graph, "A");
        System.out.println(distances);
    }

    /**
     * In this implementation, 'graph' is a map that contains the graph
     * represented as an adjacency list, where each key represents a node and
     * its value is another map that contains its adjacent nodes and their
     * weights.To find the shortest path from node A to all other nodes, we can
     * call the 'dijkstra' method with the graph and the starting node:
     *
     * This returns a map with the shortest distances from node A to all other
     * nodes in the graph.
     *
     * @param graph
     * @param start
     * @return
     */
    public static Map<String, Integer> dijkstra(Map<String, Map<String, Integer>> graph, String start) {
        // Initialize distances to all other nodes as infinity
        Map<String, Integer> distances = new HashMap<>();
        for (String node : graph.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(start, 0);

        // Use min-heap to keep track of next node to visit
        PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        heap.offer(new AbstractMap.SimpleEntry<>(start, 0));

        while (!heap.isEmpty()) {
            // Poll the node with smallest distance
            Map.Entry<String, Integer> entry = heap.poll();
            String current_node = entry.getKey();
            int current_dist = entry.getValue();

            // If distance to current node is already less than the distance in heap, ignore it
            if (current_dist > distances.get(current_node)) {
                continue;
            }

            // Visit adjacent nodes and update distances if a shorter path is found
            for (Map.Entry<String, Integer> neighbor : graph.get(current_node).entrySet()) {
                String neighbor_node = neighbor.getKey();
                int neighbor_dist = neighbor.getValue();
                int new_distance = current_dist + neighbor_dist;
                if (new_distance < distances.get(neighbor_node)) {
                    distances.put(neighbor_node, new_distance);
                    heap.offer(new AbstractMap.SimpleEntry<>(neighbor_node, new_distance));
                }
            }
        }

        return distances;
    }
}
