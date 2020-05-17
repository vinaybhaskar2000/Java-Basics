package accessModifiers;

public class BMW  {

	
//	@Override
//	public String carColor()
//	{
//		String color = "blue";
//		
//		System.out.println(" BMW car Color");
//		return color;
//	}
	
	
	
	public static void main(String[] args) 
	{
		Car c = new Car();
		c.color = "Red";  // default property, access in the subclass in the same package.
		c.price = "50000";
		c.name = "Maruti";
		
		System.out.println(c.carColor());
		
		
		BMW b = new BMW();
	//	System.out.println(b.carColor());
		
		
	}

}
