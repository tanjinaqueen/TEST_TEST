package practicehome;

public class gsoops1 {

	public int shetu=20;
	String flower="rose";
	double number=2.5;
	public void method1() {
		System.out.println("united states");
	}
	public static void method2() {
		System.out.println("united states of America");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		gsoops1 oops= new gsoops1();
		//create attribute
		method2();
		System.out.println(oops.shetu);
		System.out.println(oops.flower);
		oops.method1();
		System.out.println(oops.number);
		
	}

}
