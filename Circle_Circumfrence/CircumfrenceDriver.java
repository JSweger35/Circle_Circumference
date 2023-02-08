import java.util.Scanner;
/**
* CircumfrenceDriver runs and tests the Circumfrence class.
* 
* @author Jake Sweger
* @version 1.0
*/
public class CircumfrenceDriver {
    /**
     * main() reads two Fahrenheit temperatures and 
     * displays their Celsius and Kelvin equivalents.
     */
    public static void main(String[] args) {
        double inputRadius = 0.0;
        Scanner keyboard = new Scanner(System.in); 
        Circumfrence t1 = new Circumfrence();
        Circumfrence t2;
        System.out.print("Enter the radius of a sphere: "); 
        inputRadius = keyboard.nextDouble(); 
        System.out.println("You entered " + inputRadius); 
        t1.setRadius(inputRadius);
        System.out.println("The circumference is " + t1.getCircumfrence()); 
        System.out.print("Enter another radius: ");
        inputRadius = keyboard.nextDouble();
        System.out.println("You entered " + inputRadius);
        t2 = new Circumfrence(inputRadius);
        System.out.println("The circumference is " + t2.getCircumfrence());
    }
}