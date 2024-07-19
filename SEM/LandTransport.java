//Inheritance with user input

import java.util.Scanner;

class TwoWheeler {

    int mileage;
    int price;

    TwoWheeler(int a, int b) {

        mileage = a;
        price = b;
    }
}

class Bike extends TwoWheeler {

    String fuel;
    int seats;
    int warranty;
    int cost;

    Bike(int a, int b, String c, int d, int e, int f) 
    {
        super(a, b);
        fuel = c;
        seats = d;
        warranty = e;
        cost = f;
    }
}

class Pulsar extends Bike {
    String modeltype;

    Pulsar(int a, int b, String c, int d, int e, int f, String g) 
    {
        super(a, b, c, d, e, f);
        modeltype = g;
    }
}

class LandTransport {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no. of bikes ");
        int n = scanner.nextInt();

        Pulsar[] m = new Pulsar[n];

        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Enter details for Pulsar Bike " + (i + 1) + ":");

            System.out.print("Mileage: ");
            int mileage = scanner.nextInt();

            System.out.print("Price: ");
            int price = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Fuel: ");
            String fuel = scanner.nextLine();

            System.out.print("Seats: ");
            int seats = scanner.nextInt();

            System.out.print("Warranty: ");
            int warranty = scanner.nextInt();

            System.out.print("Cost: ");
            int cost = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Model type: ");
            String modeltype = scanner.nextLine();

            m[i] = new Pulsar(mileage, price, fuel, seats, warranty, cost, modeltype);
        }

        //scanner.close();

        System.out.println();
        System.out.println("--- Bike details ---");

        for (int i=0; i<n; i++) {

            System.out.println("Model: " + m[i].modeltype);
            System.out.println("Mileage: " + m[i].mileage);
            System.out.println("Price: " + m[i].price);
            System.out.println();
        }
    }
}
