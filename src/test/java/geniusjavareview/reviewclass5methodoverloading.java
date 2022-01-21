package geniusjavareview;

public class reviewclass5methodoverloading {
	
	
	
	
	
	public void amazon_login(String user_id, int phone_number) {
		
	}
	void amazon_login(int phone_number,String use_id) {
		
	}
	
	protected void amazon_login(String email_id,String user_id) {
		
	}
	
	private void amazon_login(int phone_number,int pw) {
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		reviewclass5methodoverloading obj=new reviewclass5methodoverloading();
		
		obj.amazon_login("12345678", "shetu123");
		
		obj.amazon_login(0, null);
		obj.amazon_login(null, 0);
		obj.amazon_login(null, null);
		
		
		
		
		
		
		
		
		
	}

}
