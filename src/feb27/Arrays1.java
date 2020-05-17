package feb27;

public class Arrays1 {

	public static void main(String[] args) 
	{
		int k[] = new int[5];
		k[0] = 100;
		k[1] = 200;
		k[2] = 300;
		k[3] = 400;
		k[4] = 500;

		//System.out.println("The length of an array is : "+k.length);

		for (int i = 0; i < k.length; i++) 
		{
		 // System.out.println(k[i]);	
		}
		
		
		int z[] = new int[10];
		
		z[0] = 100;
		z[1] = 300;
		z[2] = 500;
		
		for (int i = 0; i < z.length; i++) 
		{
		// System.out.println(z[i]);	
		}
		
		
		boolean b [] = new boolean[3];
		b[0] = true;
		b[1] = false;
		b[2] = true;
		
		
		
		for (int i = 0; i < b.length; i++) 
		{
		// System.out.println(b[i]);	
		}
		
		
		
		String abc[] = new String[3];
		abc[1] = "Shiva";
		abc[2] = "Killer";
		abc[0] = "Criminal";
		
		for( int i = 0; i<abc.length; i++)
		{
			System.out.println(abc[i]);
		}
		
		
		char c[] = new char[2];
	//	System.out.println(c[0]+c[1]);
		
		
	}

}
