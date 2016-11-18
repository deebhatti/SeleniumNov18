package polymorphism;

public class Test {
	
	public static void main(String[] args) {
		
		Employee Ram = new IT();
		Employee Sham = new HR();
		Employee Ajay = new Accounts();
		Employee Vijay = new Security();
		
		Ram.message();
		Sham.message();
		Ajay.message();
		Vijay.message();
		
		Employee2 John = new Accounts();
		Employee2 Sam = new Security();
		
		Accounts BradPitt = new Accounts();
		BradPitt.message();
		BradPitt.message2();
		
		John.message2();
		Sam.message2();
		
		Ram.day();
		Sham.day();
		Ajay.day();
		Vijay.day();
		
		
	}

}
