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
}
