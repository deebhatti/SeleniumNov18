package inheritance;

public class IT extends Employee {
	
	 int bonus = 10000;
	
	 public void day(){
			System.out.println("Today is Thursday");
		}
	
	public static void main(String[] args) {
		
		IT Ram = new IT();
		
		System.out.println("Ram's bonus = $ " + Ram.bonus);
		
		System.out.println("Ram's Salary = $" + Ram.Salary);
		
		Ram.day();
		
		Ram.message();
		
	}

}
