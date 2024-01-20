import java.util.Scanner;

public class ComparisonLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int le = scanner.nextInt();

        if (a > b) {
            System.out.println("-1");
        } else {
            int c = 1;
            while (le + a >= b) {
                c++;
                a = a + a;
                b = b + b;
            }
            System.out.println(c);
        }
    }
}