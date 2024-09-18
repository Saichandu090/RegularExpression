package usercases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails
{
    private static String firstName;
    private static String lastName;
    private static String email;
    private static long mobileNumber;
    private static String password;

    public static boolean getReg(String input)
    {
        Pattern pattern=Pattern.compile("^[A-Z][a-zA-Z ]{2,}$");
        Matcher matcher=pattern.matcher(input);

        return matcher.matches();
    }

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        List<Person> list=new ArrayList<Person>();
        while(true)
        {
            System.out.println("Enter your FirstName : ");
            String fn=sc.nextLine();

            if(getReg(fn))
            {
                firstName=fn;
                break;
            }
            else
                System.out.println("Invalid First Name!! Please Enter your first letter in UpperCase and at-least 3 characters");
        }

        while(true)
        {
            System.out.println("Enter your LastName : ");
            String ln=sc.nextLine();

            if(getReg(ln))
            {
                lastName=ln;
                break;
            }
            else
                System.out.println("Invalid last Name!! Please Enter your first letter in UpperCase and at-least 3 characters");
        }
    }
}
