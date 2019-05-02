
package singlylinkedlistdriver;

import java.util.Scanner;


public class KeepsTrackOfStudentInfo {

	String name;
	int IdNumber;
	int totalGrades;
	int NumOfStudents;
	int GradePointAverage;
	int InitialDataSet;
	
	String fetchKeyName;
	Scanner scanInt = new Scanner(System.in);
	Scanner scanStr = new Scanner(System.in);
	;
	
	 SinglyLinkedList linked = new SinglyLinkedList();
	 Listing list = new Listing();

	public KeepsTrackOfStudentInfo() {


		
		System.out.println("Enter the initial number of students(#ofStudents)");
        NumOfStudents = scanInt.nextInt();

		
		System.out.println("Enter the initial data set");
		 InitialDataSet = scanInt.nextInt();

		
		
		
         for(int i = 0; i < InitialDataSet;i++)
           {
	          Listing list = new Listing();
	          
	          list.input();
	          linked.insert(list);
	         
          }
      
		askUser();

	}

	
	public int StudentPointAverage(int totalAveragePoint) {
		int TotalPointAverage = 0;
		totalAveragePoint = TotalPointAverage;
		TotalPointAverage = NumOfStudents / totalGrades;

		return TotalPointAverage;
	}

	
	public void exit() {
		
		System.out.println("System shutting down");
		System.exit(0);

	}

	
	public final void askUser() {

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
		
			list.input();
			linked.insert(list.deepCopy());
			linked.showAll();
			askUser();

			break;
		case 2:
			Listing sk;
			System.out.println(" Enter a name of a student to fetch");
			fetchKeyName = scanStr.nextLine();
			sk = linked.fetch(fetchKeyName);
			System.out.println("The Student fetched is " + sk.toString());
			askUser();
			break;
		case 3:
			String nameToDelete;
			System.out.println("Enter a name of a student to be deleted");
			nameToDelete = scanStr.nextLine();
			
			linked.delete(nameToDelete);
			
			linked.showAll();
			askUser();
			break;
		case 4:
			String nameToBeUpDatedOn;
			System.out.println(" Enter name to be updated on");
			nameToBeUpDatedOn = scanStr.nextLine();
			
			Listing newNode = new Listing();
			newNode.input();
			
		     linked.update(nameToBeUpDatedOn, newNode);
			
			linked.showAll();
			askUser();
			break;
		case 5:
			System.out.println(" These are all the students from the list \n________________________________________\n");
			linked.showAll();
	
			askUser();
			break;
		case 6:
            
			exit();
			break;

		}

	}

}

