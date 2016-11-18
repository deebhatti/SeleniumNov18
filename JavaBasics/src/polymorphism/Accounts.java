package polymorphism;

public class Accounts extends Employee implements Employee2 {

	@Override
	public void message() {
		System.out.println("All the employees in Accounts department will get 7 WFHs from next month onwards");
		
	}

	@Override
	public void message2() {
		System.out.println("All the employees in Account department will have to work 3 extra days in a month ");
		
	}
	

}
