import java.util.*;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,z,a;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        a=(5*x+10*y)/z;
        System.out.println(a);
    }
}