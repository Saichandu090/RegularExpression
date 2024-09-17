import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1
{

    public static void getRegEx(String re,String input)
    {
        Pattern pattern=Pattern.compile(re);
        Matcher matcher= pattern.matcher(input);

        boolean matches= matcher.matches();
        System.out.println(matches);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the Regular Expression");
            String re=sc.nextLine();
            System.out.println("Enter the User Input");
            String input=sc.nextLine();

            getRegEx(re,input);

            System.out.println("Do you want to exit [Y/N] : ");
            String choice=sc.nextLine();
            if(choice.equalsIgnoreCase("y"))
                break;
        }
    }
}

//^[a-zA-Z0-9_.$-]+@[a-zA-Z0-9]+\.[a-zA-Z]{2,}$   --- Email -Regex
//^[0-9]{10}$   ---Phone Number -Regex