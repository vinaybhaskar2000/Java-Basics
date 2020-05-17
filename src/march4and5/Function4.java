package march4and5;

import java.util.ArrayList;

/**
 * 
 * @author INDIA
 *
 */
public class Function4 {

	//Give me all the employee names in your company
	
	
	/**
	 * This method: returns an Array List of Strings - returns employee list on the basis of company name. 
	 * @param companyName
	 * @return this method returns an Array List of Strings - returns employee list on the basis of company name. 
	 */
	public ArrayList<String> getEmployeeList(String companyName)
	{
		ArrayList<String> compList = new ArrayList<>();
		
		if (companyName.equals("IBM")) 
		{
			compList.add("Vinay");
			compList.add("Bhaskar");
			compList.add("Bhaskar");
		}
		
		else if (companyName.equals("Infosys")) 
		{
			compList.add("Raghu");
			compList.add("Rama");
			compList.add("Krishna");
		}
		
		else if (companyName.equals("Wipro")) 
		{
			compList.add("Praksh");
			compList.add("Jeevan");
			
		}
		
		else 
		{
			System.out.println(companyName+" Not found...!");
		}
		return compList;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Function4 h = new Function4();
		ArrayList<String> emp = h.getEmployeeList("Wipro");
		System.out.println(emp);
		
		ArrayList<String> empInfo = h.getEmployeeList("Infosys");
		System.out.println(empInfo);
		
		ArrayList<String> empI = h.getEmployeeList("TCS");
		System.out.println(empI);
		
	}

}
