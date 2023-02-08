import java.util.Scanner;
/**
* CircumferenceDriver runs and tests the Circumference class.
* 
* @author Jake Sweger
* @version 1.0
*/
public class CircumferenceDriver {
    /**
     * main() reads two Fahrenheit temperatures and 
     * displays their Celsius and Kelvin equivalents.
     */
    public static void main(String[] args) {
        double inputRadius = 0.0;
        Scanner keyboard = new Scanner(System.in); 
        Circumference t1 = new Circumference();
        Circumference t2;
        System.out.print("Enter the radius of a sphere: "); 
        inputRadius = keyboard.nextDouble(); 
        System.out.println("You entered " + inputRadius); 
        t1.setRadius(inputRadius);
        System.out.println("The circumference is " + t1.getCircumference()); 
        System.out.print("Enter another radius: ");
        inputRadius = keyboard.nextDouble();
        System.out.println("You entered " + inputRadius);
        t2 = new Circumference(inputRadius);
        System.out.println("The circumference is " + t2.getCircumference());
    }
}