package march3;

public class Employee {

	
	String empName;
	int age;
	String role;
	int empId;
	boolean isPermanent;
	
	
	
	
	public static void main(String[] args) 
	{
		
			Employee e1 = new Employee();
			e1.empName = "Vinay Bhaskar Basavaraju";
			e1.age = 40;
		//	e1.role = "Senior Selenium Developer";
			e1.empId = 7089;
			e1.isPermanent = true;
			
			
		//	System.out.println(e1.empName + " --- "+e1.age +" --- "+e1.empId);
		//	System.out.println(e1.role);
			
			Employee e5 = new Employee();
			e5 = null;
			e5 = new Employee();
			e5.empName = " Sree";
			System.out.println(e5.empName );
			
	}

}
