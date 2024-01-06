import java.util.*;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,h,m,s;
        a=sc.nextInt();
       
        h=a/3600;
        m=(a/60)%60;
         s=a%60;
         System.out.printf("H:M:S-%d:%d:%d",h,m,s);
    }
}