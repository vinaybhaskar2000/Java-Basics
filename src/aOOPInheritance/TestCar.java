package aOOPInheritance;

public class TestCar {

	public static void main(String[] args) 
	{
		BMW b = new BMW();
	b.start();
//		b.stop();
//		b.refuel();
//		b.autoParking();
//		b.engine();
		
		
		System.out.println(" ---");
		Car c = new Car();
//		c.start();
//		c.stop();
//		c.refuel();
		c.engine();
		
		
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		

	//	BMW g = (BMW) new Car();
		
	Vechicle v = new BMW();
	v.engine();
		
		System.out.println("---");
		
	Vechicle g = new Vechicle();
	//g.engine();
		
            
	//Car c2 = (Car) new Vechicle();
	//c2.engine();
	
	//BMW b2 = (BMW) new Vechicle();
	//b2.engine();
	
		
	
	
	}

}
