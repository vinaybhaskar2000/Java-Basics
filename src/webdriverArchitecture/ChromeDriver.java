package webdriverArchitecture;

public class ChromeDriver implements Webdriver
{
	
	public ChromeDriver()
	{
		System.out.println(" Google...!  Launch Google Chrome");
	}
	
	@Override
	public void get(String url) 
	{
		System.out.println(" Google...! launching the URL..."+url);
		
	}

	@Override
	public void findElement(String element) 
	{
		
		System.out.println(" Google...! Finding the element "+element);
	}

	@Override
	public String getTitle() 
	{
	 System.out.println("Google...! get the Page title...!");
	 return "Google";
	
		
	}
	
	public void addPlugin()
	{
		System.out.println(" Chrome ... Plugin");
	}
	
	
}
