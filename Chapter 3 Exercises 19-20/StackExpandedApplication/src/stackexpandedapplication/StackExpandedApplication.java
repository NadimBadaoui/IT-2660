package stackexpandedapplication;
public class StackExpandedApplication
{
	public static void main(String[] args)
	{
		StackExpanded stack = new StackExpanded(3, 3);
		
			Listing list1 = new Listing("Nadim", "1st Street", "330-123-4567");
			Listing list2 = new Listing("Donnie", "2nd Street", "214-123-4567");
			Listing list3 = new Listing("Marie", "3rd Street", "440-123-4567"); 
			Listing list4 = new Listing("Marc", "4th Street", "330-840-1923");
			Listing temp;  

		System.out.println("Is the Stack Empty?"); 
		System.out.println(stack.emptyTest());
		System.out.println("Is the Stack Full?"); 
		System.out.println(stack.fullTest()); 
		System.out.println(); 
		
		System.out.println("Attempts to perform a Push on a Full Stack - Underflow Error: ");
		System.out.println(stack.pop());	
		System.out.println(); 
		
		System.out.println("3 Push Operations - Peter, Paul, & Mary Listings: "); 
		System.out.println(stack.push(list1));
		System.out.println(stack.push(list2));
		System.out.println(stack.push(list3));
		System.out.println(); 
		
		System.out.println("showAll Method Invoked - Should Display Peter, Paul, & Mary Listings: "); 
		stack.showAll(); 
		System.out.println(); 
		
		System.out.println("**Re-initialize The Stack**");  
		stack.reset(); 
		System.out.println(); 
		
		System.out.println("showAll Method Invoked - Should Display Nothing: "); 
		stack.showAll(); 
		System.out.println(); 
		
		System.out.println("4 Push Operations - Peter, Paul, Mary, & Marie Listings." +
											" This operation expands the Array to accommodate the 4th Listing: "); 
		System.out.println(stack.push(list1));
		System.out.println(stack.push(list2));
		System.out.println(stack.push(list3)); 
		System.out.println(stack.push(list4)); 
		System.out.println(); 
												
		System.out.println("Peak Operation - Displays Marie's Listing: ");
		System.out.println(stack.peak()); 
		System.out.println(); 
		
		System.out.println("4 Pop Operations - Displayed w/ toString Method: ");
		temp = stack.pop();
		System.out.println(temp.toString());
		temp = stack.pop();
		System.out.println(temp.toString());
		temp = stack.pop();
		System.out.println(temp.toString());
		temp = stack.pop();
		System.out.println(temp.toString());
		System.out.println(); 
		
		System.out.println("showAll Method Invoked - Should Display Nothing: "); 
		stack.showAll(); 
		System.out.println(); 
		
	}
}

