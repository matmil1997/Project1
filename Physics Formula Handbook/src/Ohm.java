import java.util.Scanner;

public class Ohm extends Formula{
	public void calculate(){
		System.out.println("This formula is Ohm's Law:");
      System.out.println("V=IR");
      System.out.println("Enter values for I & R");
      int V;
      int I;
      Scanner input = new Scanner(System.in);
      String str = input.nextLine();
      System.out.println("I = " + str);
      I = Integer.parseInt(str);
      int R;
      String str1 = input.nextLine();
      R = Integer.parseInt(str1);
      V = I * R;
      System.out.println("I= " + I + " R= " + R);
      System.out.println("Potential Difference is " + V + " Volts");
      System.out.println("----------------------------------------------------");
      System.out.println("Enter another letter or type Exit to terminate");

	}
}
