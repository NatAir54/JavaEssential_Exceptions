package task_5;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        calculator.numberFirst = input.nextDouble();

        System.out.println("Enter the second number:");
        calculator.numberSecond = input.nextDouble();

        System.out.println("Choose an operator: +, -, *, or /");
        calculator.operator = input.next();

        switch (calculator.operator) {
            case "+":
                System.out.println(calculator.addition(calculator.numberFirst, calculator.numberSecond));
                break;
            case "-":
                System.out.println(calculator.subtraction(calculator.numberFirst, calculator.numberSecond));
                break;
            case "*":
                System.out.println(calculator.multiplication(calculator.numberFirst, calculator.numberSecond));
                break;
            case "/":
                System.out.println(calculator.division(calculator.numberFirst, calculator.numberSecond));
                break;
            default:
                System.out.println("This is a wrong operator.");
        }
    }

}
