package yabo;
import java.util.Scanner;
import static java.lang.System.out;
public class testDoWhile {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num;
		char reply;
	do {
		
		out.println("Enter a number: ");
		num = s.nextInt();
		out.print("Continue? (y/n) ");
		reply = s.findWithinHorizon(".", 0).charAt(0);
	}
	while (reply != 'y' && reply == 'n'); {
		
		if (reply != 'y') {
				out.println(num);
		}
		else{
			out.println("Stop");
		}
	}
	s.close();
	}

}
