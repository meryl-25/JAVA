import java.util.Scanner;

class Test
{
	int x;
	String y;

	Test()
	{	
		x = 20;
		y = "abc";
		System.out.println("Variables are x and y");
	}
	void display()
	{
		System.out.println("Value of x : "+x);
		System.out.println("Value of y : "+y);
	}
}

class Const2
{
	public static void main(String args[])
	{
		Test ce = new Test();
		ce.display();
	}
}
