import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar = scanner.next().charAt(0);
        int asciiValue = (int) inputChar;
        System.out.println(asciiValue);
    }
}
