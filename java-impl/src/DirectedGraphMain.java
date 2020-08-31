import java.util.Scanner;

public class DirectedGraphMain {
 public static void main(String[] args) {
  try {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter total number of nodes.");
   Integer nodes = s.nextInt();
   DirectedGraph g = new DirectedGraph(nodes);
   for (int i = 0; i < nodes - 1; i++) {
    System.out.println("Enter source and destination");
    Integer source = s.nextInt();
    Integer destination = s.nextInt();

    g.addEdge(source, destination);
   }

   g.printGraph();
   s.close();
  } catch (Exception exc) {
   exc.printStackTrace();
  }
 }
}