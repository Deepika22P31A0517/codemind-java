import java.util.*;
public class Exam
{
    public static void main(String arhs[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.equals(b))
        {
            System.out.println("Strings are Equal");
        }
        else
        {
            System.out.println("Strings are not Equal");
        }
    }
}