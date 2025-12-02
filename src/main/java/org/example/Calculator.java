package org.example;

import java.util.List;

public class Calculator {

    // Addition
    public int addNumbers(int a, int b) {
        try {
            return Math.addExact(a, b);
        } catch(ArithmeticException ex) {
            throw new ArithmeticException("Integer overflow occurred");
        }
    }

    // Substraction
    public int subtractNumbers(int a, int b) {
        // An alternative way to throw an ArithmeticException if the result is underflow.
        //
        return Math.subtractExact(a, b);
    }

    // Multiply
    public double multiply(double a, double b ) {
        return a * b;
    }

    // Division
    public double divideNumbers(double numerator, double denominator) {
        if(denominator == 0) {
            throw new ArithmeticException("Denominator can not be 0!");
        }

        return numerator / denominator;
    }

    // Absolute value
    public double absoluteValue(double value) {
        return Math.abs(value);
    }

    // Is even
    public boolean isEven(int value) {
        return value % 2 == 0;
    }

    // Max value in a list
    public int maxValue(List<Integer> list) {
        if (list.isEmpty()) {
          throw new IllegalArgumentException("List can not be empty!");
        }

        int maxValue = Integer.MIN_VALUE;

        for(int num : list) {
            if(num > maxValue) {
                maxValue = num;
            }
        }

        return maxValue;
    }
}
