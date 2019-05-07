

package finalproject;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;

public class RandomGraph{

public HashMap<Integer,GraphNodes> nodeLookup = new HashMap<>();

public class GraphNodes
{
public int Nodeid;
public int Nodevaule;

LinkedList<GraphNodes> adjacent = new LinkedList<>();

GraphNodes(int Nodeid, int Nodevalue)
{
this.Nodeid = Nodeid;
this.Nodeid = Nodevalue;

}

public GraphNodes getGraphNodes(int Nodeid)
{
GraphNodes sn = nodeLookup.get(Nodeid);
return sn;
}

public void addEdge(int sourceNode, int destinationNode)
{
GraphNodes sn = getGraphNodes(sourceNode);
GraphNodes dn = getGraphNodes(destinationNode);

sn.adjacent.add(dn);

}


public boolean hasPathDFS(int sourceNode, int destinationNode)
{
GraphNodes sn = getGraphNodes(sourceNode);
GraphNodes dn = getGraphNodes(destinationNode);


HashSet<Integer> visited = new HashSet<>();
return hasPathDFS(sn, dn, visited);
}


public boolean hasPathDFS(GraphNodes sourceNode, GraphNodes destinationNode, HashSet<Integer> visited)
{
if(visited.contains(sourceNode.Nodeid))
{
return false;
}

visited.add(sourceNode.Nodeid);
if(sourceNode == destinationNode)
{
return true;
}

    if (sourceNode.adjacent.stream().anyMatch((child) -> (hasPathDFS(child, destinationNode, visited)))) {
        return true;
    } else {
    }
return false;
}

public boolean hasPathBFS(GraphNodes sourceNode, GraphNodes destinationNode)
{
LinkedList<GraphNodes> nextToVisit = new LinkedList<>();
HashSet<Integer> visited = new HashSet<>();
nextToVisit.add(sourceNode);

while(!nextToVisit.isEmpty())
{
GraphNodes graphNodes = nextToVisit.remove();

if(graphNodes == destinationNode)
{
return true;
}

if(visited.contains(graphNodes.Nodeid))
{
continue;
}

visited.add(graphNodes.Nodeid);

graphNodes.adjacent.forEach((child) -> {
    nextToVisit.add(child);
    });
}

return false;
}
}

}