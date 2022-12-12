package task_5;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        calculator.number1 = input.nextDouble();

        System.out.println("Enter the second number:");
        calculator.number2 = input.nextDouble();

        System.out.println("Choose an operator: +, -, *, or /");
        calculator.operator = input.next();

        switch (calculator.operator) {
            case "+":
                System.out.println(calculator.addition(calculator.number1, calculator.number2));
                break;
            case "-":
                System.out.println(calculator.subtraction(calculator.number1, calculator.number2));
                break;
            case "*":
                System.out.println(calculator.multiplication(calculator.number1, calculator.number2));
                break;
            case "/":
                System.out.println(calculator.division(calculator.number1, calculator.number2));
                break;
            default:
                System.out.println("This is a wrong operator.");
        }
    }

}
