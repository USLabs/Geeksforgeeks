package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by techmint on 12/30/16.
 */
public class Graph {
    private int vertices;
    ArrayList<Integer>[] nodes;

    Graph(int v) {
        vertices = v;
        nodes = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            nodes[i] = new ArrayList();
        }
    }

    void addEdge(int a, int b) {
        nodes[a].add(b);
    }

    void DFS(int a) {
        boolean[] visited = new boolean[vertices];
        DFSutil(a, visited);
    }

    void DFSutil(int a, boolean[] v) {
        v[a] = true;
        System.out.println(a);
        for (int b : nodes[a]) {
            if (v[b] == false)
                DFSutil(b, v);
        }
        return;
    }

    void BFS(int a) {
        boolean[] visited = new boolean[vertices];
        BFSUtil(a, visited);
    }

    void BFSUtil(int a, boolean[] v) {
        v[a] = true;
        LinkedList<Integer> queue = new LinkedList();
        queue.add(a);
        while (!queue.isEmpty()) {
            int b = queue.poll();
            System.out.println(b);
            for (int c : nodes[b]) {
                if (!v[c]) {
                    queue.add(c);
                    v[c] = true;
                }
            }
        }
    }

    boolean isCyclic() {
        boolean[] dfsAncestors = new boolean[nodes.length];
        boolean[] visited = new boolean[nodes.length];
        for (int i = 0; i < vertices; i++) {
            if (isCyclicUtil(i, dfsAncestors, visited))
                return true;
        }
        return false;
    }

    boolean isCyclicUtil(int node, boolean[] dfsAncestors, boolean[] visited) {
        if (visited[node]) {
            if (dfsAncestors[node])
                return true;
            else
                return false;
        } else {
            visited[node] = true;
            dfsAncestors[node] = true;
            for (int n : nodes[node]) {
                if (n == node || (visited[n] && dfsAncestors[n]) || (visited[n] == false && isCyclicUtil(n, dfsAncestors, visited)))
                    return true;
            }
        }
        dfsAncestors[node] = false;
        return false;
    }
}
