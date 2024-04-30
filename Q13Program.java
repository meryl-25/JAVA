//Area of different shapes using overloaded functions.


public class AreaCalculator {
    
    // Calculate area of a square
    public double calculateArea(double side) 
    {
        return side * side;
    }
    
    // Calculate area of a rectangle
    public double calculateArea(double length, double width) 
    {
        return length * width;
    }
    
    // Calculate area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    // Calculate area of a triangle
    public double calculateArea(double base, double height, String shape) 
       {
        if(shape.equalsIgnoreCase("triangle")) {
            return 0.5 * base * height;
        } else {
            System.out.println("Shape not supported!");
            return -1;
        }
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Calculate and print area of square
        double squareArea = calculator.calculateArea(5.0);
        System.out.println("Area of square: " + squareArea);

        // Calculate and print area of rectangle
        double rectangleArea = calculator.calculateArea(4.0, 6.0);
        System.out.println("Area of rectangle: " + rectangleArea);

        // Calculate and print area of circle
        double circleArea = calculator.calculateArea(3.0);
        System.out.println("Area of circle: " + circleArea);

        // Calculate and print area of triangle
        double triangleArea = calculator.calculateArea(4.0, 3.0, "triangle");
        System.out.println("Area of triangle: " + triangleArea);
    }
}
