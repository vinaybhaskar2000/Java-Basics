package feb24;

public class ConditionalOperators2 {

	public static void main(String[] args) 
	{
		// Check the highest number
		
		int a = 2800;
		int b = 1300;
		int c= 3500;  
		
		if (a>b && a>c) // true && false : false
		{
		 	System.out.println(" a is gretaer");
		}
		
		if (b > c) // false
		{
			System.out.println(" b is greater ");
		}
		else
		{
			System.out.println(" c  is greater");
		}

		int x = 800;
		int y = 1300;
		int z= 500;
		
		if (x>y && x>z) // false && true : false
		{
		 	System.out.println(" x is gretaer");
		}
		
		if (y > z) // false
		{
			System.out.println(" y is greater ");
		}
		
		else
		{
			System.out.println(" z  is greater");
		}
	}

}
