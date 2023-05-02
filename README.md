# Shortest Paths Algorithms
This is the implementation three shortest paths algorithms for directed weighted graphs which are Dijkstra, Bellman-Ford and Floyd-Warshall.

## 1. Introduction

### 1.1 Dijkstra Algorithm
<p>
  This algorithm finds shortest paths from the source to all other nodes in the graph, producing a shortest path tree. Its time complexity is O(V<sup>2</sup>) but can reach less than that when using priority queue. Dijkstra algorithm can’t handle negative weights. But, it is asymptotically the fastest known single-source shortest path algorithm for arbitrary directed graphs with unbounded non-negative weights.
</p>
 
### 1.2 Bellman-Ford Algorithm
<p>
  The Bellman-Ford algorithm is an algorithm that computes shortest paths from a single source vertex to all of the other vertices in a weighted directed graph. It is capable of handling graphs in which some of the edge weights are negative numbers. It works in O(V ∗ E) time and O(V ) space complexities where V is the number of vertices and E is the number of edges in the graph. It can detect the presence of a negative cycle in the graph.
</p>

### 1.3 Floyd-Warshall Algorithm
<p>
  The Floyd–Warshall algorithm is an algorithm for finding shortest paths in a directed weighted graph with positive or negative edge weights. A single execution of the algorithm will find the lengths of shortest paths between all pairs of vertices. It works in O(V<sup>3</sup>) time complexity. It can detect the presence of a negative cycle in the graph.
</p>

### 1.4 Input Graph Structure
<p>
  A Graph input file will contain several lines that describe a directed graph structure as follows. First line contains two integers V and E which determine number of vertices and edges respectively. This line is followed by E lines describing the edges in the graph. Each of the E lines contain 3 numbers: i, j, w separated by a single space, meaning that there is a weighted edge from vertex i to vertex j (0 ≤ i, j ≤ V − 1), and the weight of the edge is w, where w may be negative or positive.
</p>

## 2. Implementation

### 2.1 Graph Algorithms
<p>
  A Graph class is implemented that can encapsulate a graph structure and apply different shortest paths algorithms on it. The following methods are implemented  in this class:<br>
1. Initialize (constructor): Takes a path to graph input file structured as described in section 1.4, reads it and initialize the graph structure.<br>
2. Size: Returns the number of nodes in the graph.<br>
3. Dijkestra: Takes 3 parameters which are the source node, the costs array and the parents array. Then applies dijkestra algorithm starting from the source node filling the costs array with the cost of the shortest path to all other target nodes and the parents array with the parent of each node in the shortest paths tree.<br>
4. Bellman-Ford: Takes 3 parameters which are the source node, the costs array and the parents array. Then applies bellman-ford algorithm starting from the source node filling the costs array with the cost of the shortest path to all other target nodes and the parents array with the parent of each node in the shortest paths tree. Returns False if a negative cycle is found and True otherwise.<br>
5. Floyd-Warshall: Takes 2 parameters which are the costs matrix and the predecessors matrix. Then applies floyd-warshall algorithm filling the costs matrix with the cost of the shortest path between all pairs of nodes and the predecessors matrix with the appropriate values to reconstruct the paths. Returns False if a negative cycle is found and True otherwise.<br>
</p>

### 2.2 Command Line Interface
<p>
  A command line interface is implemented that enables us to deal with the implemented graph. This interface takes the path of the file describing the graph structure as an initial input then creates a graph object using it. The interface will be composed of a main menu and 2 sub-menus which allow the user to apply subsequent operations on the graph from the following list:<br>
  1. Finds the shortest paths from source node to all other nodes. You should ask for the source node and then allow the user to choose 1 of the 3 algorithms to run. Now, the 2 arrays sent to the algorithm are saved and the user can only ask for the cost of the path to a specific node or the path itself until he decides to exit this operation sub-menu and return to the main menu.<br>
  2. Finds the shortest paths between all the pairs of nodes. You should allow the user to choose 1 of the 3 algorithms to run. Now, all the arrays sent to the algorithm are saved and the user can only ask for the cost of a path from a specific node to another one or the path itself until he decides to exit this operation sub-menu and return to the main menu.<br>
  3. Check if the graph contains a negative cycle. You should allow the user to choose 1 of the 2 algorithms to run and show the result.<br>
