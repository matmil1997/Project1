
import java.util.Scanner;

public class TestableArea extends Formula {

	public void calculate() {
		System.out.println("This formula is for the area of a circle:");
	    System.out.println("A=pi*r^2");
	    System.out.println("Enter value for r");
	    Scanner input = new Scanner(System.in);
	    String str = input.nextLine();
	    
	    try{
	    int r = Integer.parseInt(str);
	    if (r<0){
	    	   System.out.println("r cannot be negative");
	    	   r = r * -1;
	       }
	    System.out.println("r = " + r);
		Area(r);
	    } catch (Exception e){
	    	System.out.println("Enter an integer next time please.");
	    }

	}

	public static double Area(int r) {
		double pi = 3.14;
		double product = pi * r * r;
		System.out.println("Area is " + product + " m^2");
		System.out.println("----------------------------------------------------");	
	    System.out.println("Enter another letter or type Exit to terminate");
		return product;
	}

}
