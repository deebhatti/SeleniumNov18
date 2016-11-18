package demo;

import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		int correctPin = 9876;
		int tries = 0;
		System.out.println("Welcome to HDFC BAnk ATM");
		System.out.println("Please enter your pin");
		

		Scanner k = new Scanner(System.in);
		int input = k.nextInt();
		tries++;

		while ((input != correctPin) && (tries<3)) {
			System.out.println("Incorrect Pin, Try Again");
			System.out.println("Enter your Pin");
			input = k.nextInt();
			tries++;
		}
		
		if (tries==3){
			System.out.println("Sorry ! You have exceeded your maximum tries. Your card has been blocked.");
		}
		
		else {

		System.out.println("Pin Accepted, Welcome to home page of your account");
		}

	}

}
