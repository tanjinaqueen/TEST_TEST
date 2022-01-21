package practicehome;

import java.util.ArrayList;

public class ArrayListhomeprac {

	public static void main(String[] args, int a) {
		// TODO Syntex=ArrayList<integer>variable name=new ArrayList<integer>();
		//Please store 5 Fruits in Walmart inventory using ArrayList
	//Apple, Grapes, Cherry, Orange, Kiwi, 
 ArrayList <String> fruits = new ArrayList();
 
   fruits.add("Apple");
 
   fruits.add("Grapes");

   fruits.add("Cherry");
   fruits.add("Orange");
   fruits.add("kiwi");

System.out.println(fruits);
// Please show how to Access all 5 Fruits in the data by using get method or get keyword 
   fruits.get(0);
   fruits.get(1);
   fruits.get(2);
   fruits.get(3);
   fruits.get(4);
//Please replace All 5 fruits with 5 vegetable potato, eggplant, tomato, cabbage, pepper from inventory using set method 
   
   fruits.set(0,"potato");
   fruits.set(1,"eggplant");
   fruits.set(2,"tomato");
   fruits.set(3,"cabbage");
   fruits.set(4,"pepper");
   System.out.println(fruits.get(4));
 
 //Please remove all the vegetable using the remove method

 
   fruits.remove("potato");
   fruits.remove("eggplant");
   fruits.remove("tomato");
   fruits.remove("cabbage");
   fruits.remove("pepper");
 //size
   fruits.size();
   System.out.println(fruits.size());
   
   
   
   
   
   
	}

}
