package inheritance;

public class Security extends Employee{
	
	
	private int bonus = 5000;
	
	public void message(){
		System.out.println("All the employees will get 3 WFHs from next month onwards");
	}
	
	public static void main(String[] args) {
		Security Vijay = new Security();
		Vijay.message();
		
	}

}
