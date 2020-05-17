package encapsulationMarch12;

public class User {

	private String name;
	private int age;
	private long phone;
	private int salary;
	
	public User(int salary)
	{
		this.salary = salary;
	}
	
	private int getUserSalary()
	{
		System.out.println(salary);
		return salary;
	}
	
	// We dont get access directly private method from other class. But i want to get the method. How? 
	// First write the Pubic method and call the private method from that.
	
	public int getUserSalaryInfo()
	{	
		 return  getUserSalary();
	}
	
	
	
	// have to define 3 getters and 3 setters methods.
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public long getPhone() {
		return phone;
	}

	
	
	
	
	public static void main(String[] args) 
	{
		User sal = new User(1000);
		System.out.println(sal.salary);

	}

	
}
