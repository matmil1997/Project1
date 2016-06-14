
import java.util.Scanner;

public class TestablePhoton extends Formula {

	public void calculate() {
		System.out.println("This formula is the energy of a photon:");
	    System.out.println("E=hf");
	    System.out.println("Enter value for f");
	    Scanner input = new Scanner(System.in);
	    String str = input.nextLine();
	    
	    try {
	    int f = Integer.parseInt(str);
	    if (f<0){
	    	   System.out.println("Frequency as we know it cannot be negative");
	       } else {
	    System.out.println("f = " + str);
		Photonify(f);
	       }
	    } catch (Exception e){
	    	System.out.println("Enter an integer next time please.");
	    }
	}

	public static double Photonify(int f) {
		double hplanck = 6.626E-34;
		double product = hplanck * f;
		System.out.println("Energy is " + product + " J");
		System.out.println("----------------------------------------------------");	
	    System.out.println("Enter another letter or type Exit to terminate");
		return product;
	}

}
