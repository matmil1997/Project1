
import java.util.Scanner;

public class TestableGravitation extends Formula {

	public void calculate() {
		System.out.println("This formula is Newton's Law of Gravitation:");
	    System.out.println("F=GMm/r^2");
	    System.out.println("M-->   <--m   note that bodies experience equal but opposite forces");
	    System.out.println("Enter values for M, m & r");
	    Scanner input = new Scanner(System.in);
	    String str = input.nextLine();
	    
	    try {
	    int M = Integer.parseInt(str);
	    System.out.println("M = " + str);
	    String str1 = input.nextLine();
	    int m = Integer.parseInt(str1);
	    if (M<0 || m<0){
	    	   System.out.println("Mass as we know it cannot be negative");
	       } else {
	    System.out.println("M = " + str + " m = " + str1);
	    String str2 = input.nextLine();
	    int r = Integer.parseInt(str2);
	    if (r==0){
        	System.out.println("Dividing by 0 is undefined, use a non-zero integer please");
        	System.out.println("----------------------------------------------------");
        } else {
		ForceGrav(M,m,r);
	       }
	      }
	    } catch (Exception e){
	    	System.out.println("Enter an integer next time please.");
	    }
	}

	public static double ForceGrav(int M, int m, int r) {
		System.out.println("M = " + M + " m = " + m + " r = " + r);
		double G= 6.67E-11; 
		double product = ((double) G * M * m)/(r * r);
		System.out.println("Force is " + product + " Newtons");
		System.out.println("----------------------------------------------------");	
	    System.out.println("Enter another letter or type Exit to terminate");
		return product;
	}

}