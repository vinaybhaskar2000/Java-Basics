package encapsulationMarch12;

public class Test {

	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.name = "Steve";
		e.getCity();
		e.setAge(30); // first iam setting the age and 
		int age = e.getAge();  //  getting the age.
		System.out.println(age);
		

	}

}
