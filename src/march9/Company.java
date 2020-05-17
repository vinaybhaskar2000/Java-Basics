package march9;

public class Company {

	// class variables
	String name;
	String ceo;
	String productName;
	long revenue;
	int employeeCount;
	static int holidayCount=20;
	
	// creating the constructor
	
	public Company()
	{
		System.out.println(" Default Constructor");
	}
	
	public Company(int a)
	{
		System.out.println(" One Parameer Constructor..."+a);
	}
	
	// create the constructor with the class variables.
	
	public Company(String name, String ceo, String productName, long revenue, int employeeCount) {
	
		this.name = name;
		this.ceo = ceo;
		this.productName = productName;
		this.revenue = revenue;
		this.employeeCount = employeeCount;
		
	}

	public Company(String name, String ceo, String productName) {
		this.name = name;
		this.ceo = ceo;
		this.productName = productName;
	}

	public static void main(String[] args) 
	
	{
		//Company c1 = new Company(10);
		Company c2 = new Company("Google","Sundar Pichai","Google Cloud",8574685,10000);
		System.out.println(c2.name);
		System.out.println(c2.ceo);
		System.out.println(c2.productName);
		System.out.println(c2.revenue);
		System.out.println(c2.employeeCount);
		System.out.println(Company.holidayCount);
		
	}

	
}
