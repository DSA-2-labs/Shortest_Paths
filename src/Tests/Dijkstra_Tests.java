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
    String path = "D:/Data/2nd year/2nd term/Data-Structure2/labs/Tests/";
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
        graph=new Graph(path + "Test4.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected4.txt",Expected_cost);
        read_expected(path + "Expected4p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }

    }
    @Test
    public void Test2() {
        graph=new Graph(path + "Test5.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected5.txt",Expected_cost);
        read_expected(path + "Expected5p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }
    @Test
    public void Test3() {
        graph=new Graph(path + "Test6.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected6.txt",Expected_cost);
        read_expected(path + "Expected6p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }
    @Test
    public void Test4() {
        graph=new Graph(path + "Test7.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected7.txt",Expected_cost);
        read_expected(path + "Expected7p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }
    @Test
    public void Test5() {
        graph=new Graph(path + "Test8.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected8.txt",Expected_cost);
        read_expected(path + "Expected8p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }
    @Test
    public void Test6() {
        graph=new Graph(path + "Test11.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected11.txt",Expected_cost);
        read_expected(path + "Expected11p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }
    @Test
    public void Test7() {
        graph=new Graph(path + "Test12.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected12.txt",Expected_cost);
        read_expected(path + "Expected12p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);

            for (int j = 0; j < Expected_p[0].length; j++) {
                Assert.assertEquals(Expected_p[i][j],parents[j]);
            }
        }
    }
    @Test
    public void Test8() {
        graph=new Graph(path + "Test13.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected13.txt",Expected_cost);
        read_expected(path + "Expected13p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }
    @Test
    public void Test9() {
        graph=new Graph(path + "Test14.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected14.txt",Expected_cost);
        read_expected(path + "Expected14p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }

    @Test
    public void Test10() {
        graph=new Graph(path + "Test15.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected15.txt",Expected_cost);
        read_expected(path + "Expected15p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }

    @Test
    public void Test11() {
        graph=new Graph(path + "Test16.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected16.txt",Expected_cost);
        read_expected(path + "Expected16p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            Assert.assertArrayEquals(Expected_p[i],parents);
        }
    }

    @Test
    public void Test12() {
        graph=new Graph(path + "Test18.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected18.txt",Expected_cost);
        read_expected(path + "Expected18p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.dijkestra(i,cost,parents);
            Assert.assertArrayEquals(Expected_cost[i],cost);
            for (int j = 0; j < Expected_p[0].length; j++) {
                Assert.assertEquals(Expected_p[i][j],parents[j]);
            }
        }
    }

}
