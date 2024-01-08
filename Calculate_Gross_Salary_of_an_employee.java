import java.util.*;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double bS,hRa,dA,pF,gS;
        bS=sc.nextDouble();
        hRa=sc.nextDouble();
        dA=sc.nextDouble();
        pF=bS*0.12;
        gS=bS+hRa+dA+pF;
        System.out.printf("%.2f
",pF);
        System.out.printf("%.2f",gS);
    }
}