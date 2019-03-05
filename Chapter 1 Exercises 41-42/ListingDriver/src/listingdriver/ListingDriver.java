package listingdriver;

public class ListingDriver 
{	
	public static void main(String[] args)
	{
		Listing[] arrayList = new Listing[3]; 
		
		Listing List1 = new Listing(); 
		Listing List2 = new Listing(); 
		Listing List3 = new Listing(); 
		
		arrayList[0] = List1; 
		arrayList[1] = List2; 
		arrayList[2] = List3;  
		
		
		List1.input(); 
		List2.input(); 
		List3.input(); 
		
		
		for(int i = 2; i > -1; i--) 
		  System.out.println(arrayList[i]) ; 
		
	} 

}