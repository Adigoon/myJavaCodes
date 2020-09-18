package yabo;
import java.util.Scanner;

public class tiny {

	public static void main(String[] args) {
		int number1;
		int number2;
		int total;
		
		
		System.out.println("Welcome to Olaotan's Adding Machine");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Input first number: ");
	
	   number1 = s.nextInt();
	   
	   System.out.println("Input second number: ");
	   
	   Scanner s2 = new Scanner(System.in);
	   
	   number2 = s2.nextInt();
	   
	   
	   total = number1 + number2;
	   
	   
	   System.out.print("Total: ");
	
	   System.out.print(total);
	
	}

}
