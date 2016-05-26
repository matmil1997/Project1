import java.util.Scanner;

public class NewtonsSecondLaw extends Formula {
   public void calculate() {
       System.out.println("This formula is Newton's Second Law:");
       System.out.println("F=ma");
       System.out.println("Enter values for m & a");
       int F;
       int m = 0;
       Scanner input = new Scanner(System.in);
       String str = input.nextLine();
       System.out.println("m = " + str);
       m = Integer.parseInt(str);
       if (m<0){
    	   System.out.println("Mass as we know it cannot be negative");
       } else {
       int a;
       String str1 = input.nextLine();
       a = Integer.parseInt(str1);
       F = m*a;
       System.out.println("m= " + m + " a= " + a);
       System.out.println("Force is " + F + " Newtons");
       System.out.println("----------------------------------------------------");	
       System.out.println("Enter another letter or type Exit to terminate");
       }
   }
}
