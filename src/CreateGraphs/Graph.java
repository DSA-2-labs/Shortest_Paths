package src.CreateGraphs;

import java.io.File;
import java.io.FileNotFoundException;
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
        System.out.println("Verices="+V+", Edges="+E);
        for (int i = 0; i < E; i++) {
            System.out.println(edges[i].getFrom()+"->"+edges[i].getTo()+","+edges[i].getW());
        }
    }
}
