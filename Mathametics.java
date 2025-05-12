import java.util.Scanner;

public class Mathametics {
    public static void main(String[] args) {
        System.out.println("Welcome to X calculator. Here, mathematics is our passion!");

        Scanner scanner = new Scanner(System.in);

        // Get first number
        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("You have entered: " + firstNumber);

        // Get operation
        System.out.print("Enter the function (+, -, *, /): ");
        String operation = scanner.next();

        // Check if operation is valid
        if (!(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/"))) {
            System.out.println("The function entered is not in our supported functions.");
        } else {
            // Get second number
            System.out.print("Enter second number: ");
            double secondNumber = scanner.nextDouble();

            // Perform calculation
            double result;
            switch (operation) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    if (secondNumber == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    result = firstNumber / secondNumber;
                    break;
                default:
                    System.out.println("Unexpected error.");
                    return;
            }

            // Output result
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
