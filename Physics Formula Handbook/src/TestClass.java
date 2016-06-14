
import java.util.Scanner;

public class TestClass extends Formula {

	public void calculate() {
		System.out.println("This formula is Newton's Second Law:");
	    System.out.println("F=ma");
	    System.out.println("Enter values for m & a");
	    Scanner input = new Scanner(System.in);
	    String str = input.nextLine();
	    
	    try {
	    int m = Integer.parseInt(str);
	    if (m<0){
	    	   System.out.println("Mass as we know it cannot be negative");
	       } else {
	    System.out.println("m = " + str);
	    String str1 = input.nextLine();
	    int a = Integer.parseInt(str1);
		Force(m,a);
	       }
	    } catch (Exception e){
	    	System.out.println("Enter an integer next time please.");
	    }
	}

	public static int Force(int m, int a) {
		System.out.println("m = " + m + " a = " + a);
		int product = m * a;
		System.out.println("Force is " + product + " Newtons");
		System.out.println("----------------------------------------------------");	
	    System.out.println("Enter another letter or type Exit to terminate");
		return product;
	}

}
