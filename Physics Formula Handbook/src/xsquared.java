import java.util.Scanner;
public class xsquared extends Formula{
	public void calculate(){
		System.out.println("This prints the inputted values of an x^2 function");
		System.out.println("f(x)=x^2");
		System.out.println("Enter range of x-values which you would like to graph");
		System.out.println("(First type the lower x-value, then the higher one)");
		int xmin;
		Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        
        try {
        xmin = Integer.parseInt(str);
        System.out.println("Min. x-value = " + str);
		int xmax;
		String str1 = input.nextLine();
	    xmax = Integer.parseInt(str1);
	    System.out.println("Max. x-value = " + str1);
	    System.out.println("");
	    if(xmin > xmax){
	    System.out.println("Your lower value is greater than your higher value");
	    }
	    for (int j=xmin; j <= xmax ; j++){
	    	int y = j * j;
	    	System.out.println("When x= " + j + ", y= " + y);
	    }
	    System.out.println("----------------------------------------------------");
	    System.out.println("Enter another letter or type Exit to terminate");
	
	} catch (Exception e){
		System.out.println("Enter an integer next time please.");
	}
	}
}