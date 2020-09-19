package yabo;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
public class there {

	public static void main(String[] args) {
		char response = ' ';
		
		Scanner s = new Scanner(in);
		
		 while (response != 'Y' && response != 'y') {
			 out.print("Are we there yet? ");
			 response = s.findWithinHorizon(".", 0).charAt(0);
			 
			 
			 
		 }
		 out.print("Whew");
	}

}
