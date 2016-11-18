package demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		try {
		System.out.println("Please enter the first number : ");
		int num1 = k.nextInt();
		
		System.out.println("Please enter the second number : ");
		int num2 = k.nextInt();
		
		System.out.println("Result of division of " + num1 + " with " + num2 + " = " + (num1/num2));
		}
		
		catch(ArithmeticException e){
			System.out.println("Cannot put zero in the denominator.Please try again");
		}
		
		catch(InputMismatchException e){
			System.out.println("Please enter an integer only");
		}
		
		catch(Exception e){
			System.out.println("Please try again with a valid input");
		}
	}

}
