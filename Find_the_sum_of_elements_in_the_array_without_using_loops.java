import java.util.Arrays;
import java.util.Scanner;

public class ArraySumWithoutLoop {

    public static void main(String[] args) {
        // Read the size of the array from the user
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Read elements of the array from the user
        //System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of elements without using loops
        int sum = Arrays.stream(array).sum();

        // Display the elements and the sum
        System.out.println(sum);

        // Close the Scanner
        scanner.close();
    }
}
