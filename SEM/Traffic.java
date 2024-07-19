//Inheritance with arguments passing

import java.util.*;

class Vehicle {

    int mileage;
    int price;

    Vehicle (int a, int b) {

        mileage = a;
        price = b;
    }
}

class Car extends Vehicle {

    String fuel;
    int seats;
    int warranty;
    int cost;

    Car (int a, int b, String c, int d, int e, int f) 
    {
        super(a, b);
        fuel = c;
        seats = d;
        warranty = e;
        cost = f;
    }

}

class Maruthi extends Car {

    String modeltype;
    
    Maruthi(int a, int b, String c, int d, int e, int f, String g)
    {
        super(a, b, c, d, e, f);

        modeltype = g;
    }
}

class Traffic {

    public static void main(String args []) {

        Maruthi m[] = new Maruthi[3];

        m[0] = new Maruthi(15,500000,"Petrol",4,5,550000,"Swift");
         m[1] = new Maruthi(20,600000,"Diesel",4,5,650000,"Baleno");
          m[2] = new Maruthi(18,550000,"Petrol",4,5,600000,"Alto");

        for(Maruthi car : m) {

            System.out.println("Model : " +car.modeltype);
            System.out.println("Mileage : " +car.mileage);
            System.out.println("Price : " +car.price);
            System.out.println("");
        }
         
    }
}