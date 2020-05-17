package feb24;

public class ConditionalOperators {

	public static void main(String[] args) 
	{
		int a = 30;
		int b = 30;
		
		if (b>=a) 
		{
			System.out.println(" B is greater than A");
		}
		
		else 
		{
			System.out.println(" A is greater than B");
		}
		
		
		int total = 100;
		int tax = 50;
		int finalAmont = total+tax;
		
		int pendingAmpunt = 160;
		
		if (finalAmont == pendingAmpunt) 
		{
		   System.out.println("Bill is paid...");	
		}
		
		else 
		{
			//System.out.println(" Please pay the final amount...");
		}
		
		// String Comparision:
		
		String s1 = "This is Java";
		String s2 = "This is java";
		
		if (s1.equals(s2)) 
		{
			//System.out.println(" Two strings are equal");
		}
		
		else 
		{
			//System.out.println(" Two strings are not equal..");
		}
		
		if (s1.equalsIgnoreCase(s2)) 
		{
			//System.out.println(" Two strings are equal");
		}
		else 
		{
			//System.out.println(" Two strings are not equal..");
		}
		
		// Cross Browser Testing:
		// if - else-if
	
			String browser = " ";
			if (browser.equalsIgnoreCase("chrome")) 
			{
				System.out.println(" launching chrome");
			}
			
			else if (browser.equalsIgnoreCase("FIreFox")) 
			{
				System.out.println(" launching firefox");
			}
		
			else if (browser.equalsIgnoreCase("IE")) 
			{
				System.out.println(" launching IE");
			}
		
			else
			{//System.out.println(" We dont support for Browser..."+browser);
			}	
			
			
			int amount = 200;
			if (amount >= 100) 
			{
				if (amount <= 150) 
				{
					System.out.println(" Bill is paid");
				}
				
				else 
				{
					System.out.println(" Bill is overpaid with tip");
				}
			}
			else 
			{
				System.out.println("Bill is not paid");
			}
			
	}

}
