package yabo;
import static java.lang.System.out;

public class symbol {
	enum Symbol {
		cherry, lemon, kumquat, rutabaga
		}
	public static void main(String[] args) {
		for (Symbol leftReel : Symbol.values()) {
			out.println(leftReel);
		}

	}

}
