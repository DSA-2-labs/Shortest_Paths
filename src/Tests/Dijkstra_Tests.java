package src.Tests;
import org.junit.Assert;
import org.junit.Test;
import src.CreateGraphs.Graph;

import static org.junit.Assert.*;

public class Dijkstra_Tests {
    final int INF=Integer.MAX_VALUE;
    private Graph graph;
    private int[] cost;
    private int[] parents;
//    @Test
//    public void Test1()
//    {
//        graph=new Graph("C:/Users/Dell/Downloads/Telegram Desktop/Test1.txt");
//        cost=new int[graph.size()];
//        parents=new int[graph.size()];
//        int[][] floydCost = new int[graph.size()][graph.size()];
//        int[][] floydPre = new int[graph.size()][graph.size()];
//        graph.Floyd_warshall(floydCost, floydPre);
//        for(int i = 0; i < graph.size(); i++) {
//            graph.dijkestra(i, cost, parents);
//            assertArrayEquals(floydCost[i], cost);
//            assertArrayEquals(floydPre[i], parents);
//        }
//    }
//    @Test
//    public void Test2()
//    {
//        graph=new Graph("/home/mahmoud/Test2.txt");
//        cost=new int[graph.size()];
//        parents=new int[graph.size()];
//        graph.dijkestra(0,cost,parents);
//        assertArrayEquals(new int[]{0, 2, -4, 6},cost);
//    }
//    @Test
//    public void Test3()
//    {
//        graph=new Graph("/home/mahmoud/Test3.txt");
//        cost=new int[graph.size()];
//        parents=new int[graph.size()];
//    }
    @Test
    public void Test4()
    {
        graph=new Graph("C:/Users/Dell/Downloads/Telegram Desktop/Test4.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] floydCost = new int[graph.size()][graph.size()];
        int[][] floydPre = new int[graph.size()][graph.size()];
        graph.Floyd_warshall(floydCost, floydPre);
        for(int i = 0; i < graph.size(); i++) {
            System.out.println(i);
            graph.dijkestra(i, cost, parents);
            assertArrayEquals(floydCost[i], cost);
//            assertArrayEquals(floydPre[i], parents);

        }
    }
    @Test
    public void Test5()
    {
        graph=new Graph("C:/Users/Dell/Downloads/Telegram Desktop/Test5.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] floydCost = new int[graph.size()][graph.size()];
        int[][] floydPre = new int[graph.size()][graph.size()];
        graph.Floyd_warshall(floydCost, floydPre);
        for(int i = 0; i < graph.size(); i++) {
            graph.dijkestra(i, cost, parents);
            assertArrayEquals(floydCost[i], cost);
//            assertArrayEquals(floydPre[i], parents);
        }
    }
    @Test
    public void Test6()
    {
        graph=new Graph("C:/Users/Dell/Downloads/Telegram Desktop/Test6.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] floydCost = new int[graph.size()][graph.size()];
        int[][] floydPre = new int[graph.size()][graph.size()];
        graph.Floyd_warshall(floydCost, floydPre);
        for(int i = 0; i < graph.size(); i++) {
            graph.dijkestra(i, cost, parents);
            assertArrayEquals(floydCost[i], cost);
        }
    }
    @Test
    public void Test7()
    {
        graph=new Graph("C:/Users/Dell/Downloads/Telegram Desktop/Test7.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] floydCost = new int[graph.size()][graph.size()];
        int[][] floydPre = new int[graph.size()][graph.size()];
        graph.Floyd_warshall(floydCost, floydPre);
        for(int i = 0; i < graph.size(); i++) {
            graph.dijkestra(i, cost, parents);
            assertArrayEquals(floydCost[i], cost);
        }
    }
    @Test
    public void Test8()
    {
        graph=new Graph("C:/Users/Dell/Downloads/Telegram Desktop/Test8.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] floydCost = new int[graph.size()][graph.size()];
        int[][] floydPre = new int[graph.size()][graph.size()];
        graph.Floyd_warshall(floydCost, floydPre);
        for(int i = 0; i < graph.size(); i++) {
            graph.dijkestra(i, cost, parents);
            assertArrayEquals(floydCost[i], cost);
        }
    }
//    @Test
//    public void Test9()
//    {
//        graph=new Graph("/home/mahmoud/Test9.txt");
//        cost=new int[graph.size()];
//        parents=new int[graph.size()];
//    }
//    @Test
//    public void Test10()
//    {
//        graph=new Graph("/home/mahmoud/Test10.txt");
//        cost=new int[graph.size()];
//        parents=new int[graph.size()];
//    }
    @Test
    public void Test11()
    {
        graph=new Graph("C:/Users/Dell/Downloads/Telegram Desktop/Test11.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] floydCost = new int[graph.size()][graph.size()];
        int[][] floydPre = new int[graph.size()][graph.size()];
        graph.Floyd_warshall(floydCost, floydPre);
        for(int i = 0; i < graph.size(); i++) {
            graph.dijkestra(i, cost, parents);
            assertArrayEquals(floydCost[i], cost);
        }
    }
    @Test
    public void Test12()
    {
        graph=new Graph("C:/Users/Dell/Downloads/Telegram Desktop/Test12.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] floydCost = new int[graph.size()][graph.size()];
        int[][] floydPre = new int[graph.size()][graph.size()];
        graph.Floyd_warshall(floydCost, floydPre);
        for(int i = 0; i < graph.size(); i++) {
            graph.dijkestra(i, cost, parents);
            assertArrayEquals(floydCost[i], cost);
        }
    }
    @Test
    public void Test13()
    {
        graph=new Graph("C:/Users/Dell/Downloads/Telegram Desktop/Test13.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] floydCost = new int[graph.size()][graph.size()];
        int[][] floydPre = new int[graph.size()][graph.size()];
        graph.Floyd_warshall(floydCost, floydPre);
        for(int i = 0; i < graph.size(); i++) {
            graph.dijkestra(i, cost, parents);
            assertArrayEquals(floydCost[i], cost);
        }
    }
    @Test
    public void Test14()
    {
        graph=new Graph("C:/Users/Dell/Downloads/Telegram Desktop/Test14.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] floydCost = new int[graph.size()][graph.size()];
        int[][] floydPre = new int[graph.size()][graph.size()];
        graph.Floyd_warshall(floydCost, floydPre);
        for(int i = 0; i < graph.size(); i++) {
            graph.dijkestra(i, cost, parents);
            assertArrayEquals(floydCost[i], cost);
        }
    }
    @Test
    public void Test15()
    {
        graph=new Graph("C:/Users/Dell/Downloads/Telegram Desktop/Test15.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        int[][] floydCost = new int[graph.size()][graph.size()];
        int[][] floydPre = new int[graph.size()][graph.size()];
        graph.Floyd_warshall(floydCost, floydPre);
        for(int i = 0; i < graph.size(); i++) {
            graph.dijkestra(i, cost, parents);
            assertArrayEquals(floydCost[i], cost);
        }
    }

    @Test
    public void Test16()
    {
        graph=new Graph("C:/Users/Dell/Downloads/Telegram Desktop/Test16.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        graph.dijkestra(0, cost, parents);
        assertArrayEquals(cost, new int[] {0,3,0});
    }

    @Test
    public void Test17()
    {
        graph=new Graph("C:/Users/Dell/Downloads/Telegram Desktop/Test17.txt");
        cost=new int[graph.size()];
        parents=new int[graph.size()];
        graph.dijkestra(0, cost, parents);
        assertArrayEquals(cost, new int[] {0,3,0});
    }

//    @Test
//    void test16() {
//        //test floyd on small graph
//        long start = System.nanoTime();
//        graph = new Graph("/home/mahmoud/Downloads/test1.txt");
//        long finish = System.nanoTime();
//        cost=new int[graph.size()];
//        parents=new int[graph.size()];
//        assertFalse(graph.floydWarshall(graph.original_costs_matrix, graph));
//
//        for (int i = 0; i < graph1.after_floyd_costs_matrix.length; i++) {
//            assertTrue(graph1.after_floyd_costs_matrix[i][i] == 0);
//            assertTrue(graph1.after_floyd_pred[i][i] == -1);
//        }
//        assertTrue(graph1.after_floyd_costs_matrix[0][1] == 3);
//        assertTrue(graph1.after_floyd_costs_matrix[0][2] == 5);
//        assertTrue(graph1.after_floyd_costs_matrix[0][3] == 6);
//        assertTrue(graph1.after_floyd_costs_matrix[1][0] == 5);
//        assertTrue(graph1.after_floyd_costs_matrix[1][2] == 2);
//        assertTrue(graph1.after_floyd_costs_matrix[1][3] == 3);
//        assertTrue(graph1.after_floyd_costs_matrix[2][0] == 3);
//        assertTrue(graph1.after_floyd_costs_matrix[2][1] == 6);
//        assertTrue(graph1.after_floyd_costs_matrix[2][3] == 1);
//        assertTrue(graph1.after_floyd_costs_matrix[3][0] == 2);
//        assertTrue(graph1.after_floyd_costs_matrix[3][1] == 5);
//        assertTrue(graph1.after_floyd_costs_matrix[3][2] == 7);
//        assertTrue(graph1.after_floyd_pred[0][1] == 0);
//        assertTrue(graph1.after_floyd_pred[0][2] == 1);
//        assertTrue(graph1.after_floyd_pred[0][3] == 2);
//        assertTrue(graph1.after_floyd_pred[1][0] == 3);
//        assertTrue(graph1.after_floyd_pred[1][2] == 1);
//        assertTrue(graph1.after_floyd_pred[1][3] == 2);
//        assertTrue(graph1.after_floyd_pred[2][0] == 3);
//        assertTrue(graph1.after_floyd_pred[2][1] == 0);
//        assertTrue(graph1.after_floyd_pred[2][3] == 2);
//        assertTrue(graph1.after_floyd_pred[3][0] == 3);
//        assertTrue(graph1.after_floyd_pred[3][1] == 0);
//        assertTrue(graph1.after_floyd_pred[3][2] == 1);
//        System.out.println(finish - start);
//    }

}
