package minspantree;

/**
 * 图中的边
 *
 * @param <Weight> 边的权重Weight
 */
public class Edge<Weight extends Number & Comparable> implements Comparable<Edge> {

    /**
     * 边的两个顶点
     */
    private int a, b;
    /**
     * 边的权重
     */
    private Weight weight;

    public Edge(int a, int b, Weight weight) {
        this.a = a;
        this.b = b;
        this.weight = weight;
    }

    public Edge(Edge<Weight> e) {
        this.a = e.a;
        this.b = e.b;
        this.weight = e.weight;
    }

    /**
     * 返回第一个顶点
     *
     * @return
     */
    public int v() {
        return a;
    }

    /**
     * 返回第一个顶点
     *
     * @return
     */
    public int w() {
        return b;
    }

    /**
     * 返回权重
     *
     * @return
     */
    public Weight wt() {
        return weight;
    }

    /**
     * 给定一个顶点, 返回另一个顶点
     *
     * @param x
     * @return
     */
    public int other(int x) {
        assert x == a || x == b;
        return x == a ? b : a;
    }

    /**
     * 输出边的信息
     *
     * @return
     */
    public String toString() {
        return "" + a + "-" + b + ": " + weight;
    }

    /**
     * 边之间的比较
     *
     * @param that
     * @return
     */
    @Override
    public int compareTo(Edge that) {
        if (weight.compareTo(that.wt()) < 0) {
            return -1;
        } else if (weight.compareTo(that.wt()) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
