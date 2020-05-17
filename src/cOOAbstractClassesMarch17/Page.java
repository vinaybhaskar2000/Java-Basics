package cOOAbstractClassesMarch17;

public abstract class Page 
{
	public Page()
	{
		System.out.println(" Abstract Class - PageClass - This is default constructor.");
	}
	
	public Page(int i)
	{
		System.out.println(" This is 1-Param constructor."+i);
	}
	
	public abstract void header(String header);
	public abstract void title(String title);
	
	public void search()
	{
		System.out.println(" This is my Page Search ..method defined in Abstract Class.");
	}
	
	
	
	
	
}
