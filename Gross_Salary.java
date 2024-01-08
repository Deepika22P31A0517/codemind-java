import java.util.*;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double dA,hRa,gS;
        int a=sc.nextInt();
        if(a<=10000)
        {
            dA=a*0.800;
            hRa=a*0.200;
        }
        else if(a>10000 && a<=20000)
        {
            dA=a*0.900;
            hRa=a*0.250;
        }
        else
        {
            dA=a*0.950;
            hRa=a*0.300;
        }
        gS=a+dA+hRa;
        System.out.printf("%.2f",gS);
    }
}