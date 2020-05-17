package webdriverArchitecture;

public class FireFox implements Webdriver
{

	public FireFox()
	{
		System.out.println(" FireFox...!  Launch FireFox");
	}
	
	@Override
	public void get(String url) 
	{
		
		System.out.println("FireFox...launching the URL..."+url);
	}

	@Override
	public void findElement(String element) 
	{
		System.out.println(" FireFox Finding the element "+element);
	}
		
	

	@Override
	public String getTitle() 
	{
		System.out.println(" FireFox get the Page title...!");
		return "Firefox";
		
	}

}
