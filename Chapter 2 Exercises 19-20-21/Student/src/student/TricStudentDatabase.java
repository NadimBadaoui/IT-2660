package student;

public class TricStudentDatabase 
{
	public static void main(String[] args)
	{
		StudentOperations tricDatabase = new StudentOperations();
		Student temp; 
		
		
		Student Nadim = new Student("Nadim", "1", "3.8");
		Student Max = new Student("Max", "1", "3.5");
		Student Donnie = new Student("Donnie", "3", "3.0");
                Student John = new Student("John", "4", "4.0");  
		
		
		
		
		System.out.println("**************TEST OF INSERT & FETCH METHODS**************");
		System.out.println(tricDatabase.insert(Nadim));
		System.out.println(tricDatabase.insert(Max));
		
		System.out.println(tricDatabase.fetch("Nadim"));
		System.out.println(tricDatabase.fetch("Max"));
		System.out.println(tricDatabase.fetch("Donnie")); 

		temp = tricDatabase.fetch("Max");
		System.out.println(temp.toString());
		
		System.out.println(tricDatabase.insert(Donnie));
		
		temp = tricDatabase.fetch("Donnie");
		System.out.println(temp.toString());
		
		System.out.println("**************TEST OF DELETED METHOD**************");
		System.out.println(tricDatabase.delete("Nadim"));
		System.out.println(tricDatabase.fetch("Nadim"));
		
		
		System.out.println("**************TEST OF UPDATED METHOD**************");
		System.out.println(tricDatabase.insert(Nadim));
		System.out.println(tricDatabase.insert(John));
		System.out.println(tricDatabase.update("John", Nadim)); 
		System.out.println(tricDatabase.fetch("John")); 		
		
	}


}