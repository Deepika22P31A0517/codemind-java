import java.util.Scanner;

public class DragonFruitDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the weight of the Dragon Fruit
        int X = scanner.nextInt();

        // Check if it's possible to divide the Dragon Fruit as required
        if (X % 2 == 0 && X>2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}