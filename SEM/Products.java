import java.util.Scanner;

class Product {

    int pcode;
    String pname;
    int price;

    int acceptvalues() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product code : ");
        pcode = sc.nextInt();

        System.out.println("Enter the product name : ");
        pname = sc.next();
        sc.nextLine();

        System.out.println("Enter the price : ");
        price = sc.nextInt();

        return price;
    }

    void display() {

        System.out.println("Product code is : " +pcode);
        System.out.println("Product name is : " +pname);
        System.out.println("Product price is : " +price);
    }
}

class Products {

    public static void main(String args[]) {

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("Product 1");
        int price1 = p1.acceptvalues();

        System.out.println("Product 2");
        int price2 = p2.acceptvalues();

        System.out.println("Product 3"); 
        int price3 = p3.acceptvalues();

        System.out.println("Lowest price");

        if((price1 < price2) && (price1 < price3))
        {
                System.out.println("Product 1");
                p1.display();
        }

        else if((price2 < price1) && (price2 < price3))
        {
                System.out.println("Product 2");
                p2.display();
        }

        else if((price3 < price1) && (price3 < price2))
        {
                System.out.println("Product 3");
                p3.display();
        }
    }
}