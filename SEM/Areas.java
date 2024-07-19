// Method Overloading

import java.util.Scanner;

class Area {

    final double pi = 3.14;

    void area(int r) {
        System.out.println("Area of circle = " + pi * r * r);
    }

    void area(int l, int b) {
        System.out.println("Area of rectangle = " + l * b);
    }
}

class Areas {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Area a = new Area();

        int ch = 0;  // Initialize ch

        while (ch != 3) {  // Loop until the user chooses to exit

            System.out.println("MENU");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");

            ch = sc.nextInt();  // Read user choice

            if (ch == 1) {
                System.out.println("Circle");
                System.out.println("Enter the radius ");
                int r = sc.nextInt();
                a.area(r);
            } 
            
            else if (ch == 2) {
                System.out.println("Rectangle");               
                System.out.println("Enter the length ");
                int l = sc.nextInt();
                System.out.println("Enter the breadth ");
                int b = sc.nextInt();
                a.area(l, b);
            } 
            
            else if (ch == 3) {
                System.out.println("Exited");
                break;  // Break out of the loop
            }
            
             else {
                System.out.println("Invalid choice");
            }
        }
    }
}
