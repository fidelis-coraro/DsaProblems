package org.example.Graphs;



public class DetectCycle {
        public static boolean isCyclicUtil(int[][] adjMatrix, int v, boolean[] visited, int parent) {
            visited[v] = true;

            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[v][i] == 1 && !visited[i]) {
                    if (isCyclicUtil(adjMatrix, i, visited, v)) {
                        return true;
                    }
                } else if (adjMatrix[v][i] == 1 && i != parent) {
                    return true;
                }
            }

            return false;
        }

        public static boolean isCyclic(int[][] adjMatrix, int V) {
            boolean[] visited = new boolean[V];
            for (int i = 0; i < V; i++) {
                if (!visited[i]) {
                    if (isCyclicUtil(adjMatrix, i, visited, -1)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static void main(String[] args) {
            int[][] adjMatrix = {
                    {0, 1, 0, 1},
                    {1, 0, 1, 0},
                    {0, 1, 0, 1},
                    {1, 0, 1, 0}
            };

            int V = 4;

            System.out.println("Graph contains cycle? " + isCyclic(adjMatrix, V));
        }
}