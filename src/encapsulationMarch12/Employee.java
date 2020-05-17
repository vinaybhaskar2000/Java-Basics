package encapsulationMarch12;

public class Employee {

	public String name;
	private int age;
	
	public void getCity()
	{
		System.out.println("Get City...");
	}
	private void getCountry()
	{
		System.out.println("Get Country...");
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.name = "Tom";
		e.age  = 25;
		
		System.out.println(e.name+"  "+e.age);
		e.getCity();
		e.getCountry();
	
	}

}
