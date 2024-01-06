import java.util.*;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        double p;
        p=(a-b)*100/(a*1.0);
        System.out.printf("%.2f",p);
    }
}