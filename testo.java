package yabo;

import java.util.Scanner;

public class testo {

	public static void main(String[] args) {
		double tip = 2.00;
		
		double charge;
		
		System.out.println("How much is the charge for your car? ");
		
		Scanner s = new Scanner(System.in);
		
		charge = s.nextDouble();
		
		charge = charge + tip;
		
		System.out.print("Your total charge is $");
		System.out.print(charge);
		System.out.println();
		System.out.println("Thanks for your patronage");

	}

}
