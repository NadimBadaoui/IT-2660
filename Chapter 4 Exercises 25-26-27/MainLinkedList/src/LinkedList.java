public class LinkedList
{
	private Node Root;	
	private Node Last;
	private int Size;		
	
    
	public LinkedList(Node node)		
   {
		Root = node; 
		Last = node; 
		Size = 1; 
	}
	
   public Node getNodeAtPosition(int position)
   {
      Node walker = Root;                       
      
      for(int i = 0; i < position; i++) {
         walker = walker.getNextNode();
      }

      return walker;
   }
   
	public Node insertNodeAtPosition(Node newNode, int position) 
	{
       
      if (position == 0)  {
         return newRoot(newNode);
      } 
       
      else if  (position == Size)  {
         return append(newNode);     
      }
       
      else  {
   	 Node previous = getNodeAtPosition(position - 1); 
         newNode.setNextNode(previous.getNextNode()); 
         previous.setNextNode(newNode);          
         return newNode; 
         }
	}
 
   
   
   
   public Node append(Node node)     
   {
      Last.setNextNode(node);  
      Last = node;             
      Size++;
      return node;              
   }
         
         public int getListSize()
         {
            int listSize = 1;
            Node walker = Root;
            while(walker.getNextNode() != null) {
               walker = walker.getNextNode();
               listSize++; 
            }
            return listSize;
         }
   
  
   public Node newRoot(Node newRoot)
   {
      newRoot.setNextNode(this.Root); 
      this.Root = newRoot;
      return newRoot;                
   }
   
   public void print() {
      Node walker = this.Root;                
      for (int i=0; i<this.getListSize(); i++) {
         System.out.println(walker.getValue());
         walker = walker.getNextNode();
      }
   }
}