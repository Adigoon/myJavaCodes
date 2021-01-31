package yabo;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class IOfiles {

	public static void main(String[] args)throws FileNotFoundException {
			Scanner s = new Scanner(new File("raawData.txt"));
			PrintStream p = new PrintStream("cookedData.txt");
			double unitPrice, total; 
			int quantity;
			
			unitPrice = s.nextDouble(); 
			quantity = s.nextInt();
			
			total = unitPrice * quantity;
			
			p.println(total);
			
			p.close();
			s.close();
	}

}
