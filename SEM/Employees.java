import java.util.Scanner;

class Employee {

    int eno;
    String ename;
    int esalary;

    /* Employee (int no, String name, int salary) {

        eno = no;
        ename = name;
        esalary = salary;
    } */

    void acceptvalues() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee no. ");
        eno = sc.nextInt();

        System.out.println("Enter employee name ");
        ename = sc.next();
        sc.nextLine();

        System.out.println("Enter employee salary ");
        esalary = sc.nextInt();

    }

    void display() {

        System.out.println("");
        System.out.println("Employee no. is " +eno);
        System.out.println("Employee name is " +ename);
        System.out.println("Employee salary is " +esalary);
    }
}

class Employees {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the no of employees ");
        int n = s.nextInt();

        Employee e[] = new Employee[n];

        for(int i=0; i<n; i++) {

            e[i] = new Employee();
            System.out.println("");
            System.out.println("Enter the details for employee " +(i+1));
            e[i].acceptvalues();
           // e[i].display();
        }

         System.out.println("");   
         System.out.println("Enter the employee no. to be searched ");
         int search = s.nextInt();

         int flag=0;

         for(int i=0; i<n; i++) {

            if(e[i].eno == search) {

                System.out.println("");
                System.out.println("----- Record found for employee no. " +search+ "-----");
                e[i].display();

                flag=1;
                break;

            }
         }  

    if(flag == 0)
        System.out.println("Employee not found!!");
    }
}