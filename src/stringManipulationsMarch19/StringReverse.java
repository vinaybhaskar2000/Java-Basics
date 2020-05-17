package stringManipulationsMarch19;

public class StringReverse {

	// Write a program to reverse a String
	
	 public static String reverseString(String str)
	 {
		 String rev = "";
		 int len = str.length();
		
		 if (len == 1) 
		 {
			 return str;
			 // we are doing this, because if a pass a single character 
			 //then there is no need to go to for loop
		 }
		 
		 if(len == 0)
		 {
			 return "-1"; 
			// if we provie nothing then we should return -1 which is integer, 
			//but we are retrning String, to conver the int to String we are putting the integere in double columns.
			 
		 }
		 
		for (int i = len-1; i >= 0; i--) 
		{
			rev = rev+str.charAt(i);
		}
		
		return rev;
	 }
	
	public static void main(String[] args) 
	{
		System.out.println(StringReverse.reverseString("Selenium"));
		System.out.println(StringReverse.reverseString("test"));
		System.out.println(StringReverse.reverseString("1234"));
		System.out.println(StringReverse.reverseString(" "));
		System.out.println(StringReverse.reverseString("T"));
		System.out.println(StringReverse.reverseString("TTT"));
		System.out.println(StringReverse.reverseString("")); // -1
	}

}
