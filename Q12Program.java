/*
Create an interface having prototypes of functions area() and perimeter(). Create two class Circle and Rectangle which implements the above
interface. Create a menu driven program to find area and perimeter of objects.
*/

import java.util.Scanner;

interface Measurement 
{
    void area();
    void perimeter();
    void input(Scanner s);
}

class Circle implements Measurement
{
    int r;

    public void input(Scanner s)
    {
        System.out.println("Enter the radius");
        r = s.nextInt();
        area();
        perimeter();
    }

    public void area()
    {
        System.out.println("Area of the circle "+ 3.14*r*r);
    }

    public void perimeter()
    {
        System.out.println("Perimeter of the circle "+ 2*3.14*r);
    }
}

class Rectangle implements Measurement
{
    int l,b;

    public void input(Scanner s)
    {
        System.out.println("Enter the length");
        l = s.nextInt();
        System.out.println("Enter the breadth");
        b = s.nextInt();
        area();
        perimeter();
    }

    public void area()
    {
        System.out.println("Area of the Rectangle "+ l*b);
    }

    public void perimeter()
    {
        System.out.println("Perimeter of the rectangle "+ 2*(l+b));
    }
    
}

class Q12Program
{
    public static void main(String args[])
    {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Scanner s = new Scanner(System.in);

        int ch;
        do
        {
            System.out.println("\n 1.Circle \n 2.Rectangle\n 3.Exit\n Enter choice\n");
            ch = s.nextInt();

            if(ch == 1)  
            {
                c.input(s);
            }

            else if(ch == 1)  
            {
                r.input(s);
            }

            else if(ch == 3)  
            {
                System.out.println("Exited");
                break;
            }

            else
            {
                System.out.println("Invalid choice");
            }

        }while(ch != 0);
    }
}