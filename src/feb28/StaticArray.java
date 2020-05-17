package feb28;

public class StaticArray {

	public static void main(String[] args) 
	{
			
		 /* 
			Write a program to create a static Array, having following cricket data:
	        --name, age, team name, DOB, gender, Strike Rate
	        --Try to create multiple Object Arrays for different players 
	        --Try to print all the values of each player on the console    
		*/
		
		  // Creating arrays with specifc data types.
			
			String emp[] = new String[1];
			emp[0] = "Raheem";
			
			int empAge[] = new int[1];
			empAge[0] = 26;
			
			String empTeam[] = new String[1];
			empTeam[0] = "Vikings";
			
			int dob[] = new int[1];	
			dob[0]= 1991;
			
			boolean gender[] = new boolean[1];
			gender[0] = "M" != null;
			
			double strikeRate[] = new double[1];
			strikeRate[0] = 116.8 ;
			
			
			System.out.println("Name: "+emp[0]);
			System.out.println("Age: "+empAge[0]);
			System.out.println("Team: "+empTeam[0]);
			System.out.println("DOB: "+dob[0]);
			System.out.println("Gender: "+gender[0]);
			System.out.println("Strike Rate: "+strikeRate[0]);
			System.out.println("---------------------");
			
		// Creating array with Object which will accept all the data types.
			
			Object player1 [] = new Object[6];
			player1 [0] = "John";
 			player1 [1] = 28;
 			player1 [2] = "Packers";
 			player1 [3] = 1988;
 			player1 [4] = "Male";
 			player1 [5] = 156.89;
			
 			for(int counter = 0; counter<player1.length; counter++)
 			{
 				System.out.println(player1[counter]);
 			}
 			
 			System.out.println("---------------------");
 			
 			Object Player2[] =new Object[6];
 			Player2[0] = "Tom";
 			Player2[1] = 29;
 			Player2[2] = "Eagles";
 			Player2[3] = 1990;
 			Player2[4] = "Male";
 			Player2[5] = 152.18;
 			
 			for (int i = 0; i < Player2.length; i++) 
 			{
 				System.out.println(Player2[i]);
			}	
 			
 			

 			Object Player3[] =new Object[6];
 			Player3[0] = "Hudson";
 			Player3[1] = 19;
 			Player3[2] = "GreenBay";
 			Player3[3] = 2000;
 			Player3[4] = "Male";
 			Player3[5] = 123.68;
			
 			System.out.println("---------------------");
 			for (int i = 0; i < Player3.length; i++) 
 			{
 				System.out.println(Player3[i]);
			}
 			
 			
	}

}
