package org.example.Graphs;

import java.util.*;

public class Graph {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adj; // Adjacency List

    public Graph(int V) {
        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        for (Integer n : adj[v]) {
            if (!visited[n]) {
                DFSUtil(n, visited);

            }
        }
    }

    public void DFS(int v) {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }

    public void BFS(int s) {
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;

        while (!queue.isEmpty())
        {
            int u = queue.poll();
            System.out.print(u + " ");

            for (int n : adj[u]) {
            if (!visited[n]) {
                visited[n] = true;
                queue.add(n);
            }
        }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal (starting from vertex 2)");
                g.DFS(2);
        System.out.println();

        System.out.println("Following is Breadth First Traversal (starting from vertex 2)");
        g.BFS(2);

    }
}
