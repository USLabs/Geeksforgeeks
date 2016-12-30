
public class GraphBFS {
    public static void bfs() {
        Graph G = new Graph(4);
        G.addEdge(0, 1);
        G.addEdge(0, 2);
        G.addEdge(1, 2);
        G.addEdge(2, 0);
        G.addEdge(2, 3);
        G.addEdge(3, 3);
        System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
        G.BFS(2);
    }
}
