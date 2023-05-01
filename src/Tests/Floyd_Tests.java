package src.Tests;
import org.junit.Assert;
import org.junit.Test;
import src.CreateGraphs.Graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Floyd_Tests {
    Scanner scan;
    private Graph graph;
    private int[][] cost;
    private int[][] pre;
    String path = "D:/Data/2nd year/2nd term/Data-Structure2/labs/Tests/";
    private void read_expected(String filename,int[][] expected){
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
    public void Test1(){
        graph=new Graph(path + "Test1.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected1.txt",Expected_cost);
        read_expected(path + "Expected1p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
        Assert.assertFalse(graph.Floyd_warshall(cost,pre));
    }
    @Test
    public void Test2(){
        graph=new Graph(path + "Test2.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected2.txt",Expected_cost);
        read_expected(path + "Expected2p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
        Assert.assertTrue(graph.Floyd_warshall(cost,pre));
    }
    @Test
    public void Test3() {
        graph=new Graph(path + "Test3.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected3.txt",Expected_cost);
        read_expected(path + "Expected3p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
        Assert.assertTrue(graph.Floyd_warshall(cost,pre));
    }
    @Test
    public void Test4() {
        graph=new Graph(path + "Test4.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected4.txt",Expected_cost);
        read_expected(path + "Expected4pp.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test5() {
        graph=new Graph(path + "Test5.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected5.txt",Expected_cost);
        read_expected(path + "Expected5p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test6() {
        graph=new Graph(path + "Test6.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected6.txt",Expected_cost);
        read_expected(path + "Expected6p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test7()  {
        graph=new Graph(path + "Test7.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected7.txt",Expected_cost);
        read_expected(path + "Expected7p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test8() {
        graph=new Graph(path + "Test8.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected8.txt",Expected_cost);
        read_expected(path + "Expected8p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test9() {
        graph=new Graph(path + "Test9.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected9.txt",Expected_cost);
        read_expected(path + "Expected9p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test10() {
        graph=new Graph(path + "Test10.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected10.txt",Expected_cost);
        read_expected(path + "Expected10p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
        Assert.assertFalse(graph.Floyd_warshall(cost,pre));
    }

    @Test
    public void Test11() {
        graph=new Graph(path + "Test11.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected11.txt",Expected_cost);
        read_expected(path + "Expected11pp.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }

    @Test
    public void Test12() {
        graph=new Graph(path + "Test12.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected12.txt",Expected_cost);
        read_expected(path + "Expected12p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test13() {
        graph=new Graph(path + "Test13.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected13.txt",Expected_cost);
        read_expected(path + "Expected13p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }

    @Test
    public void Test14() {
        graph=new Graph(path + "Test14.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected14.txt",Expected_cost);
        read_expected(path + "Expected14p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test15() {
        graph=new Graph(path + "Test15.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected15.txt",Expected_cost);
        read_expected(path + "Expected15p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test16() {
        graph=new Graph(path + "Test16.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected16.txt",Expected_cost);
        read_expected(path + "Expected16p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
        Assert.assertTrue(graph.Floyd_warshall(cost,pre));
    }
    @Test
    public void Test17() {
        graph=new Graph(path + "Test17.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected17.txt",Expected_cost);
        read_expected(path + "Expected17p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test18() {
        graph=new Graph(path + "Test18.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected18.txt",Expected_cost);
        read_expected(path + "Expected18p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
        Assert.assertTrue(graph.Floyd_warshall(cost,pre));
    }
    @Test
    public void Test19(){
        graph=new Graph(path + "Test19.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected(path + "Expected19.txt",Expected_cost);
        read_expected(path + "Expected19p.txt",Expected_p);
        Assert.assertFalse(graph.Floyd_warshall(cost,pre));
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
}
