package cOOAbstractClassesMarch17;

public class Test {

	public static void main(String[] args) 
	{
		LoginPage lp = new LoginPage();
		System.out.println("++++++++++++++++++");
	//	lp.search();
	//    lp.header(" Google login");
	//    lp.title(" Google Account Login");
	//    lp.doLogin();
	    
	    System.out.println("-------********--------");
	    HomePage hp = new HomePage();
	    System.out.println("++++++++++++++++++");
	    hp.search();
	//    hp.header("Home Page login");
	//    hp.title("Home Page title");
	    
	   // Page p = new Page(); we cannot create the Object for Abstract class.
	    
	    System.out.println("-------********--------");
	      Page p = new LoginPage();
	      System.out.println("++++++++++++++++++");
	 //     p.search();
	 //     p.header("Facebook Header");
	 //     p.title("facebook title");
	      
	    
	}

}
