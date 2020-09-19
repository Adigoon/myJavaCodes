package yabo;
import java.util.Scanner;

public class teams {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int hankees, socks;
		System.out.println("Hankees and Socks scores?: ");
		hankees = s.nextInt();
		socks = s.nextInt();
		
		System.out.println();
		
		if(hankees > socks) {
			System.out.print("Hankees: ");
			System.out.println(hankees);
			System.out.print("Socks: ");
			System.out.println(socks);
		}
		
		else {
			System.out.print("Socks: ");
			System.out.println(socks);
			System.out.print("Hankees:");
			System.out.println(socks);
			
		}
s.close();
	}

}
