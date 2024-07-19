import java.util.Scanner;

class LoginFailedException extends Exception
{
    LoginFailedException(String s)
    {
        super(s);
    }
}

class LoginUser {

    static void value(String u, String p ) throws LoginFailedException
    {
        String username  = "Meryl";
        String password = "meryl@2002";

        if (username.equals(u) && password.equals(p))
        {
            System.out.println("Login successful");
        }

        else
        {
            throw new LoginFailedException("Login failed!!");
        }
    }

    public static void main(String args[]) {

        try {

            Scanner s = new Scanner(System.in);

            System.out.println("Enter username ");
            String uname = s.nextLine();

            System.out.println("Enter password ");
            String pword = s.nextLine();

            value(uname, pword);
        }
        catch(LoginFailedException e)
        {
            System.out.println(e);
        }
    }

}