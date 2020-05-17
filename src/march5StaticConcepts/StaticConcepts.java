package march5StaticConcepts;

public class StaticConcepts {

	
	// class variables
			String name;
			static int age = 25;
	
			public void getName()
			{
				System.out.println("Get name...");
			}
			
			public static void getValue()
			{
				System.out.println("Get value..");
			}
	
	public static void main(String[] args) 
	{
		int i = 10;
		
		StaticConcepts obj = new StaticConcepts();
		obj.name = "Vinay Bhaskar";
		//obj.age = 25;
	  //	System.out.println(age);
		System.out.println(StaticConcepts.age);
	//	getValue(); // directly we are calling without using Object name.
		
		StaticConcepts.getValue(); // we are calling static method by using call name.
		obj.getName();
		
	}

}
