
import java.util.Scanner;

public class TestableMomentum extends Formula {

	public void calculate() {
		System.out.println("This formula is the momentum formula:");
	    System.out.println("p=mv");
	    System.out.println("Enter values for m & v");
	    Scanner input = new Scanner(System.in);
	    String str = input.nextLine();
	    
	    try {
	    int m = Integer.parseInt(str);
	    if (m<0){
	    	   System.out.println("Mass as we know it cannot be negative");
	       } else {
	    System.out.println("m = " + str);
	    String str1 = input.nextLine();
	    int v = Integer.parseInt(str1);
		Momentum(m,v);
	       }
	    } catch (Exception e){
	    	System.out.println("Enter an integer next time please.");
	    }

	}

	public static int Momentum(int m, int v) {
		System.out.println("m = " + m + " v = " + v);
		int product = m * v;
		System.out.println("Momentum is " + product + " kg m/s");
		System.out.println("----------------------------------------------------");	
	    System.out.println("Enter another letter or type Exit to terminate");
		return product;
	}

}
