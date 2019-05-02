
package singlylinkedlistdriver;


import java.util.Scanner;

public class Listing {

	private String name;
	private int studentGradePoint;
	private String Address;

	private int IDnumber;

	
	public Listing() {

	}

	
	public Listing(String Name, int StudentgradePoint, int IdNum, String address) {

		name = Name;

		studentGradePoint = StudentgradePoint;
		IDnumber = IdNum;
		this.Address = address;
	}

	
	public String toString() {
		return ("Name is " + name 
				+ "\nGrade is " + studentGradePoint
				+ "\nAddress is " + Address

				+ "\nId number is " + IDnumber + "\n"

		);

	}

	
	public void ProgrammerName() {
		String Programmer = (" Ernest Mushinge \n" + " Assignment #4 \n" + " IT 2660 Data Structure and Algorithms"
				+ " CRN 15724 \n" + " Due date: 3/10/2016 \n" + " Spring 2016 \n"
				+ " Chapter 4, Exercise 25\n" + "_______________________\n\n");
		System.out.println(Programmer);

	}

	
	public Listing deepCopy() {
		Listing clone = new Listing(name, studentGradePoint, IDnumber, Address);
		return clone;
	}

	
	public int compareTo(String Name) {
		return (name.compareTo(Name));
	}

	
	public void input() {

		Scanner intM = new Scanner(System.in);
		Scanner StringM = new Scanner(System.in);
		System.out.println(" Enter a name ");
		name = StringM.nextLine();
		System.out.println(" Enter student grade point");
		studentGradePoint = intM.nextInt();
		System.out.println(" Enter student ID #");
		IDnumber = intM.nextInt();
		//to get address
		System.out.println(" Enter student address ");
		 Address = StringM.nextLine();
		

	}

}
