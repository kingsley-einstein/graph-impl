import java.util.ArrayList;

public class DirectedGraph implements Graph {
 Integer nodes = 0;
 ArrayList<ArrayList<Integer>> graph;

 public DirectedGraph(Integer nodes) {
  this.nodes = nodes - 1;
  this.graph = new ArrayList<ArrayList<Integer>>();
  for (int i = 0; i < this.nodes; i++)
   graph.add(i, new ArrayList<Integer>());
 }

 public void addEdge(Integer source, Integer destination) {
  graph.get(source).add(destination);
 }

 public void printGraph() {
  for (int i = 0; i < nodes; i++) {
   if (graph.get(i).size() > 0) {
    System.out.print(i + " => ");
    for (int j = 0; j < graph.get(i).size(); j++)
     System.out.print(graph.get(i).get(j) + " ");
    System.out.println();
   }
  }
 }
}