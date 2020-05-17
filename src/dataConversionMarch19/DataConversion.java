package dataConversionMarch19;

public class DataConversion {

	public static void main(String[] args) 
	{
		// Convert String to int
		String x = "100";
		//System.out.println(x+20);
		
		
		// we have to use the concept of wrapper classes.
		
		int i = Integer.parseInt(x);
		
		//System.out.println(i);
		
//		String y = "122.25";
//		System.out.println(y+20);
//		double fg = Double.parseDouble(y);
//		System.out.println(fg);
//		System.out.println(fg+20);
		
		// Integer to String
		
		int cv = 100;
		System.out.println(cv+20);
		String abc = String.valueOf(cv);
		System.out.println(abc);
		System.out.println(abc+20);
		
		
		
		
	}

}
