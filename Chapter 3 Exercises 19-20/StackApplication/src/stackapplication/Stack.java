package stackapplication;

public class Stack 
{
	private Listing[] data;		
	private int top;
	private int size;
	
	public Stack()
	{
		top = -1;
		size = 100;
		data = new Listing[100];		
	}
	
	public Stack(int n)
	{
		top = -1;
		size = 100;
		data = new Listing[n];		
	}
	
	public void reset()
	{
		this.top = -1;  
	}
	
	public boolean emptyTest()
	{
		if(top == -1)
			return true;
		else 
			return false; 
	}	
		
	public boolean fullTest()
	{
		if(top == size - 1)
			return true;
		else 
			return false; 
	}
	
	public boolean push(Listing newNode)
	{
		if(top == size - 1)
			return false;		
		else
		{
			top = top + 1;								
			data[top] = newNode.deepCopy();
			return true;
		}
	
	}
	
	public Listing pop()
	{
		int topLocation;
		
		if(top == -1)
			return null; 		
		else
		{
			topLocation = top;
			top = top - 1;								 
			return data[topLocation]; 
		}	
	}
	
	public Listing peak()  
	{
		int topLocation;
		
		if(top == -1)
			return null; 		
		else
			topLocation = top;
			return data[topLocation]; 
	}
	
	public void showAll()
	{
		for(int i = top; i >= 0; i--)
			System.out.println(data[i].toString()); 		
	}
		
}