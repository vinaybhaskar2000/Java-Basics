package encapsulationMarch12;

public class EmpDataEntry {

	public static void main(String[] args) 
	{
		// Case 1: Set the Class variables with Constructor.
		
//		EmpData emp = new EmpData("Vinay Bhaskar", 38, 50000);
//		System.out.println(emp.getName());
//		System.out.println(emp.getAge());
//		System.out.println(emp.getSalary());
		
		System.out.println("----");
		
		
		// Case 2: Set the Class variables with Setter
		
		EmpData emp = new EmpData();
		
		emp.setName("Basavaraju Narottam Babu");
		emp.setAge(48);
		emp.setSalary(100000);
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getSalary());
		
		
	}

}
