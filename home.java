import java.util.Scanner;

public class home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = 10;  // Default value for testing
        char operator = '+';  // Default operator for testing
        double num2 = 5;  // Default value for testing

        System.out.println("Welcome to the Basic Calculator!");
        System.out.println("Using default values: " + num1 + " " + operator + " " + num2);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return;
        }

        System.out.println("The result is: " + result);
        scanner.close();
    }
}
