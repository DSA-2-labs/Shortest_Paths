package src.Tests;
import org.junit.Test;
import src.CreateGraphs.Graph;

import static org.junit.Assert.*;

public class Floyd_Tests {
    private Graph graph;
    private int[][] cost;
    private int[][] pre;
    @Test
    public void Test1()
    {
        graph=new Graph("/home/mahmoud/Test1.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];

    }
    @Test
    public void Test2()
    {
        graph=new Graph("/home/mahmoud/Test2.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
    }
    @Test
    public void Test3()
    {
        graph=new Graph("/home/mahmoud/Test3.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
    }
    @Test
    public void Test4()
    {
        graph=new Graph("/home/mahmoud/Test4.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        graph.Floyd_warshall(cost,pre);

        assertArrayEquals(new int[][]{{0,5,2,8,6},{Integer.MAX_VALUE,0,7,3,1},{Integer.MAX_VALUE,Integer.MAX_VALUE,0,6,4},{Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,0,10},{Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,0}},cost);
    }
    @Test
    public void Test5()
    {
        graph=new Graph("/home/mahmoud/Test5.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];


    }
    @Test
    public void Test6()
    {
        graph=new Graph("/home/mahmoud/Test6.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
    }
    @Test
    public void Test7()
    {
        graph=new Graph("/home/mahmoud/Test7.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
    }
    @Test
    public void Test8()
    {
        graph=new Graph("/home/mahmoud/Test8.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
    }
    @Test
    public void Test9()
    {
        graph=new Graph("/home/mahmoud/Test9.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
    }
    @Test
    public void Test10()
    {
        graph=new Graph("/home/mahmoud/Test10.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
    }
    @Test
    public void Test11()
    {
        graph=new Graph("/home/mahmoud/Test11.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
    }
    @Test
    public void Test12()
    {
        graph=new Graph("/home/mahmoud/Test12.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
    }
    @Test
    public void Test13()
    {
        graph=new Graph("/home/mahmoud/Test13.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
    }
    @Test
    public void Test14()
    {
        graph=new Graph("/home/mahmoud/Test14.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
    }
    @Test
    public void Test15()
    {
        graph=new Graph("/home/mahmoud/Test15.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
    }
    @Test
    public void test16() {
        //test floyd on small graph
        long start = System.nanoTime();
        graph = new Graph("/home/mahmoud/Downloads/test1.txt");
        long finish = System.nanoTime();
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        assertTrue(graph.Floyd_warshall(cost,pre));
        for (int i = 0; i < cost.length; i++) {
            assertTrue(cost[i][i] == 0);
            assertTrue(pre[i][i] == -1);
        }
        assertTrue(cost[0][1] == 3);
        assertTrue(cost[0][2] == 5);
        assertTrue(cost[0][3] == 6);
        assertTrue(cost[1][0] == 5);
        assertTrue(cost[1][2] == 2);
        assertTrue(cost[1][3] == 3);
        assertTrue(cost[2][0] == 3);
        assertTrue(cost[2][1] == 6);
        assertTrue(cost[2][3] == 1);
        assertTrue(cost[3][0] == 2);
        assertTrue(cost[3][1] == 5);
        assertTrue(cost[3][2] == 7);
        assertTrue(pre[0][1] == 0);
        assertTrue(pre[0][2] == 1);
        assertTrue(pre[0][3] == 2);
        assertTrue(pre[1][0] == 3);
        assertTrue(pre[1][2] == 1);
        assertTrue(pre[1][3] == 2);
        assertTrue(pre[2][0] == 3);
        assertTrue(pre[2][1] == 0);
        assertTrue(pre[2][3] == 2);
        assertTrue(pre[3][0] == 3);
        assertTrue(pre[3][1] == 0);
        assertTrue(pre[3][2] == 1);
        System.out.println(finish - start);
    }
    @Test
    public void test2() {
        //test floyd and bellman on a less dense graph with negative edges

        graph = new Graph("/home/mahmoud/Downloads/test2.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[] bellman_cost=new int[graph.size()];
        boolean once = true ;
        long mean_time_all_pairs = 0;
        long start = System.nanoTime();
        assertTrue(graph.Floyd_warshall(cost, pre));
        long finish = System.nanoTime();
        for (int i = 0; i < graph.size(); i++) {
            graph.bellmanFord(i, bellman_cost, new int[graph.size()]);

            //System.out.println("Test 2 Bellman-Ford mean time 2 specific nodes : " +(graph1.calc_mean_time_bellman()));
            if(once){
                //System.out.println("Test 2 Bellman-Ford mean time 2 specific nodes : " +(graph1.calc_mean_time_bellman()));
                once = false;
            }
//            mean_time_all_pairs += graph1.calc_mean_time_bellman();
            for (int j = 0; j < graph.size(); j++) {
                assertTrue(cost[i][j] == bellman_cost[j]);
            }
        }
//        System.out.println("Test 2 Bellman-Ford all pairs mean time : "+(mean_time_all_pairs/graph.size()));
        System.out.println("Test 2 FLoyd mean time : "+(finish - start));
    }
    @Test
    public void test17() {
        //testing floyd and bellman on a less dense graph with positive edge
        graph = new Graph("/home/mahmoud/Downloads/test3.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        int[] bellman_cost=new int[graph.size()];
        long start = System.nanoTime();
        boolean once = true ;
        assertTrue(graph.Floyd_warshall(cost, pre));
        long finish = System.nanoTime();
        for (int i = 0; i < graph.size(); i++) {
            assertTrue(graph.bellmanFord(i, bellman_cost, new int[graph.size()]));
            if(once){
//                System.out.println("Test 3 Bellman-Ford mean time 2 specific nodes : " +(graph1.calc_mean_time_bellman()));
                once = false;
            }
//            mean_time_all_pairs += graph.calc_mean_time_bellman();
            for (int j = 0; j < graph.size(); j++) {
                assertEquals(cost[i][j] , bellman_cost[j]);
            }
            System.out.println();
        }
//        System.out.println("Test 3 Bellman-Ford all pairs mean time : "+(mean_time_all_pairs/graph1.getV()));
        System.out.println("Test 3 FLoyd mean time : "+(finish - start));
    }
    @Test
    public void test18() {
        //testing floyd negative cycle detection
        graph = new Graph("/home/mahmoud/Downloads/test4.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        assertFalse(graph.Floyd_warshall(cost, pre));
    }
    @Test
    public void test19() {
        //testing floyd negative cycle detection
        graph = new Graph("/home/mahmoud/Downloads/test4.txt");
        cost=new int[graph.size()][graph.size()];
        pre=new int[graph.size()][graph.size()];
        for (int i = 0; i < cost.length; i++) {
            for (int j = 0; j < cost[i].length; j++) {
                assertTrue(cost[i][j]<=0);
            }
        }
    }
}
