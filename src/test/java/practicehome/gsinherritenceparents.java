package practicehome;

public class gsinherritenceparents {

int no=1000;	
double no1=100.50;	
String school="Nexttech";	
void ab()	{
	
}
private void school()	{
System.out.println("nexttech itc school");	
}
public void drinks() {
	System.out.println("lemonade");
}
protected void salary()	{
	System.out.println(1000);
}
	
public  static void school1()	{
	System.out.println("nexttech itc");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gsinherritenceparents tim= new gsinherritenceparents();
		
		System.out.println(tim.no);
		tim.ab();
		tim.drinks();
		tim.salary();
		tim.school();
		tim.school1();
		
	}

}
