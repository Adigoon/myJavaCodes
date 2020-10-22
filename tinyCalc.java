package yabo;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
public class tinyCalc {

	public static void main(String[] args) {
		Scanner s = new Scanner(in);
		double num1, num2;
		char oper;
		out.println("Input first number");
		num1 = s.nextDouble();
		out.println("Input second number");
		num2 = s.nextDouble();
		out.println("Choose operator: +, -, * or  /");
		oper = s.findWithinHorizon(".", 0).charAt(0);
		
		switch(oper) {
		case '+':
			out.println("You chose the addition operator");
			out.print(num1);
			out.print(" ");
			out.print(oper);
			out.print(" ");
			out.print(num2);
			out.print(" ");
			out.print("=");
			out.print(" ");
			out.print(num1 + num2);
			
			break;
			
		case '-':
			out.println("You chose the subtaction operator");
			out.print(num1);
			out.print(" ");
			out.print(oper);
			out.print(" ");
			out.print(num2);
			out.print(" ");
			out.print("=");
			out.print(" ");
			out.println(num1 - num2);
			break;
			
		case '*':

			out.println("You chose the multiplication operator");
			out.print(num1);
			out.print(" ");
			out.print(oper);
			out.print(" ");
			out.print(num2);
			out.print(" ");
			out.print("=");
			out.print(" ");
			out.println(num1 * num2);
			break;
			
		case '/':

			out.println("You chose the division operator");
			out.print(num1);
			out.print(" ");
			out.print(oper);
			out.print(" ");
			out.print(num2);
			out.print(" ");
			out.print("=");
			out.print(" ");
			out.println(num1 / num2);
			break;
		}
		// Built a basic calculator using a switch statement 
		
	
	}

}
