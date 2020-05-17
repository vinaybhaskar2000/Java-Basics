package feb25;

public class IncrementalAndDecrementalConcept {

	public static void main(String[] args) 
	{
		int x = 1;
	//	System.out.println(" The initial value of x is : "+x);
		int y = x++;
		
	//    System.out.println(" The value of x after increment is : "+x);
	//    System.out.println(" The value of y is : "+y);
		
		
		int p = -1;
		int q = p++;
	//	System.out.println(p);
	//	System.out.println(q);
		
		
		// PRE Increment
		
		int  a = 1;
		int b = ++a;
		
	//	System.out.println(a);
	//	System.out.println(b);
		
		// Post Decrement
		
		int m = 2;
		int n = m--;
		
		System.out.println(n);
		System.out.println(m);
		
		
		
		
		
		

	}

}
