import java.util.*;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        if(5*x>=y)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}