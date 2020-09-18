package yabo;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
public class usee {

	public static void main(String[] args) {
		Scanner s = new Scanner(in);
		char symbol = ' ';
		
		while (symbol != '@') {
		symbol = s.findWithinHorizon(".", 0).charAt(0);
		out.print(symbol);
		}

	}

}