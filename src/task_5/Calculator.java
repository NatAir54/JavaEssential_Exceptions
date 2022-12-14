package task_5;

import java.util.Scanner;

public class Calculator {
    String operator;
    double solution;
    double numberFirst, numberSecond;

    public Calculator() {
        solution = 0.0;
    }

    public double addition (double numberFirst, double numberSecond) {
        return numberFirst + numberSecond;
    }

    public double subtraction (double numberFirst, double numberSecond) {
        return numberFirst - numberSecond;
    }

    public double multiplication (double numberFirst, double numberSecond) {
        return numberFirst * numberSecond;
    }

    public double division (double numberFirst, double numberSecond) {
        if ( numberSecond == 0 ) {
            throw new IllegalArgumentException("Divisor can never be zero");
        }
        solution = Double.valueOf(numberFirst)/Double.valueOf(numberSecond);
        return solution;
    }

}
