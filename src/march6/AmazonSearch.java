package march6;

public class AmazonSearch {


	public void search()
	{
		
	}
	public void search(String test)
	{
		System.out.println("1 Param"+test);
	}
	public void search(int a, int b)
	{
		
	}
	
	public void search(int c, String d)
	{
		
	}
	
	public void search(String d, int d1)
	{
		
	}
	
	public static void main(String[] args) 
	{
		AmazonSearch a = new AmazonSearch();
		a.search();
		a.search(10, 20);
		a.search(30, "Hello");
		a.search("Vinay", 258);
		a.search("  Bhaskar");
		
		

	}

}
