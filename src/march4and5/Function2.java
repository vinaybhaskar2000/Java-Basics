package march4and5;

public class Function2 {

	
	public int getMarks(String studentName)
	{
		int marks = -1;
		if (studentName.equals("Vinay")) 
		{
			marks = 90;
			//return marks;
		}
		else if (studentName.equals("Bhaskar")) 
		{
				marks = 80;
			//return marks;
		}
		else if (studentName.equals("basavaraju")) 
		{
				marks = 70;
			//return marks;
		}
		
		else
		{
			System.out.println("Student "+studentName+ " not found....!");
			//return marks;
		}
		
		return marks;
	}
	
	
	public static void main(String[] args) 
	{
		Function2 f = new Function2();
				int g =	f.getMarks("Vinay");
				System.out.println("Vinay got marks: "+g);
    
				int b =	f.getMarks("Bhaskar");
				System.out.println("Bhaskar got marks: "+b);
				
				int c =	f.getMarks("basavaraju");
				System.out.println("Basavaraju got marks: "+c);
				
				System.out.println("----");
				
				int n =	f.getMarks("Rajesh");
				System.out.println(n);
				
				int nl =	f.getMarks("Anarkali");
				System.out.println(nl);
				
				
	}

}
