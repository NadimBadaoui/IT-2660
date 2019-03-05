package stackexpandedapplication;

public class StackExpanded
{
	private Listing[] data;		
	private int top;
	private int size;
	
	public StackExpanded()
	{
		top = -1;
		size = 100;
		data = new Listing[100];		
	}
	
	public StackExpanded(int s, int l)
	{
		top = -1;
		size = s; 
		data = new Listing[l];		
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
		{																
			Listing[] tempArray = new Listing[data.length + 1]; 
			System.arraycopy(data, 0, tempArray, 0, data.length); 
			
			for(int i = 0; i < data.length; i++)  {
				tempArray[i] = data[i]; 
					}
				data = tempArray; 
				top = top + 1;								
				data[top] = newNode.deepCopy();
				return true; 
		}	
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
			return null; 		//Underflow Error
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