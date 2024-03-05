import java.util.Scanner;
class Product
{
	int pcode;
	String pname;
	float price;


	void display()
	{
		System.out.println("Product code : " +pcode);
		System.out.println("Product name : " +pname);
		System.out.println("Price is : " +"Rs."+price);
	}

	public static void main(String args[])
    {
          try
          {
	        Scanner sc = new Scanner(System.in);
	        Product p1 = new Product();
	        Product p2 = new Product();
	        Product p3 = new Product();

	
        	System.out.println("\n Product 1");
	
	        System.out.println("Enter the product code - ");
	        p1.pcode = sc.nextInt();

	        System.out.println("Enter the product name - ");
	        p1.pname = sc.next();

	        System.out.println("Enter the product price - ");
	        p1.price = sc.nextFloat();
		
		    p1.display();
		    
		System.out.println("\n");
		    
		System.out.println("Product 2");
		    
	        System.out.println("Enter the product code - ");
	        p2.pcode = sc.nextInt();

	        System.out.println("Enter the product name - ");
	        p2.pname = sc.next();

	        System.out.println("Enter the product price - ");
	        p2.price = sc.nextFloat();
		
		    p2.display();
		    
		    if(p1.price < p2.price)
		    {
		        System.out.println("\n Product 1 has lowest price");
		    }
		    else
		    {
		        System.out.println("\n Product 2 has lowest price");
		    }
		    
          }
          
          catch(Exception e)
          {
              System.out.println(e);
          }
	}
}