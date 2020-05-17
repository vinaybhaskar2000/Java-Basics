package march9;

public class Employee {

	// defining class variables:
	 String name;
	 int age;
	 String role;
	 int empId;
	 boolean isPermanent;
	 
	 
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.name = "Vinay";
		e1.age = 25;
		e1.role = "Senior Test Engineer";
		e1.empId = 3405;
		e1.isPermanent = true;

		System.out.println(e1.name+ " "+e1.age+" "+e1.role+ " "+e1.empId+" "+e1.isPermanent);
	}

}
