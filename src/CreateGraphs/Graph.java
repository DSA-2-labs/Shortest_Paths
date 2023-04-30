package src.CreateGraphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Graph {
    private static final int INF = Integer.MAX_VALUE;
    private int V, E;
    private Edge[] edges;
    Map<Integer, ArrayList<int[]>> adjList = new HashMap<>(V);

    public Graph(String filename) {
        try {
            Scanner scan = new Scanner(new File(filename));
            V = scan.nextInt();
            E = scan.nextInt();
            edges = new Edge[E];
            for (int i = 0; i < E; i++) {
                edges[i] = new Edge(scan.nextInt(), scan.nextInt(), scan.nextInt());
                int x = edges[i].getFrom();
                int y = edges[i].getTo();
                int w = edges[i].getW();
                if(!adjList.containsKey(x)) {
                    adjList.put(x, new ArrayList<>());
                }
                adjList.get(x).add(new int[] {y, w});
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Graph() {
        Scanner input = new Scanner(System.in);
        while (true) {
            int Error = 0;
            System.out.print("Enter the path of the File that contain the Graph : ");
            String s = input.nextLine();
            try {
                Scanner scan = new Scanner(new File(s));
                V = scan.nextInt();
                E = scan.nextInt();
                edges = new Edge[E];
                for (int i = 0; i < E; i++) {
                    edges[i] = new Edge(scan.nextInt(), scan.nextInt(), scan.nextInt());
                    int x = edges[i].getFrom();
                    int y = edges[i].getTo();
                    int w = edges[i].getW();
                    if(!adjList.containsKey(x)) {
                        adjList.put(x, new ArrayList<>());
                    }
                    adjList.get(x).add(new int[] {y, w});
                    Error = 0;
                }
                scan.close();
            } catch (FileNotFoundException e) {
                System.out.print("\nOops Wrong path \n");
                Error = 1;
            }
            if (Error == 0) {
                break;
            }
        }
    }

    public int size() {
        return V;
    }

    public boolean bellmanFord(int src, int[] cost, int[] p) {
        Arrays.fill(cost, INF);
        Arrays.fill(p, -1);
        cost[src] = 0;
        for (int i = 0; i < V - 1; i++) {
            for (int j = 0; j < E; j++) {
                int u = edges[j].getFrom();
                int v = edges[j].getTo();
                int w = edges[j].getW();
                if (cost[u] != INF && cost[u] + w < cost[v]) {
                    cost[v] = Math.max(-INF, cost[u] + w);//for overflow
                    p[v] = u;
                }
            }
        }
        //check negative cycle
        for (int i = 0; i < E; i++) {
            int u = edges[i].getFrom();
            int v = edges[i].getTo();
            int w = edges[i].getW();
            if (cost[u] != INF && cost[u] + w < cost[v]) {
                return false;
            }
        }
        return true;
    }

    public void dijkestra(int src, int[] cost, int[] p) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        Arrays.fill(cost, INF);
        Arrays.fill(p, -1);
        cost[src] = 0;
        boolean[] visited = new boolean[V];
        visited[src] = true;
        minHeap.offer(new int[]{src, 0});
        while(!minHeap.isEmpty()) {
            int[] min = minHeap.poll();
            int minNode = min[0], minCost = min[1];
            visited[minNode]= true;
            List<int[]> neighbors = adjList.get(minNode);
            if (neighbors != null) {
                for (int[] neighbor : neighbors) {
                    int neighborNode = neighbor[0], neighborCost = neighbor[1];
                    if (!visited[neighborNode] && minCost != INF && neighborCost != INF && minCost + neighborCost < cost[neighborNode]) {
                        cost[neighborNode] = minCost + neighborCost;
                        p[neighborNode] = minNode;
                        minHeap.offer(new int[]{neighborNode, cost[neighborNode]});
                    }
                }
            }
        }
    }

    public boolean Floyd_warshall(int[][] costs, int[][] predecessors) {
        for (int i = 0; i < V; i++) {
            Arrays.fill(costs[i], INF);
            Arrays.fill(predecessors[i], -1);
        }
        for (Edge edge : edges) {
            costs[edge.getFrom()][edge.getTo()] = edge.getW();
            predecessors[edge.getFrom() ][edge.getTo()] = edge.getFrom();
        }
        for (int i = 0; i < V; i++) {
            costs[i][i] = 0;
        }
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (costs[i][k] != INF && costs[k][j] != INF && costs[i][j] > costs[i][k] + costs[k][j]) {
                        costs[i][j] = costs[i][k] + costs[k][j];
                        predecessors[i][j] = predecessors[k][j];
                    }
                }
            }
        }
        for (int i = 0; i < costs.length; i++) {
            if (costs[i][i] < 0) {
                return false;
            }
        }
        return true;
    }


    public boolean is_there_negative_edge() {
        for (Edge edge : edges) {
            if (edge.getW() < 0)
                return true;
        }
        return false;
    }
}
