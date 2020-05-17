package assignments;

import java.util.ArrayList;

public class ConstructorAssignmentsUniversity 
{
	String name;
	String country;
	int stablishedDate;
	ArrayList<String> availableCourses;
	
	
	
	public ConstructorAssignmentsUniversity(String name, String country, int stablishedDate, ArrayList<String> availableCourses ) 
	{
		
		this.name = name;
		this.country = country;
		this.stablishedDate = stablishedDate;
		this.availableCourses = availableCourses;
	}



	public static void main(String[] args) 
	{
		ArrayList<String> availableCourses = new ArrayList<>();
		availableCourses.add("Mechanical Engineering");
		availableCourses.add("Electrical Engineering");
		availableCourses.add("Civil Engineering");
		availableCourses.add("Computer Science Engineering");
		
		ConstructorAssignmentsUniversity a = new ConstructorAssignmentsUniversity("Osmania University", "India", 1920, availableCourses);
		System.out.println(a.name+" "+a.country+" "+a.stablishedDate);
		System.out.println(" Available courses in OU are : "+a.availableCourses);
		System.out.println(" The Most demand course is  : "+a.availableCourses.get(0));
		System.out.println(" The Lower demand course is  : "+a.availableCourses.get(2));
	}

}
