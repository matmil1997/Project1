
import java.util.Scanner;

public class TestableEinstein extends Formula {

	public void calculate() {
		System.out.println("This formula is Einstein's mass-energy equivalence:");
	    System.out.println("E=mc^2");
	    System.out.println("Enter value for m");
	    Scanner input = new Scanner(System.in);
	    String str = input.nextLine();
	    
	    try{
	    int m = Integer.parseInt(str);
	    if (m<0){
	    	   System.out.println("Mass as we know it cannot be negative");
	       } else {
	    System.out.println("m = " + str);
		Einst(m);
	       }
	    } catch (Exception e){
	    	System.out.println("Enter an integer next time please.");
	    }

	}

	public static double Einst(int m) {
		double csq = 9E16;
		double product = m * csq;
		System.out.println("Energy is " + product + " J");
		System.out.println("----------------------------------------------------");	
	    System.out.println("Enter another letter or type Exit to terminate");
		return product;
	}

}
