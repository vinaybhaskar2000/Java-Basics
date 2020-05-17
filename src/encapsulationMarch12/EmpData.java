package encapsulationMarch12;

public class EmpData {

	
	private String name;
	private int age;
	private int salary;
	
	
	public EmpData() {
		
	}

	public EmpData(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	// Setter and Getter Methods...
	
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
	
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	
	
	
	
	

}
