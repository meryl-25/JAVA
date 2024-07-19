// Nested class with user input

import java.util.Scanner;

class Center {

    int price;

    class Mainframe {

        int no_of_cores;
        String manufacturer;

        void get_pro() {

            Scanner s1 = new Scanner(System.in);

            System.out.println("Enter the price: ");
            price = s1.nextInt();

            System.out.println("Enter the number of cores: ");
            no_of_cores = s1.nextInt();
            s1.nextLine(); // Consume newline left-over

            System.out.println("Enter the manufacturer: ");
            manufacturer = s1.nextLine();
        }

        void display_pro() {

            System.out.println("");
            System.out.println("--- Details of Processor ---");
            System.out.println("Price: " + price);
            System.out.println("Number of cores: " + no_of_cores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    static class Memory {

        int memory;
        String manufacturer;
        static Scanner s1 = new Scanner(System.in); // Static Scanner for static class

        void get_ram() {

            System.out.println("Enter the size of memory (in GB): ");
            memory = s1.nextInt();

            System.out.println("Enter the manufacturer: ");
            manufacturer = s1.next();
            s1.nextLine(); // Consume newline left-over
        }

        void display_ram() {

            System.out.println("");
            System.out.println("--- Details of RAM ---");
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }
}

public class ComputerSystem {

    public static void main(String[] args) {
       
        Center cp  = new Center();
        Center.Mainframe pro = cp.new Mainframe();
        Center.Memory mem = new Center.Memory();

        pro.get_pro(); // Get processor details
        mem.get_ram(); // Get memory details

        // Display details
        pro.display_pro(); // Display processor details
        mem.display_ram(); // Display memory details
    }
}
