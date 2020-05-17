package march4and5;

public class User {

	// defining class variables
	
	String userName;
	String emailID;
	long phoneumber;
	boolean isActive;
	
	// Method
	
	public String getUserOrderDetails(String userName)
	{
		if (userName.equals("Tom")) 
		{
			return "Apple Mac Book";
		}
		
		else if (userName.equals("Steve")) 
		{
			return "Samsng s8";
		}
		
		if (userName.equals("David")) 
		{
			return "Toshiba Lap top.";
		}
		else
		{
			System.out.println(userName+" Not found");
			return "User not found...!";
		}
		
		
	}
	
	  public int getUserPhoneNumber(String userName)
	  {
		  if (userName.equals("Tom")) 
			{
				return 98655;
			}
		  
		  else if (userName.equals("Steve")) 
			{
				return 695874;
			}
		  
		  else
			{
				System.out.println(userName+" Phone number not found...!");
				return -1;
			}
		  
	  }
	  

	public static void main(String[] args) 
	{
		User user1 = new User();
		
		user1.userName = "Tom";
		String itemName = user1.getUserOrderDetails(user1.userName);
		System.out.println(itemName);

		user1.phoneumber = 65852;
		int g = user1.getUserPhoneNumber(user1.userName);
		System.out.println(g);
	}

}
