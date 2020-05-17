package march4and5;

public class FunctionsInJava {

	public void testA()
	{
		System.out.println("A");
	}
	
	public void testB()
	{
		System.out.println("B"+"\t");
	}
	
	
	public static void main(String[] args) 
	{
		FunctionsInJava ji = new FunctionsInJava();
		
		for(int i = 0 ; i< 4; i++)
		{
			 ji.testA();
		     for(int j = 0; j<4; j++)
		     {
		    	
		    	 ji.testB();
		     }
			
		}
			
	}

}
