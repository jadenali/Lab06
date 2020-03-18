import java.util.Scanner;

public class Calculator {
    private static double Output;

    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
        double num1, num2;     //defining the numbers to be used later
        System.out.print("Enter first operand: ");
        num1 = scn.nextDouble();
        System.out.print("Enter second operand: ");
        num2 = scn.nextDouble();
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Which operation do you want to perform? ");
        char operator = scn.next().charAt(0);
        double output = 0;
        switch(operator)
        {
            case '1':
                output = num1 + num2;
                System.out.println("The result of the operation is " + output + "." + " Goodbye!");
                break;

            case '2':
                output = num1 - num2;
                System.out.println("The result of the operation is " + output + "." + " Goodbye!");
                break;

            case '3':
                output = num1 * num2;
                System.out.println("The result of the operation is " + output + "." + " Goodbye!");
                break;

            case '4':
                output = num1 / num2;
                System.out.println("The result of the operation is " + output + "." + " Goodbye!");
                break;

            default:     //to be used when the input does not match the criteria
                System.out.println("Error: Invalid selection! Terminating program.");
                break;



        }







    }
}
