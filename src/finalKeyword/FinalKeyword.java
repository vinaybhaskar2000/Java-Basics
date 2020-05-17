package finalKeyword;

public class FinalKeyword {

	public static void main(String[] args) 
	{
		final int i = 10;
		
		System.out.println(i);
		
	//	i  = 20;
		
		System.out.println(i);
		
		final String LOGIN_PAGE_TITLE  = "Google";
		
		if (LOGIN_PAGE_TITLE.equals("Google")) 
		{
			System.out.println("Correct Title");
		} else 
		{
			System.out.println("Wrong title");
		}
		
		
	}

}
