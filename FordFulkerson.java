import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ChatGPT, Mopheshi
 */
public class FordFulkerson {

    private static final int V = 6; // Number of vertices in the graph

    /**
     * Returns true if there is a path from source 's' to sink 't' in residual
     * graph. Also fills parent[] to store the path
     */
    private static boolean bfs(int[][] residualGraph, int source, int sink, int[] parent) {
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);

        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        parent[source] = -1;

        while (!queue.isEmpty()) {
            int u = queue.poll();

            for (int v = 0; v < V; v++) {
                if (!visited[v] && residualGraph[u][v] > 0) {
                    queue.add(v);
                    parent[v] = u;
                    visited[v] = true;
                }
            }
        }

        return visited[sink];
    }

    /**
     * A function to implement the Ford-Fulkerson algorithm
     *
     * @param graph
     * @param source
     * @param sink
     * @return maxFlow
     */
    public static int fordFulkerson(int[][] graph, int source, int sink) {
        // Create a residual graph and fill the residual graph with the given capacities
        int[][] residualGraph = new int[V][V];
        for (int i = 0; i < V; i++) {
            // Copies an array from the specified source array, beginning at the
            // specified position, to the specified position of the destination array.
            System.arraycopy(graph[i], 0, residualGraph[i], 0, V);
        }

        int[] parent = new int[V]; // This array is filled by BFS and to store the path

        int maxFlow = 0; // There is no flow initially

        // Augment the flow while there is a path from source to sink
        while (bfs(residualGraph, source, sink, parent)) {
            // Find the maximum flow through the path found by BFS
            int pathFlow = Integer.MAX_VALUE;
            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v];
                pathFlow = Math.min(pathFlow, residualGraph[u][v]);
            }

            // Update residual capacities and reverse edges along the path
            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v];
                residualGraph[u][v] -= pathFlow;
                residualGraph[v][u] += pathFlow;
            }

            // Add path flow to the overall maximum flow
            maxFlow += pathFlow;
        }

        // Return the overall maximum flow
        return maxFlow;
    }

    /**
     * Driver code in main method
     *
     * @param args
     */
    public static void main(String[] args) {
        // Create a graph with capacity matrix
        int[][] graph = {
                {0, 16, 13, 0, 0, 0},
                {0, 0, 10, 12, 0, 0},
                {0, 4, 0, 0, 14, 0},
                {0, 0, 9, 0, 0, 20},
                {0, 0, 0, 7, 0, 4},
                {0, 0, 0, 0, 0, 0}
        };

        int source = 0; // Source vertex
        int sink = 5; // Sink vertex

        int maxFlow = fordFulkerson(graph, source, sink);
        System.out.printf("The maximum possible flow is %d%n", maxFlow);
    }
}
