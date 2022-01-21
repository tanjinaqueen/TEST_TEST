package geniusjavareview;

import java.util.ArrayList;
import java.util.HashMap;

public class reviewclass1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		//datatype variable =value
		int a=10;
		
		double b=10.5;
		char c='A';
				
		String name="shetu";
		
		//declare  add 2 and more value
		int a1=15;
		double b1= 15.1;
		double no=a1+b1;
		System.out.println(no);
		
		//declare sub 2 or more value
		
		int num=100;
		double num1=100.5;
		double num3=num-num1;
		
		System.out.println(num3);
		//multiply 2 no
		
		int number=50;
		double number1=20.5;
		double number2=number-number1;
		System.out.println(number2);
		
		//division
		
		int shetu=450;
		double shetu1 =20.10;
		double shetu2=shetu/shetu1;
		System.out.println(shetu2);
		
		//increment by 2
		
		int d=10;
		//d=d+2;
		d+=2;
		System.out.println(d);
		
		
		//decrement by 2
		
		int s= 40;
		//s=s-2;
		s-=2;
		System.out.println(s);
		/*
		//symbol
		== equale to
		&& and
		||or
		>less then
		<greater then
		<=greater equel
		>=less then equal
		! not equal
		
		*/	
		//for loop
		
		//syntex
		//for(statement1;statement2;statement3){sysout();}
		
		//print 10 car inventory 
		
		for(int car=1;car<=10;car=car+1) {
			System.out.println(car);
		}
		
		for(int car=10;car>=0;car=car-1) {
		System.out.println(car)	;
		}
		
		
		/// Question : if the weather is 70 or higher print hot	

		// if the weather is between 50-69 print mild
		// if the weather is between 30-49 print cold
		// if the weather is less than 30 print freezing
/*	int weather = 10;
			
	if(weather>=70) {
		System.out.println("hot");
	} else if ( weather>=50){
		System.out.println( "mild");
	}else if(weather>30) {
		System.out.println("cold");
		}else {
			System.out.println("weather is freezing");
		}
	
	
	////if your mark is  90 or more then print A,
	//if mark is more then 80 then print B otherwise print c
	
	int mark =50;
	if(mark>=90) {
	System.out.println("A")	;
	}else if(mark>=80) {
		System.out.println("b")	;	
	}else { 
		System.out.println("c")	;	
	}
	
	
	//// if your time is 23 or more then print good day
	// if your time is 12 then print good afternoon
	// if your time is 10 then print good morning
	// if your time is 16 then print good Afternoon
	
		int time=8;
		
		if(time>=23) {
			System.out.println("good day")	;	
		}else if (time>=12) {
			System.out.println("afternoon")	;
		}else if( time<=10) {
			System.out.println("morning")	;
		}else {
			System.out.println("evening")	;
		}
		
		///if you have $600 or more then buy iphone,
		//if you have less then 600 but more then 400 then buy samsung ,
		//if you have less then 400 and more then 200 then buy lg
		//otherwise buy an icecream
		
		int money=10;
		if(money>=600) {
			System.out.println("iphone");
		} else if (money>=400){
		System.out.println("samsung")	;
		}else if(money>=200) {
			System.out.println("LG");
		}else {
			System.out.println("icecream");
		}
		
		
	/*if	else
			If the earthquake rating is  8.00 or grater then print “great”

			 If the earthquake rating is  7.0 to 7.9  then print “major “

			 If the earthquake rating is  6.1 to 6.9 then print “ strong”

			 If the earthquake rating is  5.5 to 6.0 then print “moderate”

			 If the earthquake rating is  2.5 to 5.4 then print “ minor”

			 If the earthquake rating is  less then 2.4 ,then print “ rating can not be record”
		
		double rating =7.5;
		if(rating>=8.00) {
		System.out.println("great");	
		} else if(rating>=7.00) {
			System.out.println("major");	
		}else if( rating>=6.1) {
		System.out.println("strong");
		
		}else if(rating>=5.5){
			System.out.println("moderate");
			
		}else if(rating>=2.5) {
		System.out.println("minor");
		}else {
		System.out.println("rating cant be record");
		
		}
		
		
		
		/* 
		
	 If else’s condition
		If the mark greater than or equal to 75, then print the student is intelligent
		If the mark greater than or equal to 35 then print the student is average
		Otherwise the student is full.
		If possible find the gender too
		*/
		int no1=60;
		if(no1>=75) {
			System.out.println("intellegent");	
		}else if(no1>=35) {
			System.out.println("average");
		}else {
			System.out.println("student is full");
		}
		
		
		//array
			//Array[]variable name= {value1,value2};
		
		//store 5 funplace
		
		String[]funplace = {"water park","disneyland","in the game","mermaid park","monkey zoo"};
		
		System.out.println(funplace[2] );
		
	//replace-when will replace any value /item then we will replace 1 value with other value.
	// variable name [index no]="replace new value";
		
		funplace[0]="butterfly park";
		System.out.println(funplace[0]);
		
		
		System.out.println(funplace.length);
		
		//add 4  new student name id in the class in Array
		
	int [] id= {1,2,3,4};
		
		System.out.println(id[2]);
		//replace
		id[1]= 5;
		
		System.out.println(id[1]);
		
		System.out.println(id.length);
		
		//if asha's bp is more then 110 then print "high pressure"
		//if asha's bp is more then 80 then print "normal"
		//otherwise print asha is "asha need rest, come to the group study"
		
	int  bp = 40;
		if(bp>=110) {
			System.out.println("high pressure");
		}else if(bp>=80) {
			System.out.println("normal");
		}else {
			System.out.println("asha need rest, come to the group study");
		}
		
		//store 4 beach name in array
		
	//	datatype[]variable name= { value1,value2};
		
		String [] beachname= {"fort lauderdale","oakland park","miami beach","vero beach","pompano beach"};
//access
		
		System.out.println(beachname[2]);

	//replace 
				beachname[2]="keywest";
				System.out.println(beachname[2]);	
				
				//size		
				System.out.println(beachname.length);	
				
		//ArrayList	<datatype>variable name=new ArrayList<datatype>();
				
				ArrayList<String>funplace1 =new ArrayList<String>();		
				
			funplace1.add("monkeyzoo");
				funplace1.add("kiddyplace");
				funplace1.add("gamestop");
				funplace1.add("funplace");
				System.out.println(funplace1);
				
	//access
				funplace1.get(0);
				System.out.println(funplace1.get(0));
				
				
	//replace
				
				funplace1.set( 0,"butterflypark");
				System.out.println(funplace1.set(0,"butterfly park"));
				
				//remove
				funplace1.remove(2);
				
	//size		
				funplace1.size();		
				System.out.println(funplace1.size());
				//loop
				
				
				//add 4  new student name id in the class in ArrayList		
				
				ArrayList<Integer> nameid=new ArrayList<Integer>();
				nameid.add(10);
				nameid.add(11);
				nameid.add(12);
				nameid.add(13);
				
				//access
				nameid.get(1);
				System.out.println(nameid.get(1));
				//replace
				nameid.set(1, 14);
				System.out.println(nameid.set(1,14));
				//remove
				System.out.println(nameid.remove(2));
				
				//size
			System.out.println(nameid.size());
			//loop
			
			for(int z=0;z<nameid.size();z=z+1) {
				System.out.println(nameid.get(z));
			}
			
			
			//ADD 6 STATE(capitalname must be include) NAME IN USA USING ArrayList
			//Access the capital of USA
			//REplace any state name with other state
			//REMOVE THE CAPITAL from USA
			//print total size of the ArrayList.
			
		//	ArrayList<String>variable name= new ArrayList<String>();
			
			ArrayList<String>USA= new ArrayList<String>();
			USA.add("Arrizona");
			USA.add("florida");
			USA.add("texas");
			USA.add("virginia");
			USA.add("washington DC");
			USA.add("ny");
			//Access
			USA.get(4);
			
			//replace
			USA.set(0, "california");
			
			//remove
			USA.remove(4);
			
			//size
			USA.size();
			System.out.println(USA.size());
			
			//for loop
			
			for(int x=0;x<USA.size();x=x+1) {
				System.out.println(USA.get(x));
			}
			
//HashMap<datatype,datatype>variable name= new HashMap<datatype,datatype>();
			HashMap <Integer,String>car= new HashMap <Integer,String>();	
			// store 4 car year and model in HashMap
			car.put( 2021,"aqura");
			car.put(2021,"audi");
			car.put(2023,"bentley");
			car.put(2024,"bmw");
			
			//access
			car.get(2021);
			car.get(2022);
			car.get(2023);
			car.get(2024);
			System.out.println(2020);
			//remove
			car.remove(2022);
			
			//add
			car.put( 2020,"camry");
			
			//size
			car.size();
			
			
			
			
			//key
		for(int v:car.keySet()) {
			System.out.println(car.keySet());
			}
			
		//value
		for(String k:car.values()) {
			System.out.println(k);
			}
		
		
		//for loop
		//data type variable name=value
		//data type (int) variable name(a): value(keyset())
		
		for(int v:car.keySet()) {
			System.out.println("my car year and model is"  + " " + v + " " + car.get(v) );
		}
		/* Store 5 Actor and Actress name from Bangla cinema
		* Access your favorite couple from the list
		* use for loop
		*/
		
		HashMap <String,String>actor_actress= new HashMap <String,String>();	
		actor_actress.put("salman shah", "shabnoor");
		actor_actress.put("alamgir", "shabana");
		actor_actress.put("rajjak", "bobita");
		actor_actress.put("ferdous","purnima");
		actor_actress.put("shakib khan", "apu bishash");
		//access
		actor_actress.get("salman shah");
		
	//	loop key
		
		for(String l:actor_actress.keySet()) {
			System.out.println(actor_actress.keySet());
		}
		//loop values

		for(String l:actor_actress.values()) {
			System.out.println(actor_actress.values());
		}	
		
		//for loop
		for(String l:actor_actress.keySet()) {
		System.out.println("my favorite couple are "  + l + " " + actor_actress.get(l));
		}
		
		
		
		
		
		
		
		
		
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}	
		
		
	


