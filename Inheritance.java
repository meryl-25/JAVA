import java.util.*;

class A
{
	int x = 10;

	void show()
	{	
		System.out.println("Haii");
 		System.out.println("The value of x = " + x); 
	}
}

class B extends A
{
    	int y = 50;

    	void display()
    	{   
       		System.out.println("Hello world");
        	System.out.println("The value of y = " + y);
    	}
}


class Inheritance
{
	public static void main(String args[])
	{	
		A a = new A();
		B b = new B();
		b.show();
		b.display();
		
	}
}