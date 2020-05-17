package feb28;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAssignment2 {

	public static void main(String[] args) 
	{
		ArrayList<String> studentNames = new ArrayList<>();
		studentNames.add("Varun");
		studentNames.add("Reena");
		studentNames.add("Naveen");
		studentNames.add("Rajesh");
		studentNames.add("Milan");
		studentNames.add("Krishna");
		
		System.out.println(" The size of studentNames Array List is : "+studentNames.size());
		System.out.println("------");
		for (int i = 0; i < studentNames.size(); i++) 
		{
		  System.out.println(studentNames.get(i));	
		}
		
		
		
//		for(String snames :studentNames)
//		{
//			System.out.println(snames);
//		}
		
		// Reverse the array without using reverse method.
	
		System.out.println("------");

		int k =  studentNames.size()-1;		
	//	System.out.println(k);
		
		for(int i = k; i >= 0; i--)
		{
			//System.out.println(studentNames.get(i));
		}
		
		
		/*  Write a Java program to empty an array list.
		    studentNames.removeAll(studentNames);
		  System.out.println(studentNames.get(0)); */
		
	//	System.out.println("------");
		
		// Write a Java program to extract a portion of a array list.
		
		List<String> portionOfNames = studentNames.subList(2, 6);
		System.out.println(portionOfNames);
		
		
		System.out.println("------");
		
		
	// 	virtual capacity of an array list the current list size.	
		
		studentNames.trimToSize();
		System.out.println(studentNames);
		
		
	// Write a Java program to print all the elements of a
	//	 ArrayList using the position of the elements	
		
		System.out.println("------");
		
		for(int counter = 0; counter<studentNames.size(); counter++)
		{
			System.out.println(studentNames.get(counter));
		}
		
		
		
		
		
		
	}

}
