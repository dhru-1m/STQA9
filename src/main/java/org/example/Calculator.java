package org.example;

public class Calculator {

    public int add(int first, int second) {
        return first + second;
    }

    public int subtract(int first, int second) {
        return first - second;
    }

    public int multiply(int first, int second) {
        return first * second;
    }

    public int divide(int first, int second) {
        if (second == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return first / second;
    }
}
