package feb25;

public class BasicOperators {


	public static void main(String[] args) 
	{
		//System.out.println(0/9);
		
		int p = 9;
		int q = p % 2;   // % reminder.
	//	System.out.println(q);
		
		int num = 110;
		if (num % 2 == 0) 
		{
		  System.out.println( " even number"); 
		  
		}
		else
		{
			System.out.println(" Odd mumber ");
		}
		
		
		// Ternary Operator
		
		
		int z = 12;
		String c = (z>10) ? "Hi"  :  "Bye";
		System.out.println(c);
		
		
		String browser = "ChromeD";
		
		String f = (browser.equals("Chrome")) ? "Launch Chrome" : " Launch Firefox";
		System.out.println(f);
		
		
		boolean flag = true;
		
		if (flag) 
		{
			System.out.println(" This is TRUE");
		} 
		else 
		{
			System.out.println(" This is FALSE");
		}
		
		
		String name = "Tom";
		
		if ( name.equals("Tom")) 
		{
			System.out.println(" Test is passed");
		}
		
		else 
		{
			System.out.println(" Test is failed....!");
		}
		
		
		// Example 2
		
		String name1 = "Naveen";
		
		if (! name1.equals("")) 
		{
			System.out.println(" Name is : "+name1);
		}
		
		else 
		{
			System.err.println(" Name value is blank");
		}
		
	}

}
