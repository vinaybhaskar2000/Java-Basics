package encapsulationMarch12;

public class UserTest {

	public static void main(String[] args) 
	{
		User u1 = new User(0);
		u1.setName("Vinay Bhaskar");
		String abc = u1.getName();
		System.out.println("User Name is : "+abc );
		
		u1.setAge(28);
		System.out.println(u1.getAge());
		
		u1.setPhone(25451);
		System.out.println(u1.getPhone());
		
		User sal = new User(0);
		System.out.println(sal.getUserSalaryInfo());
		
		

	}

}
