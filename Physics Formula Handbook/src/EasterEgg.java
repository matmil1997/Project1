import java.util.Scanner;

public class EasterEgg extends Formula{
	public void calculate(){
		System.out.println("Wow you found the easter egg, congrats!");
		System.out.println("Enter two random values (as long as they're integers)");
		int val1;
		Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("Value 1 = " + str);
        val1 = Integer.parseInt(str);
        val1 = val1 * val1;		
        int val2;
        String str1 = input.nextLine();
        val2 = Integer.parseInt(str1);
        val2 = val2 * val2;
        System.out.println("Value 2 = " + str1);
        for(int o=val1;o<val2;o++){
        	System.out.println("*-_-*");
        }
	}
}
