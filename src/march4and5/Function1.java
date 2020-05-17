package march4and5;

public class Function1 {
	
	int a = 10;
	int b = 30;
	
	public int getNumber()
	 {
		 System.out.println("get a the value of c");
		 int a = 10;
		 int b =20;
		 int c = a+b;
		 return c;
	 }
	
	  public int add(int a, int b)
	  {
		  System.out.println("Addition of two numbers...");
		  int z = a+b;
		  return z;
	  }
	 
	  
	
	public static void main(String[] args) 
	{
		Function1 f = new Function1();
		//int g = f.getNumber();
		System.out.println(f.getNumber());
		
	int g =	f.add(175, 225);
	System.out.println(g);	

	}

}
