import java.util.*;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String ch=sc.nextLine();
        if(ch.length()>=7 )
        {
            char a=ch.charAt(6);
             System.out.println(a);
        }
       
    }
}