package CreateGraphs;

public class Edge {
    private int from;
    private int to;
    private int w;
    Edge(int from, int to, int w){
        this.from = from;
        this.to = to;
        this.w = w;
    }
    public int getFrom(){
        return from;
    }
    public int getTo(){
        return to;
    }
    public int getW(){
        return w;
    }
}
