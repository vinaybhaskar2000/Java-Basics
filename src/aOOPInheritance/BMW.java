package aOOPInheritance;

public class BMW  extends Car
{
	public BMW()
	{
		System.out.println(" This is Child Class Constructor - BMW");
	}
	
	@Override
	public void start()
	{
		System.out.println(" This is the stat method for BMW");
	}
	
	public void autoParking()
	{
		System.out.println("BMW - Auto Parking");
	}
	
	@Override
	public void refuel()
	{
		System.out.println("BMW Refuel ..This is BMW method....refuel");
	}
}
