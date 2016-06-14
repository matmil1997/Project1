
import java.util.Scanner;

public class TestableKE extends Formula {

	public void calculate() {
		System.out.println("This formula is the Kinetic Energy formula:");
	    System.out.println("E=1/2 mv^2");
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
		KE(m,v);
	       }
	    } catch (Exception e){
	    	System.out.println("Enter an integer next time please.");
	    }

	}

	public static double KE(int m, int v) {
		System.out.println("m = " + m + " v = " + v);
		double product = 0.5 * (double) m * v * v;
		System.out.println("Kinetic Energy is " + product + " J");
		System.out.println("----------------------------------------------------");	
	    System.out.println("Enter another letter or type Exit to terminate");
		return product;
	}

}
