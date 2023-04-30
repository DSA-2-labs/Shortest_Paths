package src;

import src.CreateGraphs.Graph;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph("C:/Users/Dell/Downloads/Telegram Desktop/adel.txt");
        g.print();
        int[][] cost = new int[g.size()][g.size()];
        int[][] p = new int[g.size()][g.size()];

        System.out.println(g.Floyd_warshall(cost,p));
//        System.out.println(cost[45][45]);
//        System.out.println("------------------------------");
//        for (int i = 0; i < cost.length; i++) {
//            for (int j = 0; j < cost.length; j++) {
//                System.out.print(cost[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("\n");
//        }
//        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < cost.length; i++) {
            for (int j = 0; j < cost.length; j++) {
                System.out.print(p[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }

//    cli c = new cli();
//    }

}
