package dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {

    private final ArrayList<ArrayList<Integer>> graph;
    private final boolean[] vis;

    private final Queue<Integer> queue;

    public GraphBFS(int vertex) {
        vis = new boolean[vertex];
        queue = new LinkedList<>();
        graph = new ArrayList<>();
        for (int i = 0; i < vertex; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public static void main(String[] args) {
        GraphBFS bfs = new GraphBFS(10);

        bfs.addConnection(0, 1, true);
        bfs.addConnection(0, 2, true);
        bfs.addConnection(1, 3, true);
        bfs.addConnection(1, 4, true);
        bfs.addConnection(2, 0, true);
        bfs.addConnection(3, 4, true);
        bfs.addConnection(4, 2, true);
        bfs.addConnection(6, 7, true);
        bfs.addConnection(7, 8, true);
        bfs.addConnection(8, 6, true);

//        bfs.printBFS(0, bfs.vis, bfs.graph);
    }

    private void addConnection(int source, int destination, boolean isBiDirectional) {
        graph.get(source).add(destination);
        if (isBiDirectional) graph.get(destination).add(source);
    }
}
