
import java.util.Scanner;

public class TestableCoulomb extends Formula {

	public void calculate() {
		System.out.println("This formula is Coulomb's Law:");
	    System.out.println("F=kQq/r^2");
	    System.out.println("Q-->   <--q   note that charges experience equal but opposite forces");
	    System.out.println("Enter values for Q, q & r");
	    Scanner input = new Scanner(System.in);
	    String str = input.nextLine();
	    
	    try{
	    int Q = Integer.parseInt(str);
	    System.out.println("Q = " + str);
	    String str1 = input.nextLine();
	    int q = Integer.parseInt(str1);
	    System.out.println("Q = " + str + " q = " + str1);
	    String str2 = input.nextLine();
	    int r = Integer.parseInt(str2);
	    if (r==0){
        	System.out.println("Dividing by 0 is undefined, use a non-zero integer please");
        	System.out.println("----------------------------------------------------");
        } else {
		ForceQ(Q,q,r);
        	} 
	    }
	    catch (Exception e) {
        	System.out.println("Enter an integer next time please.");
        }
	    
	}

	public static double ForceQ(int Q, int q, int r) {
		System.out.println("Q = " + Q + " q = " + q + " r = " + r);
		double k=9E9;
		double product = ((double) k * Q * q)/(r * r);
		System.out.println("Force is " + product + " Newtons");
		System.out.println("----------------------------------------------------");	
	    System.out.println("Enter another letter or type Exit to terminate");
		return product;
	}

}