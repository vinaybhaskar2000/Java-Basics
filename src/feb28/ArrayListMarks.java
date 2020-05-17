package feb28;

import java.util.ArrayList;

public class ArrayListMarks {

	public static void main(String[] args) 
	{
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(100);
		marks.add(200);
		
		
		for (int i = 0; i < marks.size(); i++) 
		{
		  System.out.println(marks.get(i));	
		}
		
		System.out.println("-------");
		
		marks.set(0, 5800);
		marks.set(1, 698574);
		
		for (int i = 0; i < marks.size(); i++) 
		{
		  System.out.println(marks.get(i));	
		}
		
		
		System.out.println("-------");
		ArrayList<String> studentName = new ArrayList<String>();
		studentName.add("Vinay");
		studentName.add("Bhaskar");
		studentName.add("Basavaraju");
		
		for (String string : studentName) 
		{
			System.out.println(string);
		}
		
		System.out.println("---------");
		// we can add any type of data
		
		ArrayList<Object> allData = new ArrayList<Object>();
		allData.add(25684745);
		allData.add("Vinay Bhaskar Mtech MBA");
		allData.add(105.25);
		for (Object object : allData) 
		{
			System.out.println(object);
		}
		
	}

}
