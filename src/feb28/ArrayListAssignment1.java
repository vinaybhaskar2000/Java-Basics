package feb28;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignment1 {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Red");
		al.add("Blue");
		al.add("Yellow");
		al.add("Green");
		al.add("Black");
		
		// Print Array List
		for (String colors : al) 
		{
			System.out.println(colors); 
			
		}
		System.out.println("-----");
		// Add a color Magenta in Red color place. ie in 0 index.
		// Add a white color in last index. Instead of Black color.
		
		al.add(0, "Magenta");
		al.add(al.size(), "White");
		for (String colors : al) 
		{
			System.out.println(colors); 
			
		}
		
		
		System.out.println("-----");
		
		//to retrieve an element (at a specified index) from a given array list.
		System.out.println(al.get(4));
		
		// update specific array element by given element.
		System.out.println("-----");
		
		
					al.set(3, "RED");
					al.set(1, "YELLOW");
	
					for (String colors : al) 
					{
						System.out.println(colors); 
						
					}
					
					
		// remove the third element from a array list. 			
		System.out.println("-----");
		
		al.remove(2);
		for (String colors : al) 
		{
			System.out.println(colors); 
			
		}
		
		
		// search an element in a array list.			
				System.out.println("-----");
		
		boolean colore = al.contains("Brown");
		System.out.println(colore);
		
		//OR
		
		if (al.contains("RED")) 
		{
			System.out.println("RED color is there");
		}
		
		else
		{
			System.out.println("Red color is NOT there");
		}
		
		
		// reverse elements in a array list
		System.out.println("-----******--------");
		
		Collections.reverse(al);
		for (String colors : al) 
		{
			System.out.println(colors); 
			
		}
	}

}
