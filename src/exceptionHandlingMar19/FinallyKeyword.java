package exceptionHandlingMar19;

public class FinallyKeyword {

	public static void main(String[] args) 
	{
		System.out.println("A");
		try
		{
		int i = 9/0;
		}
		
		
		finally 
		{
			System.out.println(" Iam in finally block");
		}
	}

}
