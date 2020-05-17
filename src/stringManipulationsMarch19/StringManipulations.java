package stringManipulationsMarch19;

public class StringManipulations {

	public static void main(String[] args) 
	{
		String str = "This is my first java code and iam so happy";
		System.out.println(" the length is :  " +str.length());
		System.out.println("lowest index = 0");
		System.out.println(" higest index "+(str.length()-1));
		
		System.out.println(str.charAt(40));
		System.out.println(str.indexOf('v', 10));
		
		
	System.out.println(str.indexOf('s')); // 1st Occurance of 's'
	System.out.println(str.indexOf('s', 4));  // 2nd occurance hard coded
		
		System.out.println(str.indexOf('s',str.indexOf('s')+1)); // 2nd Occurance of 's'
		 //	find the 3rd occurance of 's'
		
		System.out.println(str.indexOf("java"));
		
		String welcome = "welcome admin";
		
		if (welcome.indexOf("admin")>0) 
		{
			System.out.println("Admin is present in the String");
		}
		
		else
		{
			System.out.println("Admin is not present in the String");
		}
		
		
		System.out.println(str.indexOf("helo"));

	}

}
