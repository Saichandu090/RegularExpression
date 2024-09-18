package usercases;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidFirstName
{
    public static boolean getReg(String input)
    {
        Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher=pattern.matcher(input);

        return matcher.matches();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter your FirstName : ");
            String firstName=sc.nextLine();

            if(getReg(firstName))
                break;
            else
                System.out.println("Invalid First Name!! Please Enter your first letter in UpperCase");
        }
    }
}
