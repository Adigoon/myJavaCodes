package yabo;

class IntegerHolder {
	  int value;
	  static int howMany = 0;
	}
	 
	public class TryOuts {
	 
	  public static void main(String[] args) {
	    IntegerHolder holder1 = new IntegerHolder();
	    holder1.value = 79;
	    IntegerHolder.howMany++;
	 
	    IntegerHolder holder2 = new IntegerHolder();
	    holder2.value = 443;
	    IntegerHolder.howMany++;
	 
	    System.out.println(holder1.value); 
	    System.out.println(holder2.value); 
	 
	    System.out.println(IntegerHolder.howMany);
	 
	    //System.out.println(IntegerHolder.value); Why is this statement illegal?
	 
	    System.out.println(holder1.howMany);       // This statement is legal
	                                               // but the statement is
	                                               // misleading. Why?
		  				       // working on solving it.
		  
		  					//SOLVED
		  
 	  }
	}
