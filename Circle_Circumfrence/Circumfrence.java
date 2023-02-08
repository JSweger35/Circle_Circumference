
/**
 * Write a description of class Circumfrence here.
 * Circumfrence stores a radius of a circle.
 * @author Jake Sweger
 * @version Version 1.0
 */
public class Circumfrence
{
    private double Radius; // Fahrenheit temperature
    private double Circumfrence; // Circumfrence

    /**
     * Default constructor for Circumfrence sets the default
     * value of the Circumfrence object to 0.0 degrees
     */
    public Circumfrence() {
        this(0.0);
    }
    
    /**
     * This constructor for Circumfrence sets the Circumfrence
     * value to the value from radius, then calculates
     * Circumfrence from radius
     * 
     * @param radius radius Circumfrence
     */
    public Circumfrence(double degrees) {
        setRadius(degrees);
    }

    /**
     * The setRadius method sets the radius value
     * 
     * @param radius Circumfrence value to store 
     */
    public void setRadius(double degrees) {
        Radius = degrees; // set Radius value
        Circumfrence = 2 * Radius * 3.141592653589793;
    }
    
    /**
     * getCircumfrence retrieves the Circumfrence value
     * 
     * @return a double value containing the Circumfrence
     */
    public double getCircumfrence() {
        return Circumfrence;
    }

}