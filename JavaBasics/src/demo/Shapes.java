package demo;

public class Shapes {
	
	int length;  //variable declared at class level are called as Fields
	int breadth;
	
	public Shapes(){
		length = 3;
		breadth = 2;
	}
	
	public Shapes(int a, int b){
		length = a;
		breadth = b;
	}
	
	
	public void area(){
		System.out.println("Area of rectangle = " + (length*breadth) + " centimeter squared");
	}
	
	
	public static void main(String[] args) {
//		Shapes rectangle = new Shapes();
//		rectangle.area();
		
		Shapes rectangle2 = new Shapes(7,4);
		rectangle2.area();
		
	}

}
