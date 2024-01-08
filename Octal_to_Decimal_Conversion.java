import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int p=0,s=0;
        while(a!=0)
        {
            int r=a%10;
            double e=Math.pow(8,p);
            s+=e*r;
            a=a/10;
            p++;
        }
        System.out.print(s);
    }
}