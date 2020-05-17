package cOOAbstractClassesMarch17;

public class LoginPage extends Page 
{
	
	 public LoginPage() 
	 {
		System.out.println(" Login Page Class default constructor ");
	 }
	
	@Override
	public void header(String header) 
	{
		System.out.println("Login Page Header."+header);
		
	}

	@Override
	public void title(String title) 
	{
		System.out.println("Login Page title."+title);
	}

	@Override
	public void search()
	{
	System.out.println(" This is my Page Seach ..LoginPage class");
	}
	
	public void doLogin()
	{
		System.out.println(" This is the seperate method for doLogin Page.");
	}
}
