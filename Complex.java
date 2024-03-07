class Complex3
{
	double real;
	double imag;

	//Constructor

	Complex3(double a,double b)
	{
		real=a;
		imag=b;
	}
	
}


class Complex
{
	public static void main(String args[])
	{
		Complex3 c1=new Complex3(2.1,4.3);
		Complex3 c2=new Complex3(1.0,4.0);
		Complex3 result;

		result=add(c1,c2);
		System.out.println("\n\tSum is "+result.real+" + "+result.imag+"i");
	}
	
	public static Complex3 add(Complex3 n1,Complex3 n2)
	{
		Complex3 res=new Complex3(0.0,0.0);
		res.real=n1.real+n2.real;
		res.imag=n1.imag+n2.imag;
		
		System.out.println("Complex Number 1 :\t"+n1.real+" + "+n1.imag+"i");
		System.out.println("Complex Number 2 :\t"+n2.real+" + "+n2.imag+"i");

		return res;
	}
}