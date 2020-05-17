package feb26;

public class SwitchCase2 {

	public static void main(String[] args) 
	{
		String broswerName = "IE";
		
		switch (broswerName) 
		{
		case "Chrome": System.out.println("Chrome Browser Launched..."); 
		break;
		case "FireFox": System.out.println("Firefox Browser Launched..."); 
		break;
		case "IE": System.out.println("IE Browser Launched..."); 
		break;
		
		default:
			System.out.println(" This browser is not supporting.");
			break;
			
		}
		
		
	}

}
