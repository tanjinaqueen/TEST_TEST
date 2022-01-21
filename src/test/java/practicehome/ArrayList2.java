package practicehome;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args, int i) {
/*		
// add 5 car name in ArrayList
		ArrayList<String>name = new ArrayList<String>();
		name.add("nissan");
		name.add("honda");
		name.add("kia");
		name.add("toyota");
		name.add("bmw");
	
	
//add 20 names in arraylist and loop	
	ArrayList<String>names = new ArrayList<String>();
	
	names.add("asma");
	names.add("asha");
	names.add("ahmed");
	names.add("brishti");
	names.add("edar");
	names.add("fariya");
	names.add("kamrul");
	names.add("sheema");
	names.add("salina");
	names.add("tahmina");
	names.add("tamanna");
	names.add("tahmina2");
	names.add("irfan");
	names.add("taqi");
	names.add("farid");
	names.add("soha");
	names.add("zarin");
	names.add("tasnim");
	names.add("nasir");
	names.add("alam");
	
//add remove 5 names from ArrayList
	
	names.remove("alam");
	names.remove("nasir");
	names.remove("tasnim");
	names.remove("zarin");
	names.remove("soha");
	                                                    
	  //3.please add the following items to a shopping list(in same order)
	
			
	ArrayList<String>ShoppingList = new ArrayList<String>();
	ShoppingList.add("Milk");
	ShoppingList.add("Bread");
	ShoppingList.add("Eggs");
	ShoppingList.add("Water");
	ShoppingList.add("Napkin");
	
	
	
	// 4.print out which item is stored in index 3
	ShoppingList.get(0);
	ShoppingList.get(1);
	ShoppingList.get(2);
	ShoppingList.get(3);
	ShoppingList.get(4);
	
	
	
	System.out.println(3);
	
	//5.Replace Napkin with the Paper Towel in the list.
	ShoppingList.set(4,"Paper Towel");
	
	//6..Write a for loop to print all add numbers from 1 to 5.
	
	for(int a=0;a<6;a=a+2) {
	System.out.println(a);	
	}	
		
	
		
	//7.Write a for loop to print all items from the shopping 
	//list.
	
		for(int a=0;a<ShoppingList.size();a=a++) {
			System.out.println(ShoppingList.get(a));
		}
		
		
	*/	
		
		
		
		
		
		
		
		
//	add 3 city name
		
		try {
		
		ArrayList<String>city=new ArrayList<String>();
		city.add("sunrise");
		city.add("plantation");
		city.add("sunrise blvd");
		
		//acccess the data
		
		city.get(4);
		System.out.println(city.get(2));
		
		
		
		//replace the data ,0 with lauderhill
		
		
		city.set(0, "lauderhill");
		System.out.println(city);
		//remove
		
		
		city.remove(1);
	//size	
		
		city.size();
		
		} catch ( Exception e	){
			System.out.println("there is no city");
		}
	}
	
	
	
	}


