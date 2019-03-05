public class Person
{
	private final String name;
	private final int age;
	private final double weight;
	
	public Person(String n, int a, double w)			
	{
		name = n;
		age = a;
		weight = w;
	
	}
	
        @Override
	public String toString()									
	{
		return("At the ripe age of " + age + ", " + 
					name + " has the weight of " + weight + " pounds."); 
		
	}

}