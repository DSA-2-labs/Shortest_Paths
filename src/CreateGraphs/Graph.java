package src.CreateGraphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Graph {
    private int V,E;
    private Edge[] edges;
    private int[][] adjMatrix = new int[V][V];
    public Graph(String filename)
    {
        try {
            Scanner scan=new Scanner(new File(filename));
            V=scan.nextInt();
            E= scan.nextInt();
            edges=new Edge[E];
            for (int i = 0; i < E; i++) {
                edges[i]=new Edge(scan.nextInt(),scan.nextInt(),scan.nextInt());
                int x = edges[i].getFrom();
                int y = edges[i].getTo();
                int w = edges[i].getW();
                adjMatrix[x][y] = w;
                adjMatrix[x][x] = 0;
                adjMatrix[y][y] = 0;
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
    public void dijkestra(int src, int[] cost, int[] p){
        boolean[] added = new boolean[V];
        for (int i = 0; i < V; i++) {
            cost[i] = Integer.MAX_VALUE;
            added[i] = false;
        }
        cost[src] = 0;
        p[src] = -1;
        for(int i=0 ; i<V ; i++){
            int nearestV = -1;
            int shortest_D = Integer.MAX_VALUE;
            for(int j=0 ; j<V ; j++){
                if(!added[j] && cost[j] < shortest_D){
                    shortest_D = cost[j];
                    nearestV = j;
                }
            }
            added[nearestV] = true;
            for(int index = 0; index<V ; i++){
                int edgeW = adjMatrix[nearestV][index];
                if(edgeW > 0 && shortest_D+edgeW < cost[index]){
                    cost[index] = shortest_D+edgeW;
                    p[index] = nearestV;
                }

            }

        }
    }


}
