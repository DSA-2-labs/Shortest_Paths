package src.CreateGraphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Graph {
    private int V,E;
    private Edge[] edges;
    public Graph(String filename)
    {
        try {
            Scanner scan=new Scanner(new File(filename));
            V=scan.nextInt();
            E= scan.nextInt();
            edges=new Edge[E];
            for (int i = 0; i < E; i++) {
                edges[i]=new Edge(scan.nextInt(),scan.nextInt(),scan.nextInt());
            }
            scan.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    public int size()
    {
        return V;
    }
    public void print()
    {
        System.out.println("Vertices="+V+", Edges="+E);
        for (int i = 0; i < E; i++) {
            System.out.println(edges[i].getFrom()+"->"+edges[i].getTo()+","+edges[i].getW());
        }
    }
    public boolean bellmanFord(int src,int[] cost,int[] p){
        Arrays.fill(cost,Integer.MAX_VALUE);
        Arrays.fill(p,-1);
        cost[src] = 0;
        for (int i = 0; i <V-1 ; i++) {
            for (int j = 0; j <E ; j++) {
                int u = edges[j].getFrom();
                int v = edges[j].getTo();
                int w = edges[j].getW();
                if (cost[u]!=Integer.MAX_VALUE && cost[u]+w<cost[v]){
                    cost[v] = Math.max(-Integer.MAX_VALUE,cost[u]+w);//for overflow
                    p[v] = u;
                }
            }
        }
        //check negative cycle
        for (int i = 0; i <E ; i++) {
            int u = edges[i].getFrom();
            int v = edges[i].getTo();
            int w = edges[i].getW();
            if (cost[u]!=Integer.MAX_VALUE && cost[u]+w<cost[v]){
                return false;
            }
        }
        return true;
    }

}
