import java.util.Scanner;

public class Kinetic extends Formula{
	public void calculate(){
        System.out.println("This formula is the kinetic energy formula:");
        System.out.println("E=1/2 mv^2");
        System.out.println("Enter values for m & v");
        double E1;
        int m3;
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("m = " + str);
        m3 = Integer.parseInt(str);
        if (m3 < 0){
        	System.out.println("Mass as we know it cannot be negative");
        } else {
        int v1;
        String str1 = input.nextLine();
        v1 = Integer.parseInt(str1);
        E1=m3 * v1;
        E1 = 0.5 * m3 * v1 * v1;
        System.out.println("m= " + m3 + " v= " + v1);
        System.out.println("Energy is " + E1 + " Joules");
        System.out.println("----------------------------------------------------");
        System.out.println("Enter another letter or type Exit to terminate");
        }
	}
}