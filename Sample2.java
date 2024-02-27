class Sample2
 {
    public static void main(String args[]) 
    {
        String name = args[0];
        int rollno = Integer.parseInt(args[1]);
        System.out.println("Name = " + name);
        System.out.println("Rollno = " + rollno);

        show();

        Sample2 single = new Sample2();
        single.display();
    }

    static void show() 
    {
        System.out.println("Static");
    }

    void display() 
    {
        System.out.println("Not Static");
    }
}


