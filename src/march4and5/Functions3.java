package march4and5;

public class Functions3 {

	
	public int[] getStudentMarks()
	{
		int marks[] = new int[4];
		marks[0] = 10;
		marks[1] = 20;
		marks[2] = 30;
		marks[3] = 40;
		
		return marks;
	}
	
	
	
	public static void main(String[] args) 
	{
		Functions3 h = new Functions3();
		
		int[] j = h.getStudentMarks();
		
		for(int k =0; k < j.length; k++)
		{
			System.out.println(j[k]);
		}

	}

}
