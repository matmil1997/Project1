
import java.util.Scanner;

public class TestableVoltage extends Formula {

	public void calculate() {
		System.out.println("This formula is Ohm's Law:");
	    System.out.println("V=IR");
	    System.out.println("Enter values for I & R");
	    Scanner input = new Scanner(System.in);
	    String str = input.nextLine();
	    
	    try {
	    int I = Integer.parseInt(str);
	    System.out.println("I = " + str);
	    String str1 = input.nextLine();
	    int R = Integer.parseInt(str1);
		Volt(I,R);
	    } catch (Exception e){
	    	System.out.println("Enter an integer next time please.");
	    }

	}

	public static int Volt(int I, int R) {
		System.out.println("I = " + I + " R = " + R);
		int product =  I * R;
		System.out.println("Potential Difference is " + product + " Volts");
		System.out.println("----------------------------------------------------");	
	    System.out.println("Enter another letter or type Exit to terminate");
		return product;
	}

}
