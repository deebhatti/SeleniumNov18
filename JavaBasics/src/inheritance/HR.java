package inheritance;

public class HR extends Employee {
	
	
	private int bonus = 12000;

	
	
	public static void main(String[] args) {
		HR Sham = new HR();
		
		System.out.println("Sham's bonus = $ " + Sham.bonus);
		System.out.println("Sham's Salary = $ " + Sham.Salary);
		
		Sham.message();
	}
	
}




