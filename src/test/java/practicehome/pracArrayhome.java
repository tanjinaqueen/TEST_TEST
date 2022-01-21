package practicehome;

public class pracArrayhome {

	public static void main(String[] args) {
		/*multiple data when we store in 1 variable...
		 * to declare value define the variable with[]
		 * in array mostly use String.depened on data type,String always is double quotation.
		 * data type means. int=whole no,double =decimal.alphanumeric =String.
		 *Syntex;String/data type[]variablename={"value name","value name"};
*/
//store alphanumeric password with special corrector		
		
		String[]pass= {"Tihami12%"};
		System.out.println("pass");
		
		
		//store multiple lipstick data as one variable
		String[]lipstick= {"huda","mac","revlon","clinique","estee lauder","urban decay"};
		System.out.println(lipstick[0]);
		System.out.println(lipstick[1]);
		System.out.println(lipstick[4]);
		lipstick[1]="lime crime";
		System.out.println(lipstick[1]);
		
		//store decimal no money in one bank
		double[]bofa= {100.50,50.50,2025.25};
		  
		System.out.println(bofa[2] );
		
		//store 3 students id
		int[] id= {333,010,335};
		System.out.println(id[1]);
		
	//id should be in whole no as int
		//store 3 value which is contains alpha and numeric 
	String[]pw= {"setu123$","tihami123%","life_is_beautiful_1*"};
	System.out.println(pw[1]);
	pw[1]="i_love_my_mom";
	
	System.out.println(pw[1]);
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
