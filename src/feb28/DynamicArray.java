package feb28;

public class DynamicArray {

	public static void main(String[] args) 
	{
		// Defining an Object array, where we can pass all the values.
		Object object[] = new Object[5];
		object[0] = "Vinay";
		object[1] = 25;
		object[2] = 12.33;
		object[3] = true;
		object[4] = 'm';
		
		for(int i = 0; i<object.length; i++)
		{
			System.out.println(object[i]);
		}

		
		
		
	}

}
