import java.util.*;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        if(x!=0 && x%2==0)
        System.out.println("YES");
        else if(x%2==0 && y%2==0)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}