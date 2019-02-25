package circle;

public class circle {
    private double radius;
    private final double pi = Math.PI;

    public circle (double   radius)
    {
        this.radius = radius;
    }

    public double area ()
    {
        return 2 * pi * radius * radius;
    }

    public double circunference ()
    {
        return 2*pi*radius;
    }

    public double getRadius()
    {
        return radius;
    }
}