
/**
 * Write a description of class Circumfrence here.
 * Circumfrence stores a radius of a circle.
 * @author Jake Sweger
 * @version Version 1.0
 */
public class Circumfrence
{
    private double Radius; // Fahrenheit temperature
    private double Circumfrence; // Celsius temperature
    private double degreesKelvin; // Kelvin temperature

    /**
     * Default constructor for Circumfrence sets the default
     * value of the Circumfrence object to 0.0 degrees
     */
    public Circumfrence() {
        this(0.0);
    }
    
    /**
     * This constructor for Temperature sets the Fahrenheit
     * value to the value from degrees, then calculates
     * equivalent Celsius and Kelvin values using the method
     * setRadius()
     * 
     * @param degrees degrees Fahrenheit
     */
    public Circumfrence(double degrees) {
        setRadius(degrees);
    }

    /**
     * The setRadius method sets the Fahrenheit temperature
     * 
     * @param degrees The Fahrenheit value to store 
     */
    public void setRadius(double degrees) {
        Radius = degrees; // set Fahrenheit value
        Circumfrence = 2 * Radius * 3.141592653589793;
    }
    
    /**
     * getCircumfrence retrieves the Circumfrence value
     * 
     * @return a double value containing the Celsius temperature
     */
    public double getCircumfrence() {
        return Circumfrence;
    }

}