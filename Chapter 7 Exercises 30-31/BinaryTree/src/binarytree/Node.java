
package binarytree;

public class Node
{
	int key;
	String name;
	
	Node leftChild;
	Node rightChild;
	
	public Node(int k, String n)
	{
		this.key = k;
		this.name = n; 
	}
	
        @Override
	public String toString()
	{
		return name + " : " + key; 
	}
}