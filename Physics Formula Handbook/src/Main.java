import java.util.Scanner;

public class Main {

       public static void main(String[] args) {
    	   boolean run = true;
              System.out.println("Welcome to the Physics Formula Handbook \nby Matija Milenovic 2016");
              System.out.println(" ");
              System.out.println("(Version still in beta, integer inputs only for now)");
              System.out.println("!!!Where there are several variables, \ninput them one by one, separated by hitting Enter!!!");
              System.out.println(" ");
              System.out.println("----------------------------------------------------");
              System.out.println(" ");
              System.out.println("Please enter the letter or name of a physics formula");
              System.out.println("A. Newton's Second Law");
              System.out.println("B. Momentum Formula");
              System.out.println("C. Einstein's Equation");
              System.out.println("D. Kinetic Energy Formula");
              System.out.println("E. Newton's Law of Gravitation");
              System.out.println("F. Ohm's Law");
              System.out.println("G. Area of a circle");
              System.out.println("H. Energy of a Photon");
              System.out.println("I. Print inputted values of an x^2 function");
              System.out.println("J. Coulomb's Law");
              System.out.println("Y. Names and units of variables");
              System.out.println("Z. List of constants");
              System.out.println("Type Exit to terminate program");
              System.out.println("----------------------------------------------------");
              
       	   while (run){
              
              // Scan
              Scanner input = new Scanner(System.in);
              String letter=input.nextLine();

              Formula f;
              //System.out.println(letter);
              
              switch(letter){
              
              //F=ma
              case "A" : 
            	  f = new NewtonsSecondLaw();
            	  f.calculate();
                     break;
                     
              case "Newton's Second Law" : 
            	  f = new NewtonsSecondLaw();
            	  f.calculate();
                     break;
                     
              //p=mv       
              case "B" :
                  f = new Momentum();
                  f.calculate();
                     break; 
                     
              case "Momentum" :
                  f = new Momentum();
                  f.calculate();
                     break;
                     
              case "Momentum Formula" :
                  f = new Momentum();
                  f.calculate();
                     break;
               
              // E=mc^2       
              case "C" :
                  f = new Einstein();
                  f.calculate();
                     break;
                     
              case "Einstein" :
                  f = new Einstein();
                  f.calculate();
                     break;
                     
              case "Einstein's Equation" :
                  f = new Einstein();
                  f.calculate();
                     break;
                     
              // E=1/2 mv^2
              case "D" :
            	  f = new Kinetic();
            	  f.calculate();
            	  	break;
            	  	
              case "Kinetic Energy Formula" :
            	  f = new Kinetic();
            	  f.calculate();
            	  	break;
            	  	
              case "Kinetic Energy" :
            	  f = new Kinetic();
            	  f.calculate();
            	  	break;
              
              //F=GMm/r^2  	
              case "E" :
            	  f = new Gravitation();
            	  f.calculate();
                     break;
                     
              case "Gravitation" :
            	  f = new Gravitation();
            	  f.calculate();
                     break;
                     
              case "Newton's Law of Gravitation" :
            	  f = new Gravitation();
            	  f.calculate();
                     break;
              
              // V=IR
              case "F" : 
            	  f = new Ohm();
            	  f.calculate();
                     break;
                     
              case "Ohm's Law" : 
            	  f = new Ohm();
            	  f.calculate();
                     break;   
              
              case "Ohm" : 
            	  f = new Ohm();
            	  f.calculate();
                     break;
                     
              // A=pi*r^2
              case "G" : 
            	  f = new AreaCircle();
            	  f.calculate();
                     break;
                     
              case "Area of Circle" : 
            	  f = new AreaCircle();
            	  f.calculate();
                     break;  
                     
              case "Circle" : 
            	  f = new AreaCircle();
            	  f.calculate();
                     break;
              
              //E=hf
              case "H" :
            	  f = new Photon();
            	  f.calculate();
            	  	break;
            	  	
              case "Energy of Photon" :
            	  f = new Photon();
            	  f.calculate();
            	  	break;
            
              // y=x^2
              case "I" :
            	  f = new xsquared();
            	  f.calculate();
            	  	break;
            	  	
              case "x^2" :
            	  f = new xsquared();
            	  f.calculate();
            	  	break;
            	  	
              // F=kQq/r^2
              case "J" :
            	  f = new Coulomb();
            	  f.calculate();
            	  	break;
            	  	
              case "Coulomb" :
            	  f = new Coulomb();
            	  f.calculate();
            	  	break;
            	
              // Variables	  	
              case "Y" :
                     System.out.println("Here is a list of the names and units of variables:");
                     System.out.println("F = Force = kg m/s^2");
                     System.out.println("m/M = Mass = kg");
                     System.out.println("a = Acceleration = m/s^2");
                     System.out.println("p = Momentum = kg m/s");
                     System.out.println("v = Velocity = m/s");
                     System.out.println("E = Energy = J");
                     System.out.println("r = Radius = m");
                     System.out.println("V = Potential Difference (Voltage) = Volts");
                     System.out.println("I = Current = Amps");
                     System.out.println("R = Resistance = Ohms");
                     System.out.println("A = Area = m^2");
                     System.out.println("f = Frequency = Hz");
                     break;
                     
              case "Variables" :
                  System.out.println("Here is a list of the names and units of variables:");
                  System.out.println("F = Force = kg m/s^2");
                  System.out.println("m/M = Mass = kg");
                  System.out.println("a = Acceleration = m/s^2");
                  System.out.println("p = Momentum = kg m/s");
                  System.out.println("v = Velocity = m/s");
                  System.out.println("E = Energy = J");
                  System.out.println("r = Radius = m");
                  System.out.println("V = Potential Difference (Voltage) = Volts");
                  System.out.println("I = Current = Amps");
                  System.out.println("R = Resistance = Ohms");
                  System.out.println("A = Area = m^2");
                  System.out.println("f = Frequency = Hz");
                  System.out.println("q/Q = Charge = C");
                  break;
                  
              case "Varialbes" :
            	  System.out.println("Did you mean Variables?");
                  System.out.println("Here is a list of the names and units of variables:");
                  System.out.println("F = Force = kg m/s^2");
                  System.out.println("m/M = Mass = kg");
                  System.out.println("a = Acceleration = m/s^2");
                  System.out.println("p = Momentum = kg m/s");
                  System.out.println("v = Velocity = m/s");
                  System.out.println("E = Energy = J");
                  System.out.println("r = Radius = m");
                  System.out.println("V = Potential Difference (Voltage) = Volts");
                  System.out.println("I = Current = Amps");
                  System.out.println("R = Resistance = Ohms");
                  System.out.println("A = Area = m^2");
                  System.out.println("f = Frequency = Hz");
                  System.out.println("q/Q = Charge = C");
                  break;
                  
              case "Suprise me" :
            	  f = new EasterEgg();
            	  f.calculate();
            	  	break;
                     
              // Constants        
              case "Z" :
                  	 System.out.println("Here is a list of the constants used in this program:");
            	  	 System.out.println("G = Newton's Gravitational Constant = 6.67*10^-11 m^3 kg^-1 s^-2");
            	  	 System.out.println("c = Speed of light = 3*10^8 m/s");
                     System.out.println("Pi = 3.14");
                     System.out.println("h = Planck's Constant = 6.626*10-34 Js");
                     System.out.println("k = Coulomb's Law constant = 8.99*10^9 N m^2 C^-1");
                     System.out.println("----------------------------------------------------");
                     break;
                     
              case "Constants" :
            	  System.out.println("Here is a list of the constants used in this program:");
         	  	  System.out.println("G = Newton's Gravitational Constant = 6.67*10^-11 m^3 kg^-1 s^-2");
         	  	  System.out.println("c = Speed of light = 3*10^8 m/s");
                  System.out.println("Pi = 3.14");
                  System.out.println("h = Planck's Constant = 6.626*10-34 Js");
                  System.out.println("k = Coulomb's Law constant = 8.99*10^9 N m^2 C^-1");
                  System.out.println("----------------------------------------------------");
                  break;
                  
              case "Show options":
            	  System.out.println("A. Newton's Second Law");
                  System.out.println("B. Momentum Formula");
                  System.out.println("C. Einstein's Equation");
                  System.out.println("D. Kinetic Energy Formula");
                  System.out.println("E. Newton's Law of Gravitation");
                  System.out.println("F. Ohm's Law");
                  System.out.println("G. Area of a circle");
                  System.out.println("H. Energy of a Photon");
                  System.out.println("I. Print inputted values of an x^2 function");
                  System.out.println("J. Coulomb's Law");
                  System.out.println("Y. Names and units of variables");
                  System.out.println("Z. List of constants");
                  System.out.println("Type Exit to terminate program");
                  System.out.println("----------------------------------------------------");
                  	break;
            	  
                  
              case "Exit" :
            	  System.out.println("BYE :)");
            	  run = false;
            	  break;
                     
                     
              default : 
                     System.out.println("Your input isn't on the list of options :(");
                     System.out.println("(See table of contents for valid options)");
                     System.out.println("----------------------------------------------------");
                     System.out.println("Enter another letter or type Exit to terminate");
                     System.out.println("Hint: type 'Show options' if you're stuck!");
              
              }
              

       }


       }
   }


