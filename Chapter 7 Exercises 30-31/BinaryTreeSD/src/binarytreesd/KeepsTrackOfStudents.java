
package binarytreesd;
import java.util.Scanner;

public final class KeepsTrackOfStudents  {

	String name;
	int IdNumber;
	int totalGrades;
	int NumOfStudents;
	int GradePointAverage;
	
	String fetchKeyName;
	Scanner scanInt = new Scanner(System.in);
	Scanner scanStr = new Scanner(System.in);
	
	
	 StudentClass student = new StudentClass();
	 BinaryTreeSD binaryTree = new BinaryTreeSD();

	
	public KeepsTrackOfStudents() {

       student.ProgrammerName();
	
		askUser();

	}


	
	public void exit() {
		
		System.out.println("System shutting down");
		System.exit(0);

	}

	
	public void askUser() {

		int ConvertUserEntry; 

		System.out.println(" Enter : 1 to insert a new student's information \n"
				+ "         2 to fetch and output a student's information \n"
				+ "         3 to delete a student's information \n"
				+ "         4 to update a new student's information \n"
				+ "         5 to output all student's information in sorted order\n" 
				+ "         6 to exit a program");

		
		ConvertUserEntry = scanInt.nextInt();

		switch (ConvertUserEntry) {
		case 1:
		
			student.input();
			binaryTree.insert(student.deepCopy());
			
			System.out.println("\n________________________________________\n");
			askUser();

			break;
		case 2:
			StudentClass sk;
			System.out.println(" Enter a name of a student to fetch");
			fetchKeyName = scanStr.nextLine();
			sk = binaryTree.fetch(fetchKeyName);

			if(!(sk == null)){
			System.out.println("The Student fetched is :\n______________________________________\n" + sk.toString());//we want to store the returned deepCopy in sk of type Listing
			}
			
			else if(!fetchKeyName.equals(sk.getKey()))
			{
				System.out.println("Node not in the tree structure");
			}
			System.out.println("\n________________________________________\n");
			askUser();
			break;
		case 3:
			String nameToDelete;
			System.out.println("Enter a name of a student to be deleted");
			nameToDelete = scanStr.nextLine();
			
			binaryTree.delete(nameToDelete);
			
			
				
			
			System.out.println("\n________________________________________\n");
			askUser();
			break;
		case 4:
			String nameToBeUpDatedOn;
			System.out.println(" Enter name to be updated on");
			nameToBeUpDatedOn = scanStr.nextLine();
			
			StudentClass newNode = new StudentClass();
			newNode.input();
			
		
				if(!(nameToBeUpDatedOn==null))
				{
					
					//I want to put newNode into the linked list
					binaryTree.update(nameToBeUpDatedOn, newNode);
					
					System.out.println("Update successful");
					binaryTree.showAll();	
				}
				if ((nameToBeUpDatedOn == null))
				{
					System.out.println("Node not in the structure\nSelect another option");
					
				}
				
				System.out.println("\n________________________________________\n");
				
				binaryTree.showAll();
			System.out.println("\n________________________________________\n");
			askUser();
			break;
		case 5:
			System.out.println(" These are all the students from the list \n________________________________________\n");
			binaryTree.showAll();
			System.out.println("\n________________________________________\n");
			askUser();
			break;
		case 6:
            
			exit();
			break;

		}

	}

}


