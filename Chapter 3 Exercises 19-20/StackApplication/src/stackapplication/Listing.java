package stackapplication;

public class Listing
{
		private String name;
		private String address;
		private String number;
		
		public Listing()
		{
			name = " ";
			address = " ";
			number = " ";	
		}
		
		public Listing(String n, String a, String num)
		{
			name = n ;
			address = a ;
			number = num ;
		}
		
                @Override
		public String toString()
		{
			return(("Name: " + name +  ", ") + 
				 ("Address: " + address + ", ") + 
						("Number: " + number + "."));
		}
		
		public Listing deepCopy()
		{
			Listing clone = new Listing(name, address, number) ; 
			return clone ; 
		}
         
} 