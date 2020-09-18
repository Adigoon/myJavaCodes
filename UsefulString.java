package yabo;
import static java.lang.System.out;
import java.util.Scanner;

public class UsefulString {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);	
			String fullName;
			boolean taxable;
			double amount;
			double total;
			
			out.print("Customer's full name: ");
			fullName = s.nextLine();
			out.print("Amount: ");
			amount = s.nextDouble();
			out.print("Taxable? True/False: ");
			taxable = s.nextBoolean();
			
			if(taxable) {
			total = amount * 1.05;	
			}
			else {
				total = amount;
			}
			
			out.print("The total for " + fullName + " is" + " " + total);
	}

}
