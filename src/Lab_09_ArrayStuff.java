import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int[] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        System.out.println();

        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the array dataPoints is: " + sum);
        System.out.println("The average of the array dataPoints is: " + average);

        System.out.print("Enter a value between 1 and 100: ");
        int userValue = getRangedInt(in, 1, 100);

        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " was found " + count + " times in the array.");

        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                System.out.println("The value " + userValue + " was found at array index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The value " + userValue + " was not found in the array.");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int value : dataPoints) {
            if (value < min) min = value;
            if (value > max) max = value;
        }
        System.out.println("The minimum value in dataPoints is: " + min);
        System.out.println("The maximum value in dataPoints is: " + max);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }

    public static int getRangedInt(Scanner in, int low, int high) {
        int input;
        do {
            System.out.print("Please enter a value between " + low + " and " + high + ": ");
            input = in.nextInt();
        } while (input < low || input > high);
        return input;
    }
}
