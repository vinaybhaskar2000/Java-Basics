package stringManipulationsMarch19;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class StringManipulations3 {

	public static void main(String[] args) 
	{
		String lang = "Java_Python_Ruby_JavaScript";
		
		String[] langvalue = lang.split("_");
		System.out.println(langvalue.length);
		// to print all the values i will use for loop
		
		for (int i = 0; i < langvalue.length; i++) 
		{
		  System.out.println(langvalue[i]);	
		}
		
		String h = "this is java world";
		System.out.println(h.toUpperCase());
		System.out.println(h.toLowerCase());
		
		// we can split based on the letters as well.
		
	System.out.println("-----********------");
		
		String name = "xXtestxxXjavaXxXselenium";
		String [] names = name.split("xX");
		for (int i = 0; i < names.length; i++) 
		{
		//  System.out.println(names[i]);	
		}
		
	//	System.out.println("-----********------");
		
		
		
		String userdata = "Tom:Steve:tom@gmail.com:test@123:999999:London ";
		userdata.split("|");
//		System.out.println(userdata.split(":")[0]);
//		System.out.println(userdata.split(":")[1]);
//		System.out.println(userdata.split(":")[2]);
		
		// Substrings
		
		String message = "Your Transaction id is  12345 ";
		//System.out.println(message.substring(0, 10));
		
		//System.out.println(message.indexOf("is  "));
	//	System.out.println(message.substring(message.indexOf("is  ")+4, message.length()));
		
		String trId = message.substring(message.indexOf("is  ")+4, message.length());
		System.out.println(trId);
		
		
	}

}
