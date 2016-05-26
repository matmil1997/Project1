import java.util.Scanner;

public class Gravitation extends Formula{
	public void calculate(){
		System.out.println("This formula is Newton's Law of Gravitation:");
        System.out.println("F=GMm/r^2");
        System.out.println("M-->   <--m   note that bodies experience equal but opposite forces");
        System.out.println("Enter values for M, m & r");
        double F1;
        double G= 6.67E-11;
        int M;
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("M = " + str);
        M = Integer.parseInt(str);
        int m4;
        String str1 = input.nextLine();
        m4 = Integer.parseInt(str1);
        System.out.println("M = " + str + " m= " + m4);
        if (M<0 || m4<0){
        	System.out.println("Mass as we know it cannot be negative");
        } else {
        int r;
        String str2 = input.nextLine();
        r = Integer.parseInt(str2);
        if (r==0){
        	System.out.println("Dividing by 0 is undefined, use a non-zero integer please");
        	System.out.println("----------------------------------------------------");
        } else {
        F1 = G * (double) (M * m4) / ((double)r * r);
        System.out.println("M= " + M + " m= " + m4 + " r= " + r);
        System.out.println("Force is " + F1 + " Newtons");
        System.out.println("----------------------------------------------------");
        System.out.println("Enter another letter or type Exit to terminate");
        }

       }
	}
}