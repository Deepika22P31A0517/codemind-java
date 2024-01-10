import java.util.*;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a;
        a=sc.nextDouble();
        if(a<150)
        System.out.println("The person is Dwarf.");
        else if(a>150 && a<=165)
        System.out.println("The person is average heighted.");
        else if(a>165 && a<=195)
        System.out.println("The person is taller.");
        else
        System.out.println("Abnormal height.");
    }
}