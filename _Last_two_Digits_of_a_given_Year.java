import java.util.*;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,r;
        a=sc.nextInt();
        r=a%100;
        System.out.printf("%02d",r);
    }
}