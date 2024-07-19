
// Nested Class with arguments passing

import java.util.*;

class CPU {

    int price;

    CPU(int price) {

        this.price = price;
    }

    class Processor {

        int no_of_cores;
        String manufacturer;

        Processor(int no, String creator) {

            no_of_cores = no;
            manufacturer = creator;
        }

        void display_pro() {

            System.out.println("--- Details of Processor ---");
            System.out.println("Price is Rs." +price );
            System.out.println("Number of cores is " +no_of_cores);
            System.out.println("Manufacturer is " +manufacturer);
        }
    }


    static class RAM {

        int memory;
        String manufacturer;

        RAM(int size, String maker) {

            memory = size;
            manufacturer = maker;
        } 

        void display_ram() {

                System.out.println("");
                System.out.println("--- Details of RAM ---");
                System.out.println("Memory is " +memory+ " GB");
                System.out.println("Manufacturer is " +manufacturer);
        }  
    }   
}

class Computer {

    public static void main(String args[]) {

        CPU cp = new CPU(5000);
        CPU.Processor pro = cp.new Processor(4,"Intel");
        CPU.RAM mem  =  new CPU.RAM (8,"Kingston");

        pro.display_pro();
        mem.display_ram();

    }
}