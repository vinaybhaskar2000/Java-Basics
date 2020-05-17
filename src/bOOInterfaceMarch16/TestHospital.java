package bOOInterfaceMarch16;

public class TestHospital {

	public static void main(String[] args) 
	{
		FortisHospital fs = new FortisHospital();
		fs.cardioServices();
		fs.nineOneOneServices();
		fs.emergencyServices();
		fs.medicaslInsuranceServices();
		fs.physioServices();
		fs.FDA();
		System.out.println("--********--------");
		
		fs.virusVaccination();
		fs.pandamicServices();
		
		System.out.println("-----******-----------");
		fs.polioServices();
		
		System.out.println("-----******-----------");
		fs.birthControl();
		
		System.out.println("-----******-----------");
		USMedical a = new FortisHospital();
		a.orthoServices();
		a.physioServices();
		a.nineOneOneServices();
		a.ENTServices();
		a.birthControl();
		
		
		
	//	FortisHospital  jj = new USMedical();
		System.out.println("-----******-----------");
		
		USMedical.bloodbank();
		System.out.println(USMedical.min_fee);

	}

}
