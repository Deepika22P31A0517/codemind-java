import java.util.*;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String i=sc.nextLine();
        String n=sc.nextLine();
        int u=sc.nextInt();
        double bill,s;
        if(u<=199)
        {
            bill=u*1.20;
        }
        else if(u>=200 && u<400)
        {
            bill=u*1.50;
        }
        else if(u>=400 && u<600)
        {
            bill=u*1.80;
        }
        else
        {
            bill=u*2.00;
        }
        if(bill>400)
        {
            s=(0.15*bill);
            bill+=s;
        }
        else
        {
            bill=bill+100;
        }
        System.out.printf("%.2f",bill);
    }
}