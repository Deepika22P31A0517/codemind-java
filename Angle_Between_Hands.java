import java.util.Scanner;

public class ClockAngle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputTime = scanner.next();
        String[] timeParts = inputTime.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);

        // Validate the input
        if (hours < 0 || hours > 12 || minutes < 0 || minutes >= 60) {
            System.out.println("Invalid input. Please enter a valid time.");
            scanner.close();
            return;
        }

        // Calculate the angle between the hour and minute hands
        double hourAngle = 0.5 * (60 * hours + minutes);
        double minuteAngle = 6 * minutes;
        double angle = Math.abs(hourAngle - minuteAngle);

        // Find the smaller angle between the hands
        if (angle > 180) {
            angle = 360 - angle;
        }

        // Display the result
        System.out.println(angle);

        // Close the scanner
        scanner.close();
    }
}
