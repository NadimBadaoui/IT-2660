public class StudentListingsDriver
{
			private int next ; 
			private final int size ; 
			private final StudentListings[] data ; 
			
			public StudentListingsDriver()			
			{
				next = 0 ;
				size = 100 ; 
				data = new StudentListings[size] ;						
			}
			
			
		
			public boolean insert(StudentListings newNode)
			{
				if(next >= size)				
					return false ; 
					
				data[next] = newNode.deepCopy();			
				
				if(data[next] == null) 	
					return false;
					
				next = next + 1 ; 			
					return true ; 
			}
			
		
			public StudentListings fetch(String targetKey)
			{
				StudentListings node; 
				StudentListings temp; 
				
				
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
			

			public boolean update(String targetKey, StudentListings newNode)
			{
				if(delete(targetKey) == false)
					return false;
				else return insert(newNode) != false; 			
			
}
}