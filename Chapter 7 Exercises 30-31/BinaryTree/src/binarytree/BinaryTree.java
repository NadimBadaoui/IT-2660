
package binarytree;

 

public class BinaryTree
{
	Node root; 
	
	public void addNode(int key, String name)
	{
		Node nodeToAdd = new Node(key, name); 	
		
		  
		if(root == null)
		{
			root = nodeToAdd;
			System.out.println(nodeToAdd.name + " has been added to the Family Tree as the Root."); 
         System.out.println(); 
		}
		
		
		else
		{
			Node nodeOfFocus = root;
			Node parent; 
			
			while (true)
			{
				parent = nodeOfFocus;
				
				 
				 if(nodeToAdd.key < nodeOfFocus.key)
				{  
					nodeOfFocus = nodeOfFocus.leftChild;
						
					
					 if(nodeOfFocus == null)
					 {
						parent.leftChild = nodeToAdd; 
						return;
					 }
				}
				
				else
				{
					nodeOfFocus = nodeOfFocus.rightChild;
						
					
					 if(nodeOfFocus == null)
					 {     
						parent.rightChild = nodeToAdd;
						return;
					 }
				}		
			}
		}	
	}
	
		public boolean deleteNode(int key)
		{
			Node nodeOfFocus = root;
			Node parent = root; 
			
			
			
			boolean isThisALeftChild = true;
			
			while (nodeOfFocus.key != key)
			{
				parent = nodeOfFocus;  
				
				
				if (key < nodeOfFocus.key)
            {
               isThisALeftChild = true; 
				
				   nodeOfFocus = nodeOfFocus.leftChild;
            }
			else   {
				
				isThisALeftChild = false; 
				
				nodeOfFocus = nodeOfFocus.rightChild; 
			}
			
			if (nodeOfFocus == null)
				return false;
        } 
		
		
			if (nodeOfFocus.leftChild == null && nodeOfFocus.rightChild == null)
			{
				 
				if (nodeOfFocus == root)
					root = null;  
						
				
				else if (isThisALeftChild)
					parent.leftChild = null;
				
				
				else
					parent.rightChild = null; 		
			}
		
		
			else if (nodeOfFocus.rightChild == null)
			{
				if (nodeOfFocus == root)
					root = nodeOfFocus.leftChild;

				
				
				else if (isThisALeftChild) 
					parent.leftChild = nodeOfFocus.leftChild; 
				
				 
				else
					parent.rightChild = nodeOfFocus.leftChild; 
			}
		
			else if (nodeOfFocus.leftChild == null) 
			{
				if (nodeOfFocus == root)   {
					root = nodeOfFocus.rightChild;
				}			
				
				 
				
				else if (isThisALeftChild)   {
					parent.leftChild = nodeOfFocus.rightChild; 
				}
				
				
				else   {
					parent.rightChild = nodeOfFocus.rightChild; 
				}
			}
		
		 
   		else
   			{
   				Node replacementNode = getReplacementNode(nodeOfFocus);
   				
   				if (nodeOfFocus == root)   {
   					root = replacementNode;
   				}
   				
   				
   				else if (isThisALeftChild)   {
   					parent.leftChild = replacementNode; 
   				}
   				
   				
   				else   {
   					parent.rightChild = replacementNode;
   				}
   				
   				replacementNode.leftChild = nodeOfFocus.leftChild; 
   			}
   			return true; 
   		}

		public Node getReplacementNode(Node replacementNode)
		{
			Node replacementParent = replacementNode; 
			Node replacement = replacementNode; 
			
			Node nodeOfFocus = replacementNode.rightChild;
			
			
			while (nodeOfFocus != null)
			{
				replacementParent = replacement;
				replacement = nodeOfFocus; 
				nodeOfFocus = nodeOfFocus.leftChild; 
			}
			
			
			if (replacement != replacementNode.rightChild)
			{
				replacementParent.leftChild = replacement.rightChild; 
				replacement.rightChild = replacementNode.rightChild; 
			}
			return replacement; 	
		}
	
	
         public void inOrderTraversal(Node nodeOfFocus)
         {
            if (nodeOfFocus != null)
			   {
				
				inOrderTraversal(nodeOfFocus.leftChild);
				
				System.out.println(nodeOfFocus); 
				
				
				inOrderTraversal(nodeOfFocus.rightChild); 
			   }
         }

		public Node findNode(int key)
		{
			Node nodeOfFocus = root;
			
			while (nodeOfFocus.key != key)
			{
				if (key < nodeOfFocus.key)   {
					
					nodeOfFocus = nodeOfFocus.leftChild; 
					
				} else   {
					
					nodeOfFocus = nodeOfFocus.rightChild; 
				}

				if (nodeOfFocus == null)
					return null;
			}
			return nodeOfFocus; 
		}

	public static void main(String [] args)
	{
		BinaryTree familyTree = new BinaryTree();
		
		  familyTree.addNode(56, "Sandra");
		  familyTree.addNode(26, "Nate");
		  familyTree.addNode(21, "Marie");
		  familyTree.addNode(88, "Grandma");
		  familyTree.addNode(90, "Grandpa"); 
		  familyTree.addNode(58, "James");  
		  
        System.out.println("Inorder Traversal display of the Family Tree: "); 
		  familyTree.inOrderTraversal(familyTree.root); 
        System.out.println();
        
        System.out.println("Find the Node with the key 58: "); 
        System.out.println(familyTree.findNode(58)); 
        System.out.println();
        
        System.out.println("Delete the Node with the key 58: "); 
        System.out.println(familyTree.deleteNode(58));   
        System.out.println();
        
        System.out.println("Inorder Traversal display of the Family Tree after deletion: ");  
        familyTree.inOrderTraversal(familyTree.root);  
	}

}







 
    

