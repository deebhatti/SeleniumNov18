package demo;

public class Calculator {
	
	public Calculator(){
		
	}
	
	public int add(int a, int b){		// a and b are called as formal parameters of method add
		return (a+b);
	}	
	
	public void sub(int a, int b){
		System.out.println(a-b);
	}
	
	public void multiply(int a, int b){
		System.out.println(a*b);
	}
	
	public void divide( int a, int b){
		System.out.println(a/b);
	}
	
	
	public static void main(String[] args) {
		
		Calculator basicCal = new Calculator();
		
		System.out.println(basicCal.add(5,6));
						// 5 and 6 are the actual parameters
		
		basicCal.multiply(5, 6);
		basicCal.multiply(89, 29);
		
		basicCal.divide(600, 10);
	}
	
	
	
	
	
	
	
	
	

}
