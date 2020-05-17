package stringManipulationsMarch19;

public class StringManipulations2 {

	public static void main(String[] args) 
	{
		// String str = "This is my first java code and iam so happy";
		
		String s = "        hello    world   ";
		// System.out.println(s.trim());
		
		String s1 = "   hello java  ";
		System.out.println(s1.replace(" ", ""));
		
		String abc = s1.trim().replace(" ", "");
		
		String dob = "10-10-1970";
		// But iam expecting : 10/10/970
		String j = dob.replace("-", "/");
		System.out.println(j);
		
		
		String firstString = "chrome";
		String secondString = "Chrome";
		System.out.println(firstString.equals(secondString));
		
		System.out.println(firstString.equalsIgnoreCase(secondString));
		
		
		String msg1 = "  welcome to java world  ";
		System.out.println(msg1.trim().contains("java"));
		
		
		
		
	}

}
