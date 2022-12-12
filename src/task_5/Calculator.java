package task_5;

import java.util.Scanner;

public class Calculator {
    String operator;
    double solution;
    double number1, number2;

    public Calculator() {
        solution = 0.0;
    }

    public double addition (double number1, double number2) {
        return number1 + number2;
    }

    public double subtraction (double number1, double number2) {
        return number1 - number2;
    }

    public double multiplication (double number1, double number2) {
        return number1 * number2;
    }

    public double division (double number1, double number2) {
        if ( number2 == 0 ) {
            throw new IllegalArgumentException("Divisor can never be zero");
        }
        else {
            solution = Double.valueOf(number1)/Double.valueOf(number2);
        }
        return solution;
    }


}
