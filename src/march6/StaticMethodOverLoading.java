package march6;

public class StaticMethodOverLoading {

	public static void getName()
	{
		
	}
	public static void getName(int a)
	{
		
	}
	

	public static void main(String a[]) 
	{
		System.out.println(" This is my main method.");
		StaticMethodOverLoading.main(15);
		StaticMethodOverLoading.main(15,30);

	}
	
	public static void main(int a) 
	{
		System.out.println(" This is my main method."+a);

	}

	public static void main(int a, int b) 
	{
		System.out.println(" This is my main method."+a+" "+b);

	}

	
	
	
	
	

}
