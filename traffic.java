package yabo;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class traffic {
enum colour{green, yellow, red}
	public static void main(String[] args) {
		Scanner s = new Scanner(in);
		char r1, r2, r3, r4;
		colour which;
		boolean isApproach, isSafe, isDirect;
		out.println("Are you approaching a green light?:");
		r1 = s.findWithinHorizon(".", 0).charAt(0);		
		out.println("Is it safe to proceed through the intersection?: ");
		r2 = s.findWithinHorizon(".", 0).charAt(0);
		out.println("Is a police officer directing you not to proceed?: ");
		r3 = s.findWithinHorizon(".", 0).charAt(0);
		out.println("What colour is the traffic light? G, R or Y");
		r4 = s.findWithinHorizon(".", 0).charAt(0); 
		
		
		if (r4 == 'g') {
			which = colour.green;
			out.println(which);
		}
		
		if (r4 == 'y') {
			which = colour.yellow;
			out.println(which);
		}
		
		if (r4 == 'r') {
			which = colour.red;
			out.println(which);
		}
			if ((r1 == 'Y' || r1 == 'y') && (r2 == 'Y' || r2 == 'y')  && (r3 == 'N' || r3 == 'n') && (r4 == 'G' || r4 == 'g')) {
				
				out.println("Go");
				
			}
			
			if ((r1 == 'Y' || r1 == 'y') && (r2 == 'Y' || r2 == 'y')  && (r3 == 'Y' || r3 == 'y') && (r4 == 'Y' || r4 == 'R')) {
				
				out.println("Stop");
				
			}
			
			if ((r1 == 'Y' || r1 == 'y') && (r2 == 'N' || r2 == 'n')  && (r3 == 'N' || r3 == 'n')) {
				
				out.println("Stop");
		

	}

}
}