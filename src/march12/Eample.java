package march12;

public class Eample {

	private int a = 10;
	int b = 20;
	int c;
	
	public int add(int q, int p)
	{
		c = a+b;
		return c;
	}
	
	public static void main(String[] args) 
	{
		Eample c = new Eample();
		int k = c.add(10, 20);
		System.out.println(k);		
		c.a = 10;

	}

}
