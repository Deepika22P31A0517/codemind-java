import java.util.Scanner;

public class DragonFruitDivision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        String result = canDivideEvenly(X) ? "YES" : "NO";
        System.out.println(result);
    }

    static boolean canDivideEvenly(int X) {
        return X > 2 && X % 2 == 0;
    }
}