package bOOInterfaceMarch16;

public interface USMedical extends GHC
{
	public int min_fee = 10; // Static and Final in nature.
	
	public void orthoServices();
	
	public void physioServices();
	
	public void nineOneOneServices();
	
	public void ENTServices();
	

	
	
	public static void bloodbank()
	{
		System.out.println("US- Blood Bank.");
	}
	
	default void FDA()
	{
		System.out.println("US---FDA");
	}
	
	
}
