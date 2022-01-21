package practicehome;

import java.util.HashMap;

public class HashMaphome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		HashMap<Integer,Integer> country = new HashMap<Integer, Integer>();
		HashMap<Integer,String> student = new HashMap<Integer, String>();
		HashMap<String,String> countryl = new HashMap<String, String>();
		HashMap<String,String> country2 = new HashMap<String, String>();
		
	//add 4 country capital key and value in HashMap
		HashMap<String, String> countrycapital = new HashMap<String, String>();
		
		countrycapital.put("bangladesh","dhaka");
		countrycapital.put("pakistan","karachi");
		countrycapital.put("india","dillhi");
		countrycapital.put("USA","washington DC");
		System.out.println(countrycapital);
		try {
	//access	
		
		countrycapital.get("bangladesh");	
		countrycapital.get("pakistan");
		countrycapital.get("india");
		countrycapital.get("USA");
		System.out.println(countrycapital.get("bangladesh"));
		
		
    //remove item
		countrycapital.remove("india");
		System.out.println(countrycapital.remove("india") );
		
		
		
	//size
		countrycapital.size();
		System.out.println(countrycapital.size());
		}catch(Exception e) {
		System.out.println("result outbound");
		}
		
	//print key through for loop	
	for(String i:countrycapital.keySet()) {
		System.out.println(i);
	}	
		
	//print value through for loop	
	for(String i:countrycapital.values()) {
		System.out.println(i);
	}		
	//print keys and values	
	
			
	for (String i : countrycapital.keySet()) {
		 System.out.println("key: " + i + " value: " + countrycapital.get(i));
	}
	
	try {
	//store 5 bank names and balance using try and catch method in HashMap 
	HashMap<String, Integer> bankbalance = new HashMap<String, Integer>();
	bankbalance.put("chase", 5000);
	bankbalance.put("city", 5000);
	bankbalance.put("HSBC", 5000);
	bankbalance.put("capital one", 4000);
	bankbalance.put("bofa", 5000);
	System.out.println(bankbalance);
	//access get
	bankbalance.get("capital one");
	
	System.out.println(bankbalance.get("capital one"));
	//access remove
	bankbalance.remove("chase");
    bankbalance.remove("HSBC");
   
	System.out.println(bankbalance.remove("chase","HSBC"));
	//access size
	bankbalance.size();
	System.out.println(bankbalance.size());
	// Print keys
	
	for(String j:bankbalance.keySet()) {
	System.out.println(j);}
	//print value
	for(int k:bankbalance.values()) {	
	System.out.println(k);}
	
	//print key and value
	
	for(String k:bankbalance.keySet()) {
	
	System.out.println(" shetus bank name = " + k + " $ " + bankbalance.get(k) ) ;}
	
	
	}catch(Exception e)	{
		System.out.println("result issue");
	}		
		
	
			
	
	
	
/*	
	
	Assignment about HashMap
	1.	Store 5 student Id and name with try /catch method
	2.	Access number 1 student name and print
	3.	Remove 3rd student and print
	4.	Print the size 
	5.	Print all student id and name by using for loop. First separate id  then separate name and then both together. 
	And use any school name inside for loop.

	
*/	
	
	//1.	Store 5 student Id and name with try /catch method
	
	
	try {
		   
		HashMap <Integer,String > studentname = new HashMap<Integer,String >();
		
		studentname.put(01, "shetu");
		studentname.put(02, "fariya");
		studentname.put(03, "kamrul");
		studentname.put(04, "asha");
		studentname.put(05, "nayeem");
		
		//2.	Access number 1 student name and print
		student.get(01);
		
		System.out.println(studentname.get(06));
		
		//3.	Remove 3rd student and print
		
		studentname.remove(3);
		
		
		
		//4.	Print the size 
		studentname.size();
		System.out.println(studentname.size());
		
	//	Print all student id and name by using for loop
		for(Integer i:studentname.keySet() ) {
			System.out.println(i);
		}
	//separate name	
		
		for(String i:studentname.values() ) {
			System.out.println(i);	
		}
		
	// for loop both together. And use any school name inside for loop.

		
		for(Integer i:studentname .keySet()) {
			
			System.out.println(" shetus school = " +  i  +  " "  +  studentname. get(i))  ;}
			
		
	}catch(Exception e) {
		
	System.out.println("narandro modi is not a student");
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	}

}
