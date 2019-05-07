

package finalproject;

import java.util.Random;

import finalproject.RandomGraph.GraphNodes;

public class GenerateGraph {

    public static void main(String[] args) {
         Random random = new Random();        
            int num = random.nextInt(300000) + 1;

            RandomGraph graph = new RandomGraph();
            GraphNodes gn = graph.new GraphNodes(0, num);

            for(int i = 0; i < 100000; i++)
            {
                num = random.nextInt(300000) + 1;

                gn.adjacent.add(graph.new GraphNodes(i, num));
            }




    }

    }
