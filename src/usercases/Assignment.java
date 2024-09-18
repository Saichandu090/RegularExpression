package usercases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment
{
    public static boolean getRegEmail(String input)
    {
        Pattern pattern=Pattern.compile("^[a-zA-Z0-9_$+-]+(\\.[a-zA-Z0-9]+)?@[a-z0-9]+\\.[a-zA-Z]{2,}(\\.[a-z]+)?$");
        Matcher matcher=pattern.matcher(input);

        return matcher.matches();
    }

    public static void main(String[] args) {

        boolean rs1=getRegEmail("abc@yahoo.com");
        boolean rs2=getRegEmail("abc-100@yahoo.com");
        boolean rs3=getRegEmail("abc.100@yahoo.com");
        boolean rs4=getRegEmail("abc111@abc.com");
        boolean rs5=getRegEmail("abc-100@abc.net");
        boolean rs6=getRegEmail("abc.100@abc.com.au");
        boolean rs7=getRegEmail("abc@1.com");
        boolean rs8=getRegEmail("abc@gmail.com.com");
        boolean rs9=getRegEmail("abc+100@gmail.com");


        System.out.println(rs1+","+rs2+","+rs3+","+rs4);
        System.out.println(rs5+","+rs6+","+rs7+","+rs8+","+rs9);
        System.out.println("============");

        boolean rc1=getRegEmail("abc");
        boolean rc2=getRegEmail("abc@.com.my");
        boolean rc3=getRegEmail("abc123@gmail.a");
        boolean rc4=getRegEmail("abc123@.com");
        boolean rc5=getRegEmail("abc123@.com.com");
        boolean rc6=getRegEmail(".abc@abc.com");
        boolean rc7=getRegEmail("abc()*@gmail.com");
        boolean rc8=getRegEmail("abc@%*.com");
        boolean rc9=getRegEmail("abc..2002@gmail.com");
        boolean rc10=getRegEmail("abc.@gmail.com");
        boolean rc11=getRegEmail("abc@abc@gmail.com");
        boolean rc12=getRegEmail("abc@gmail.com.1a");
        boolean rc13=getRegEmail("abc@gmail.com.aa.au");

        System.out.println(rc1+","+rc2+","+rc3+","+rc4+","+rc5+","+rc6);
        System.out.println(rc7+","+rc8+","+rc9+","+rc10+","+rc11+","+rc12+","+rc13);

    }
}
