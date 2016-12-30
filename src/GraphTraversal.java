import java.util.ArrayList;
import java.util.LinkedList;

public class GraphTraversal {
    public static void dfs() {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
        g.DFS(2);
    }

    public static void bfs() {
        Graph G = new Graph(4);
        G.addEdge(0, 1);
        G.addEdge(0, 2);
        G.addEdge(1, 2);
        G.addEdge(2, 0);
        G.addEdge(2, 3);
        G.addEdge(3, 3);
        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");
        G.BFS(2);
    }
}

class Graph {
    private int vertices;
    ArrayList<Integer>[] nodes;

    Graph(int v) {
        vertices = v;
        nodes = new ArrayList[v];
        for (int i = 0; i < v; i++) {
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
}