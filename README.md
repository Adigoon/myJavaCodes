# myJavaCodes
Some of my java projects
package Yabo;
import static java.lang.System.out;

public class myRPS {
	enum Symbol{
		Rock, Paper, Stone
	}
	public static void main(String[] args) {
		for(Symbol left : Symbol.values()){
			for(Symbol right : Symbol.values()) {
			
					
					out.print(left);
					out.print(" ");
					out.println(right);
					
					
				}
			}
		}

	}


