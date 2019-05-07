
package dijkstra;
import java.util.*;
import java.util.LinkedList;
public class Dijkstra{

  public static void main(String[] arg){
		
		Dijkstra obj = new Dijkstra();
		
		
		Graph g = new Graph(9);
		
		
		g.addEdge(0, 1, 4); g.addEdge(0, 7, 8);
		g.addEdge(1, 2, 8); g.addEdge(1, 7, 11); g.addEdge(2, 1, 8);
		g.addEdge(2, 8, 2); g.addEdge(2, 5, 4); g.addEdge(2, 3, 7);
		g.addEdge(3, 2, 7); g.addEdge(3, 5, 14); g.addEdge(3, 4, 9); 
		g.addEdge(4, 3, 9); g.addEdge(4, 5, 10); 
		g.addEdge(5, 4, 10); g.addEdge(5, 3, 9); g.addEdge(5, 2, 4); g.addEdge(5, 6, 2);
		g.addEdge(6, 7, 1); g.addEdge(6, 8, 6); g.addEdge(6, 5, 2);
		g.addEdge(7, 0, 8); g.addEdge(7, 8, 7); g.addEdge(7, 1, 11); g.addEdge(7, 6, 1);
		g.addEdge(8, 2, 2); g.addEdge(8, 7, 7); g.addEdge(8, 6, 6);
		
		
		obj.calculate(g.getVertex(0));	

		
		for(Vertex v:g.getVertices()){
			System.out.print("Vertex: "+v+", Dist: "+ v.minDistance + ", Path: ");
                        v.path.forEach((pathvert) -> {
                            System.out.print(pathvert+" ");
                    });
			System.out.println(""+v);
		}

	}

	public void calculate(Vertex source){
		
		
		source.minDistance = 0;
		PriorityQueue<Vertex> queue = new PriorityQueue<>();
		queue.add(source);
		
		while(!queue.isEmpty()){
			
			Vertex u = queue.poll();
		
                        u.neighbours.forEach((neighbour) -> {
                            Double newDist = u.minDistance+neighbour.weight;
                        if (neighbour.target.minDistance>newDist) {
                            queue.remove(neighbour.target);
                            neighbour.target.minDistance = newDist;
                            
                            
                            neighbour.target.path = new LinkedList<>(u.path);
                            neighbour.target.path.add(u);
                            
                            
                            queue.add(neighbour.target);
                        }
                    });
		}
        }
}





