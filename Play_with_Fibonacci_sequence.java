import java.util.*;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c;
        c=a+b;
        System.out.print(a+" ");
        System.out.print(b+" ");
        System.out.print(c+" ");
        for(int i=3;i<n;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.print(c+" ");
        }
    }
    
}