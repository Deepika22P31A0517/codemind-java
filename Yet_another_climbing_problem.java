import java.util.*;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c,r;
            if(a>=b)
            {
                c=a/b;
                r=a%b;
                System.out.println(c+r);
            }
            else
            {
                System.out.println(a);
            }
        }
    }
}
