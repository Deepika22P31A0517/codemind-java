import java.util.*;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,z,n;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        n=(z-y)/x;
        System.out.println(n);
    }
}