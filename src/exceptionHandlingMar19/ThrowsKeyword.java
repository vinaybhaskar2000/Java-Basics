package exceptionHandlingMar19;

public class ThrowsKeyword 
{
	
	public void launchBrowser() 
	{
		System.out.println("LB");
		checkVersion();
	}
	
	public void checkVersion() 
	{
		System.out.println("CV");
		try {
			checkPlugin();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void checkPlugin() throws ArithmeticException, NullPointerException
	{
		
		System.out.println("CP");
		int i = 9/3;
		
		ThrowsKeyword o1 = null;
		o1.launchBrowser();
	}
	
	public static void main(String[] args) 
	{
		ThrowsKeyword obj = new ThrowsKeyword();
		
			obj.launchBrowser();
			
			
		
		
	}

}
