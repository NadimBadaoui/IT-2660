package listingdriver;

import java.util.Scanner;
public class Listing
{
		Scanner scanner = new Scanner(System.in);
		String name;
		int age; 
		
		public Listing()
	   {
		  name = " ";
		  age = 0;
	   }
		
		public Listing(String Name, int Age)
		{
			name = Name;
			age = Age;	
		}
		
		public void input() 
		{
			System.out.println("Enter the list item name: "); 
			name = scanner.nextLine();  
			System.out.println("Enter the list item age: "); 
			age = scanner.nextInt();  	
		} 
		
      public String toString()
		{
			return("name: " + name + ", " + "number: " + age); 
			
		}
		
		public void setName(String Name)
		{
			name = Name;
		}
		public void setAge(int Age)
		{
			age = Age; 
		}
		
		public String getName()
		{
			return name;
		}
		public int getAge()
		{
			return age; 
		}
      
}