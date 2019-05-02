public class MainLinkedList
{
	public static void main(String[] args)
	{
      LinkedList list = new LinkedList(new Node("A"));
      list.append(new Node("B"));
      list.append(new Node("C"));
      
      list.insertNodeAtPosition(new Node("Third"), 1);
      list.insertNodeAtPosition(new Node("First"), 0);
      list.insertNodeAtPosition(new Node("Last"), 5);
      
      list.print();
   }
}