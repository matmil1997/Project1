import java.util.Scanner;

public class Einstein extends Formula{
	public void calculate(){
		System.out.println("This formula is Einstein's mass-energy equivelance formula:");
        System.out.println("E=mc^2");
        System.out.println("Enter value for m");
        double E;
        int m2;
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("m = " + str);
        m2 = Integer.parseInt(str);
        double csq= 9E16;
        E = m2 * csq;
        System.out.println("Energy is " + E + " Joules");
        System.out.println("----------------------------------------------------");
        System.out.println("Enter another letter or type Exit to terminate");

	}

}