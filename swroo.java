package yabo;
import java.util.Scanner;
import java.util.Random;
import static java.lang.System.in;
import static java.lang.System.out;
public class swroo {

	public static void main(String[] args) {
		Scanner s = new Scanner(in);
		Random myRandom = new Random();
			int randomNumber;
		out.println("Type your question my child: ");
		s.nextLine();
		
		randomNumber = myRandom.nextInt(10) + 1;
		
		
		switch(randomNumber) {
		 case 1:
	            out.println("Yes. Isn't it obvious?");
	            break;

	        case 2:
	            out.println("No, and don't ask again.");
	            break;

	        case 3:
	            out.print("Yessir, yessir!");
	            out.println(" Three bags full.");
	            break;

	        case 4:
	            out.println("What part of 'no' don't you understand?");
	            break;

	        case 5:
	            out.println("No chance, Lance.");
	            break;

	        case 6:
	            out.println("Sure, whatever.");
	            break;

	        case 7:
	            out.println("Yes, but only if you're nice to me.");
	            break;

	        case 8:
	            out.println("Yes (as if I care).");
	            break;

	        case 9:
	            out.println("No, not until Cromwell seizes Dover.");
	            break;

	        case 10:
	            out.println("No, not until Nell squeezes Rover.");
	            break;

	        default:
	            out.print("You think you have problems?");
	            out.print(" My random number generator is broken!");
	            break;
		}
			
			
			out.println("Goodbye");
			s.close();
			
	}

}
