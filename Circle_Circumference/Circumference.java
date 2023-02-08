
/**
 * Write a description of class Circumference here.
 * Circumference stores a radius of a circle.
 * @author Jake Sweger
 * @version Version 1.0
 */
public class Circumference
{
    private double Radius; // Fahrenheit temperature
    private double Circumference; // Circumference

    /**
     * Default constructor for Circumference sets the default
     * value of the Circumference object to 0.0 degrees
     */
    public Circumference() {
        this(0.0);
    }
    
    /**
     * This constructor for Circumference sets the Circumference
     * value to the value from radius, then calculates
     * Circumference from radius
     * 
     * @param radius radius Circumference
     */
    public Circumference(double radius) {
        setRadius(radius);
    }

    /**
     * The setRadius method sets the radius value
     * 
     * @param radius Circumference value to store 
     */
    public void setRadius(double radius) {
        Radius = radius; // set Radius value
        Circumference = 2 * Radius * 3.141592653589793;
    }
    
    /**
     * getCircumference retrieves the Circumference value
     * 
     * @return a double value containing the Circumference
     */
    public double getCircumference() {
        return Circumference;
    }

}