import java.util.Scanner;

public class Coulomb extends Formula{
	public void calculate(){
		System.out.println("This formula is Coulomb's Law:");
        System.out.println("F=kQq/r^2");
        System.out.println("Q-->   <--q   note that charges experience equal but opposite forces");
        System.out.println("Enter values for Q, q & r");
        double F2;
        double k=9E9;
        int Q;
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("Q = " + str);
        Q = Integer.parseInt(str);
        int q;
        String str1 = input.nextLine();
        q = Integer.parseInt(str1);
        System.out.println("Q = " + str + " q= " + str1);
        int r3;
        String str2 = input.nextLine();
        r3 = Integer.parseInt(str2);
        if (r3==0){
        	System.out.println("Dividing by 0 is undefined, use a non-zero integer please");
        	System.out.println("----------------------------------------------------");
        } else {
        F2 = k * (double) (Q * q) / ((double)r3 * r3);
        System.out.println("Q= " + Q + " q= " + q + " r= " + r3);
        System.out.println("Force is " + F2 + " Newtons");
        System.out.println("----------------------------------------------------");
        System.out.println("Enter another letter or type Exit to terminate");
        }
	}
}