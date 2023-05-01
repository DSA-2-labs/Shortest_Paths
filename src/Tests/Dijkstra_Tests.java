package src.Tests;

import org.junit.Assert;
import org.junit.Test;
import src.CreateGraphs.Graph;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Dijkstra_Tests {
    Scanner scan;
    private Graph graph;
    private int[] cost;
    private int[] parents;
    private void read_expected(String filename,int[][] expected) {
        try{
            scan = new Scanner(new File(filename));
            for (int i = 0; i < expected.length; i++) {
                for (int j = 0; j < expected[0].length; j++) {
                    expected[i][j]=scan.nextInt();
                }
            }scan.close();
        }catch (FileNotFoundException e){e.printStackTrace();}

    }
    @Test
    public void Test1() {
        graph=new Graph("/home/mahmoud/Test4.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected4.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected4p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }

    }
    @Test
    public void Test2() {
        graph=new Graph("/home/mahmoud/Test5.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected5.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected5p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }
    @Test
    public void Test3() {
        graph=new Graph("/home/mahmoud/Test6.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected6.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected6p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }
    @Test
    public void Test4() {
        graph=new Graph("/home/mahmoud/Test7.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected7.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected7p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }
    @Test
    public void Test5() {
        graph=new Graph("/home/mahmoud/Test8.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected8.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected8p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }
    @Test
    public void Test6() {
        graph=new Graph("/home/mahmoud/Test11.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected11.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected11p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }
    @Test
    public void Test7() {
        graph=new Graph("/home/mahmoud/Test12.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected12.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected12p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);

            for (int j = 0; j < Expected_p[0].length; j++) {
                System.out.println(j);
                Assert.assertEquals(Expected_p[i][j],parents[j]);
            }
//            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }
    @Test
    public void Test8() {
        graph=new Graph("/home/mahmoud/Test13.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected13.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected13p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }
    @Test
    public void Test9() {
        graph=new Graph("/home/mahmoud/Test14.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected14.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected14p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }
    @Test
    public void Test10() {
        graph=new Graph("/home/mahmoud/Test15.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected15.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected15p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }

    @Test
    public void Test11() {
        graph=new Graph("/home/mahmoud/Test16.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected16.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected16p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }

    @Test
    public void Test12() {
        graph=new Graph("/home/mahmoud/Test18.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected18.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected18p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            for (int j = 0; j < Expected_p[0].length; j++) {
                Assert.assertEquals(Expected_p[i][j],parents[j]);
            }
//            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }

}
