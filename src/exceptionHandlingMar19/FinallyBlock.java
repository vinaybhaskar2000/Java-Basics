package exceptionHandlingMar19;



public class FinallyBlock {

	@SuppressWarnings("finally")
	public static int div(int a, int b)
	{	int d = 0;
		
		try{
		d = a/b;
		System.out.println("Hi");
		System.out.println("Hello");
		return d;
		}
		catch(Exception e)
		{
			System.out.println("Some exception is coming...");
			return d;
		}
		finally{
			System.out.println(" iam in finally block");
			//return -1;
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		
		
		//System.out.println(div(10, 0));
		
		int g = div(10, 0);
		System.out.println("The value is ...:"+g);
	}

}
