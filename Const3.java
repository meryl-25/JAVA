import java.util.Scanner;

class Test
{
	int x;
	String y;

	Test(int a, String b)
	{	
		x = a;
		y = b;
		int la = a;
		String lb = b;
		System.out.println("MCA");
	}
	void display()
	{
		System.out.println("Roll No : "+x);
		System.out.println("Name : "+y);
	}
}

class Const3
{
	public static void main(String args[])
	{
		Test ce = new Test(38,"Meryl");
		ce.display();
	}
}
