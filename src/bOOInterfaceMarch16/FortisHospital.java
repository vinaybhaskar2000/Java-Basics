package bOOInterfaceMarch16;

public class FortisHospital extends WHO implements USMedical,UKMedical,IndianMedical 

{

	@Override
	public void orthoServices() 
	{
		System.out.println("FS US ---OrthoServices ");
		
	}
	
	@Override
	public void FDA()
	{
		System.out.println("FDA Services");
	}
	
	@Override
	public void physioServices() 
	{
		System.out.println("FS US ---PhysioServices ");
		
	}

	@Override
	public void nineOneOneServices() 
	{
		
		System.out.println("FS US ---NineOneOneServices ");
	}
	
	@Override
	public void ENTServices() 
	{
		System.out.println("FS US ---ENTServices ");
		
	}
	

	@Override
	public void birthControl() 
	{
		System.out.println("GHC ---birthControl ");
		
	}

	@Override
	public void emergencyServices() {
		
		System.out.println("FS UK---emergencyServices ");
	}

	@Override
	public void oncologyServices() {
		
		System.out.println("FS UK---oncologyServices ");
	}

	@Override
	public void pathologyServices() {
		System.out.println("FS India---pathologyServices ");
		
	}

	@Override
	public void OPTServices() {
		System.out.println("FS India---OPTServices ");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FS India---cardioServices ");
		
	}
	
	// Non Override methods.
	
	public void gynecServices()
	{
		System.out.println(" Exclusive FS gynecServices");
	}
	
	public void medicaslInsuranceServices()
	{
		System.out.println(" Exclusive FS medicaslInsuranceServices");
	}
	

	public void neuroServices()
	{
		System.out.println(" Exclusive FS neuroServices");
	}


	
}
