package cOOAbstractClassesMarch17;

public class HomePage extends Page  {

	
	 public HomePage() 
	 {
		System.out.println(" HomePage Class default constructor ");
	 }
	
	@Override
	public void header(String header) 
	{
		System.out.println("HomePage Page Header."+header);
		
	}

	@Override
	public void title(String title) 
	{
		System.out.println("HomePage Page title."+title);
		
	}

//	@Override
//	public void search()
//	{
//		System.out.println(" This is my Home Page Search ..method defined in Abstract Class.");
//	}

}
