package webdriverArchitecture;

public class LoginPageTest {
	static Webdriver driver;
	
	public static void main(String[] args) 
	{
		String browser = "firefox";
		
		//ChromeDriver driver = new ChromeDriver();
	   //	FireFox driver = new FireFox();
		
		if (browser.equalsIgnoreCase("Chrome")) 
		{
			driver = new ChromeDriver();
		}
		
		else if ((browser.equalsIgnoreCase("firefox"))) 
		{
			driver = new FireFox();
		}
		
		
		driver.get("www.google.com");
		driver.findElement("user name");
		driver.findElement("Passwod");
		driver.findElement("login");
		System.out.println("----********---------");
		String googleGetTitle = driver.getTitle();
		System.out.println(googleGetTitle);
		
		

	}

}
