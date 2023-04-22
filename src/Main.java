package src;

import src.CreateGraphs.Graph;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph("/home/mahmoud/Test1.txt");
        g.print();
        int[][] cost = new int[g.size()][g.size()];
        int[][] p = new int[g.size()][g.size()];
        /*if (g.bellmanFord(0, cost, p)) {
            System.out.println("No negative cycle");
        }
        for (int i = 0; i < g.size(); i++) {
            System.out.println("cost[" + i + "]=" + cost[i]+", p["+i+"]="+p[i]);
        }*/
        System.out.println(g.Floyd_warshall(cost,p));
    }

}
