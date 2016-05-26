import java.util.Scanner;

public class AreaCircle extends Formula{
	public void calculate(){
        System.out.println("This formula is the area of a circle:");
        System.out.println("A=Pi r^2");
        System.out.println("Enter value for r");
        double A;
        double Pi=3.14;
        int r2;
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        r2 = Integer.parseInt(str);
        if (r2<0){
        	System.out.println("You entered a negative value for r, but it's grand because it's being squared");
        	r2 = r2 * -1;
        }
        A = Pi * r2 * r2;
        System.out.println("r= " + r2);
        System.out.println("Area of the circle is " + A + " m^2" );
        System.out.println("----------------------------------------------------");
        System.out.println("Enter another letter or type Exit to terminate");

	}
}
