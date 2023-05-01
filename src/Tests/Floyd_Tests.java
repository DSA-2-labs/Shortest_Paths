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
        graph=new Graph("/home/mahmoud/Test1.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected1.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected1p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
        Assert.assertFalse(graph.Floyd_warshall(cost,pre));
    }
    @Test
    public void Test2(){
        graph=new Graph("/home/mahmoud/Test2.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected2.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected2p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
        Assert.assertTrue(graph.Floyd_warshall(cost,pre));
    }
    @Test
    public void Test3() {
        graph=new Graph("/home/mahmoud/Test3.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected3.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected3p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
        Assert.assertTrue(graph.Floyd_warshall(cost,pre));
    }
    @Test
    public void Test4() {
        graph=new Graph("/home/mahmoud/Test4.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected4.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected4pp.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test5() {
        graph=new Graph("/home/mahmoud/Test5.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected5.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected5p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test6() {
        graph=new Graph("/home/mahmoud/Test6.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected6.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected6p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test7()  {
        graph=new Graph("/home/mahmoud/Test7.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected7.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected7p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test8() {
        graph=new Graph("/home/mahmoud/Test8.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected8.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected8p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test9() {
        graph=new Graph("/home/mahmoud/Test9.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected9.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected9p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test10() {
        graph=new Graph("/home/mahmoud/Test10.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected10.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected10p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
        Assert.assertFalse(graph.Floyd_warshall(cost,pre));
    }

    @Test
    public void Test11() {
        graph=new Graph("/home/mahmoud/Test11.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected11.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected11pp.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }

    @Test
    public void Test12() {
        graph=new Graph("/home/mahmoud/Test12.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected12.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected12p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test13() {
        graph=new Graph("/home/mahmoud/Test13.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected13.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected13p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test14() {
        graph=new Graph("/home/mahmoud/Test14.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected14.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected14p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test15() {
        graph=new Graph("/home/mahmoud/Test15.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected15.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected15p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test16() {
        graph=new Graph("/home/mahmoud/Test16.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected16.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected16p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
        Assert.assertTrue(graph.Floyd_warshall(cost,pre));
    }
    @Test
    public void Test17() {
        graph=new Graph("/home/mahmoud/Test17.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected17.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected17p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
    @Test
    public void Test18() {
        graph=new Graph("/home/mahmoud/Test18.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected18.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected18p.txt",Expected_p);
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
        Assert.assertTrue(graph.Floyd_warshall(cost,pre));
    }
    @Test
    public void Test19(){
        graph=new Graph("/home/mahmoud/Test19.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[][] Expected_cost = new int[graph.size()][graph.size()];
        int[][] Expected_p = new int[graph.size()][graph.size()];
        read_expected("/home/mahmoud/Expected19.txt",Expected_cost);
        read_expected("/home/mahmoud/Expected19p.txt",Expected_p);
        Assert.assertFalse(graph.Floyd_warshall(cost,pre));
        for (int i = 0; i < Expected_p.length; i++) {
            graph.Floyd_warshall(cost,pre);
            Assert.assertArrayEquals(Expected_cost[i],cost[i]);
            Assert.assertArrayEquals(Expected_p[i],pre[i]);
        }
    }
}
