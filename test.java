package yabo;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;


public class test {

	public static void main(String[] args) {
		double number;
		char response;
		
		Scanner s = new Scanner(in);
		out.println("input a number");
		number = s.nextDouble();
		
		Scanner s1 = new Scanner(in);
		out.println("convert to centimetres or millimetres?: ");
		response = s1.findWithinHorizon(".", 0).charAt(0);
		
		if (response == 'c') {
			
			out.println(number * 100);
		}
		
		else if(response == 'm') {
			
			out.println(number * 1000);
		}
		
		
		else {
			out.println();
		}

	}

}
