package accessModifiers;

public final class Car {

	private String chasisNumber;
	
	public String name;
	String color;
	protected String price;
	
	private void start()
	{
		System.out.println("this is my car start");
	}
	
	public String carColor()
	{
		System.out.println(" Car color");
		String color = "red";
		return color;
	}
	
	
	public static void main(String [] args) 
	{
		Car c = new Car();
		c.name = "Audi";
		c.chasisNumber = "123ere";
		c.start();
		
	}
	
	
	

}
