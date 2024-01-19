import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading Q

        for (int i = 0; i < Q; i++) {
            String binaryNumber = scanner.nextLine();

            // Convert binary to decimal
            int decimalNumber = Integer.parseInt(binaryNumber, 2);

            // Convert decimal to octal and print the result
            System.out.println(Integer.toOctalString(decimalNumber));
        }
    }
}