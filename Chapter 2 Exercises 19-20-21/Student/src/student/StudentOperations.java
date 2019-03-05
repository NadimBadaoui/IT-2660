package student;

import java.util.Scanner; 
public class StudentOperations
{
			private int next; 
			private final int size; 
			private final Student[] data; 
			Scanner s = new Scanner(System.in); 
			
			public StudentOperations()											
			{ 	
				System.out.println("Enter the maximum size of the data set: ");
				size = s.nextInt(); 
				next = 0; 
				data = new Student[size];						
			}
			
			
		
			public boolean insert(Student newNode)
			{
				if(next >= size)				
					return false; 
					
				data[next] = newNode.deepCopy();			
				
				if(data[next] == null) 	 
					return false;
					
				next = next + 1 ; 			
					return true; 
			}
			
		
			public Student fetch(String targetKey)
			{
				Student node; 
				Student temp; 
				
				
				int i = 0; 
				while(i < next && !(data[i].compareTo(targetKey) == 0 ))
				{
					i++ ; 
				}
				if (i == next)			
					return null ; 
				
				 
				node = data[i].deepCopy();
				
				
				if(i != 0)		 
					{
						temp = data[i - 1];
						data[i - 1] = data[i];
						data[i] = temp; 
					}
					return node;			
			}
			

			public boolean delete(String targetKey)
			{
				
				int i = 0 ; 
				while(i < next && !(data[i].compareTo(targetKey) == 0 ))
				{   
					i++; 
				}
				if (i == next)				
					return false;		
			
			 
			data[i] = data[next - 1];
			data[next - 1] = null;
			next = next - 1;
			return true;			
			}
			

			public boolean update(String targetKey, Student newNode)
			{
				if(delete(targetKey) == false)
					return false;
				else return insert(newNode) != false; 			
			}
			
}