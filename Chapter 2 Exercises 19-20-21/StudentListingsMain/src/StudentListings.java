import javax.swing.JOptionPane;
public class StudentListings
{
	private String name;
	private String id; 
	private String gpa;
	
	
	public StudentListings(String name, String id, String gpa)
	{
		this.name = name;
		this.id = id;
		this.gpa = gpa; 
	}
	
        @Override
	public String toString()
	{
		return("Name: " + this.name + ", " + "ID: " + this.id + ", " + "GPA: " + gpa); 
	}
	
	public StudentListings deepCopy()
	{
		StudentListings clone = new StudentListings(this.name, this.id, this.gpa);
		return clone;
	}
	
	public int compareTo(String targetKey)
	{
		return(this.name.compareTo(targetKey));
	}
	
	public void input()
	{
		this.name = JOptionPane.showInputDialog("Enter Name: ");
		this.id = JOptionPane.showInputDialog("Enter ID: ");
		this.gpa = JOptionPane.showInputDialog("Enter GPA: "); 
	}

}