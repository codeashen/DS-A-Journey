package graph;

import org.junit.Test;

public class DenseGraphTest {

    /**
     * 测试构建图，打印图
     */
    @Test
    public void test() {
        // 使用两种图的存储方式读取testG1.txt文件
        String filename = "testG1.txt";
        SparseGraph g1 = new SparseGraph(13, false);
        ReadGraph.graph(g1, filename);
        System.out.println("test G1 in Sparse Graph:");
        g1.show();

        System.out.println();

        DenseGraph g2 = new DenseGraph(13, false);
        ReadGraph.graph(g2 , filename );
        System.out.println("test G1 in Dense Graph:");
        g2.show();

        System.out.println();

        // 使用两种图的存储方式读取testG2.txt文件
        filename = "testG2.txt";
        SparseGraph g3 = new SparseGraph(6, false);
        ReadGraph.graph(g3, filename);
        System.out.println("test G2 in Sparse Graph:");
        g3.show();

        System.out.println();

        DenseGraph g4 = new DenseGraph(6, false);
        ReadGraph.graph(g4, filename);
        System.out.println("test G2 in Dense Graph:");
        g4.show();
    }

    /**
     * 测试计算连通分量
     */
    @Test
    public void componentsTest() {
        // TestG1.txt
        String filename1 = "testG1.txt";
        SparseGraph g1 = new SparseGraph(13, false);
        ReadGraph.graph(g1, filename1);
        Components component1 = new Components(g1);
        System.out.println("TestG1.txt, Component Count: " + component1.count());
        System.out.println();

        // TestG2.txt
        String filename2 = "testG2.txt";
        SparseGraph g2 = new SparseGraph(6, false);
        ReadGraph.graph(g2, filename2);
        Components component2 = new Components(g2);
        System.out.println("TestG2.txt, Component Count: " + component2.count());
    }

}