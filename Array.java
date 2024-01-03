import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[15];

        // Input values from the user
        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter value #" + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }

        // Print values in the array
        System.out.println("Values stored in the array: " + Arrays.toString(values));

        // Check if a number is present in the array
        System.out.print("Enter a number to search: ");
        int searchNumber = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == searchNumber) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The number found at index " + index);
        } else {
            System.out.println("Number not found in this array");
        }

        // Create a new array in reverse order
        int[] reversedArray = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            reversedArray[i] = values[values.length - 1 - i];
        }

        // Print reversed array
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));

        // Calculate and print sum and product
        int sum = 0;
        long product = 1;
        for (int value : values) {
            sum += value;
            product *= value;
        }

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Product of array elements: " + product);
    }
}
