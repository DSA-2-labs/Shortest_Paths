package src;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import src.CreateGraphs.Graph;


public class cli {
    Scanner x = new Scanner(System.in);
    Graph g;

    public cli() {
        Graph gg = new Graph();

        this.g = gg;
        this.choose_function_menu();
    }


    void show_algo_menu(int source) {
        int choice = 0;

        while (true) {
            try {
                System.out.print("List of valid Algorithms\n\n1-Dijkstra\n\n2-Bellman-Ford\n\n3-Floyd-Warshall\n\nEnter your choice (1,2,3) : ");
                choice = x.nextInt();
                if (choice == 1 || choice == 2 || choice == 3) {
                    evaluate(choice, source);
                } else {
                    System.out.print("\n\nInvalid Choice");
                    continue;
                }
                break;
            } catch (InputMismatchException ee) {
                System.out.print("\n\nInvalid Choice");
                x.next();
            }
        }
    }
    void show_algo_menu2() {
        int choice = 0;
        while (true) {
            try {
                System.out.print("\n\n1List of valid Algorithms\\n\n1-Bellman-Ford\n\n2-Floyd-Warshall\n\nEnter your choice (1,2) : ");
                choice = x.nextInt();
                if (choice == 1) {
                    if (!g.bellmanFord(0, new int[g.size()], new int[g.size()]))
                        System.out.println("yes,there is negative cycle");
                    else
                        System.out.println("no,there is not negative cycle");


                } else if (choice == 2) {
                    if (!g.Floyd_warshall(new int[g.size()][g.size()], new int[g.size()][g.size()]))
                        System.out.println("yes,there is negative cycle");
                    else
                        System.out.println("no,there is not negative cycle");

                } else {
                    System.out.print("\n\nInvalid Choice");
                    continue;
                }
                choose_function_menu();

                break;
            } catch (InputMismatchException ee) {
                System.out.print("\n\nInvalid Choice");
                x.next();
            }
        }
    }
    void choose_source_menu() {
        while (true) {
            try {
                System.out.print("\nEnter the source node : ");
                int source = x.nextInt();
                if (source > g.size() - 1 || source < 0) {
                    System.out.print("Non Existing Node");
                    continue;
                }
                show_algo_menu(source);
                break;
            } catch (InputMismatchException ee) {
                System.out.print("Invalid node name\n");
                x.next();
            }
        }
    }
    void choose_function_menu() {
        int choice = 0;
        while (true) {
            try {
                System.out.print("\n\nList of functionalities\n\n1-Find the shortest path from a source node\n\n2-Find the shortest path between all pairs of nodes\n\n3-check if a negative cycle exist\n\nEnter your choice (1,2,3) : ");
                choice = x.nextInt();
                if (choice == 1) {
                    choose_source_menu();
                    break;
                } else if (choice == 2) {
                    show_algo_menu(-1);

                    break;
                } else if (choice == 3) {
                    show_algo_menu2();
                    break;
                } else
                    System.out.print("\n\nInvalid Choice");
            } catch (InputMismatchException ee) {
                System.out.print("\n\nInvalid Choice");
                x.next();
            }
        }
    }
    void evaluate(int choice, int source) {
        int[][] costs = new int[g.size()][g.size()];
        int[][] p = new int[g.size()][g.size()];
        if (source == -1) {
            if (choice == 1) {
                for (int i = 1; i <= g.size(); i++) g.dijkestra(i - 1, costs[i - 1], p[i - 1]);
            } else if (choice == 2) {
                for (int i = 1; i <= g.size(); i++)
                    g.bellmanFord(i - 1, costs[i - 1], p[i - 1]);

            } else if (choice == 3) {
                g.Floyd_warshall(costs, p);

            }
        } else {
            if (choice == 1) {
                g.dijkestra(source, costs[source], p[source]);
            } else if (choice == 2) {
                g.bellmanFord(source, costs[source], p[source]);
            } else if (choice == 3) {
                g.Floyd_warshall(costs, p);
            }
        }

        if (source == -1) {
            specific_source_node(source, costs, p);
        } else {
            specific_destination_node(source, costs, p, 0);
        }
    }
    void specific_source_node(int source, int[][] costs, int[][] p) {
        while (true) {
            try {
                System.out.print("\n\nEnter Specific Source Node(insert -1 to return to the main menu):");
                int sc = x.nextInt();
                if (sc < -1 || sc > g.size()) {
                    System.out.println("\n\nInvalid");
                    continue;
                }
                if (sc == -1)
                    choose_function_menu();
                else specific_destination_node(sc, costs, p, 1);
                break;
            } catch (InputMismatchException ee) {
                System.out.print("\n\nInvalid Node Try Again");
            }
        }
    }

    void specific_destination_node(int source, int[][] costs, int[][] p, int is_source_needed) {
        while (true) {
            try {
                System.out.print("\n\nEnter Specific Destination Node(insert -1 to return to the main menu):");
                int des = x.nextInt();
                if (des < -1 || des >= g.size()) {
                    System.out.println("\n\nInvalid");
                    continue;
                }
                if (des == -1)
                    choose_function_menu();
                else {
                    path_or_cost(source, des, costs, p);
                    if (is_source_needed == 1)
                        specific_source_node(-1, costs, p);
                    else specific_destination_node(source, costs, p, is_source_needed);
                }
                break;
            } catch (InputMismatchException ee) {
                System.out.print("\n\nInvalid Node Try Again");
            }
        }
    }

    void path_or_cost(int source, int destination, int[][] costs, int[][] p) {
        while (true) {
            System.out.print("\n\ninsert p for shortest path , c for minimum cost , -1 for returning to the main menu :");
            String sc = x.next();
            if (!sc.equals("p") && !sc.equals("c") && !sc.equals("-1")) {
                System.out.println("\n\nInvalid");
                continue;
            }
            if (sc.equals("c")) {
                if (costs[source][destination] == Integer.MAX_VALUE)
                    System.out.println("\n\nthere is no path from " + source + "to" + destination);
                else
                    System.out.println("\n\n" + costs[source][destination]);
            } else if (sc.equals("p")) {
                if (costs[source][destination] == Integer.MAX_VALUE)
                    System.out.println("\n\nthere is no path from " + source + "to" + destination);
                else
                    System.out.println("\n\n" + get_path(source, destination, costs, p));
            } else
                choose_function_menu();
            break;
        }
    }

    String get_path(int source, int destination, int[][] costs, int[][] p) {
        if (source == destination)
            return String.valueOf(source);
        else return   get_path(source, p[source][destination], costs, p)+"=>"+destination  ;
    }
}
