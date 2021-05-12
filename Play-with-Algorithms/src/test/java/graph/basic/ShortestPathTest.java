package graph.basic;

import org.junit.Test;

public class ShortestPathTest {

    @Test
    public void path() {
        String filename = "testG.txt";
        SparseGraph g = new SparseGraph(7, false);
        ReadGraph.graph(g, filename);
        g.show();
        System.out.println();

        ShortestPath path = new ShortestPath(g, 0);
        System.out.println("Path from 0 to 6 : ");
        path.showPath(6);
        System.out.println("Length from 0 to 6 : " + path.length(6));
    }
}