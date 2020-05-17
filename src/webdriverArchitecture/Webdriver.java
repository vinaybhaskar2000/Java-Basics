package webdriverArchitecture;

public interface Webdriver 
{
	
	public void get(String url);
	
	public void findElement(String element);
	
	public String getTitle();
}
