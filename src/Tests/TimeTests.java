package src.Tests;

import org.junit.Test;
import src.CreateGraphs.Graph;

public class TimeTests {
    private Graph graph;
    //meantime testing between 2 specific nodes
    // V = 10 with different densities
    @Test
    public void test1(){
        graph = new Graph( "/home/mahmoud/timetests/graph10.txt");
        long start = System.nanoTime();
        graph.dijkestra(0, new int[graph.size()], new int[graph.size()]);
        long end = System.nanoTime();
        System.out.println("V: " + graph.size()+ "E: " + graph.Edge_size());
        System.out.println("dijkstra: " + (end - start)/graph.size());

        start = System.nanoTime();
        graph.bellmanFord(0, new int[graph.size()], new int[graph.size()]);
        end = System.nanoTime();
        System.out.println("bellman: " + (end - start)/graph.size());

        start = System.nanoTime();
        graph.Floyd_warshall(new int[graph.size()][graph.size()], new int[graph.size()][graph.size()]);
        end = System.nanoTime();
        System.out.println("Floyd: " + (end - start)/(graph.size()*graph.size()));
    }
    @Test
    public void test2(){
        graph = new Graph( "/home/mahmoud/timetests/graph100.txt");
        long start = System.nanoTime();
        graph.dijkestra(0, new int[graph.size()], new int[graph.size()]);
        long end = System.nanoTime();
        System.out.println("V: " + graph.size()+ "E: " + graph.Edge_size());
        System.out.println("dijkstra: " + (end - start)/graph.size());

        start = System.nanoTime();
        graph.bellmanFord(0, new int[graph.size()], new int[graph.size()]);
        end = System.nanoTime();
        System.out.println("bellman: " + (end - start)/graph.size());

        start = System.nanoTime();
        graph.Floyd_warshall(new int[graph.size()][graph.size()], new int[graph.size()][graph.size()]);
        end = System.nanoTime();
        System.out.println("Floyd: " + (end - start)/(graph.size()*graph.size()));
    }

    //meantime testing between 2 specific nodes
    // V = 1000 with different densities
    @Test
    public void test3(){
        graph = new Graph( "/home/mahmoud/timetests/graph1000.txt");
        long start = System.nanoTime();
        graph.dijkestra(0,  new int[graph.size()], new int[graph.size()]);
        long end = System.nanoTime();
        System.out.println("V: " + graph.size()+ "E: " + graph.Edge_size());
        System.out.println("dijkstra: " + (end - start)/graph.size());

        start = System.nanoTime();
        graph.bellmanFord(0, new int[graph.size()], new int[graph.size()]);
        end = System.nanoTime();
        System.out.println("bellman: " + (end - start)/graph.size());

        start = System.nanoTime();
        graph.Floyd_warshall(new int[graph.size()][graph.size()], new int[graph.size()][graph.size()]);
        end = System.nanoTime();
        System.out.println("Floyd: " + (end - start)/(graph.size()*graph.size()));
    }

    //meantime testing between 2 specific nodes
    // V = 500 with different densities
    //graph5002495.txt
    @Test
    public void test4(){
        graph = new Graph( "/home/mahmoud/timetests/graph500.txt");
        long start = System.nanoTime();
        graph.dijkestra(0, new int[graph.size()], new int[graph.size()]);
        long end = System.nanoTime();
        System.out.println("V: " + graph.size()+ "E: " + graph.Edge_size());
        System.out.println("dijkstra: " + (end - start)/graph.size());

        start = System.nanoTime();
        graph.bellmanFord(0, new int[graph.size()], new int[graph.size()]);
        end = System.nanoTime();
        System.out.println("bellman: " + (end - start)/graph.size());

        start = System.nanoTime();
        graph.Floyd_warshall(new int[graph.size()][graph.size()], new int[graph.size()][graph.size()]);
        end = System.nanoTime();
        System.out.println("Floyd: " + (end - start)/(graph.size()*graph.size()));
    }
    @Test
    public void test5(){
        graph = new Graph( "/home/mahmoud/Test19.txt");
        long start = System.nanoTime();
        graph.dijkestra(0, new int[graph.size()], new int[graph.size()]);
        long end = System.nanoTime();
        System.out.println("V: " + graph.size()+ "E: " + graph.Edge_size());
        System.out.println("dijkstra: " + (end - start)/graph.size());

        start = System.nanoTime();
        graph.bellmanFord(0, new int[graph.size()], new int[graph.size()]);
        end = System.nanoTime();
        System.out.println("bellman: " + (end - start)/graph.size());

        start = System.nanoTime();
        graph.Floyd_warshall(new int[graph.size()][graph.size()], new int[graph.size()][graph.size()]);
        end = System.nanoTime();
        System.out.println("Floyd: " + (end - start)/(graph.size()*graph.size()));
    }
}
