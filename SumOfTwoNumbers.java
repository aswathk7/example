import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt user for second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate sum
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of the two numbers is: " + sum);

        scanner.close();
    }
}
