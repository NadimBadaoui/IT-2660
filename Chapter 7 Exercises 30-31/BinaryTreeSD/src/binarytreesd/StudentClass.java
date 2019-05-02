
package binarytreesd;
import java.util.Scanner;

public class StudentClass {

	private String name;
	private int studentGradePoint;
	private int IDnumber;

	
	public StudentClass() {

	}

	
	public StudentClass(String Name, int StudentgradePoint, int IdNum) {

		name = Name;

		studentGradePoint = StudentgradePoint;
		IDnumber = IdNum;
		
	}
	
	public String toString() {
		return ("Name is " + name 
				+ "\nGrade is " + studentGradePoint
				+ "\nId number is " + IDnumber + "\n"

		);

	}

	
	public void ProgrammerName() {
		String Programmer = (" Ernest Mushinge \n" + " Assignment #7 \n" + " IT 2660 Data Structure and Algorithms"
				+ " CRN 15724 \n" + " Due date: 4/28/2016 \n" + " Spring 2016 \n"
				+ " Chapter 7, Exercise 31\n" + "_______________________\n\n");
		System.out.println(Programmer);

	}

	
	public StudentClass deepCopy() {
		StudentClass clone = new StudentClass(name, studentGradePoint, IDnumber);
		return clone;
	}

	public int compareTo(String Name) {
		return (name.compareTo(Name));
	}


	public void input() {

		Scanner intM = new Scanner(System.in);
		Scanner StringM = new Scanner(System.in);
		System.out.println(" Enter a name of a student");
		name = StringM.nextLine();
		System.out.println(" Enter student grade point");
		studentGradePoint = intM.nextInt();
		System.out.println(" Enter student ID #");
		IDnumber = intM.nextInt();
		
	}
	
	
	public String getKey()
	   {   return name;
	   }

}

