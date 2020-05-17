package feb28;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList(); // no squre bracket is required for dynamicarray. Squre bracket is require ony for static array.
		System.out.println(al.size());
		al.add(100);
		al.add(200);
		System.out.println(al.size());
		al.add(300);
		al.add(400);
		System.out.println(al.size());
		// print all the values
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
//	//	System.out.println(al.size());
//		al.add(500);
//		al.add(600);
//		al.add(600);
//	//	System.out.println(al.size());
//		al.remove(4);
//		System.out.println(al.size());
//		System.out.println(al.get(5));
//		al.add("Vinay");
//		al.add("Selenium");
//		al.add(true);
//		al.add('m');
//		
//		System.out.println(al);
		
		
		
		
	}

}
