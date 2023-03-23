package com.engeto.calculator;

public class Calculator {
    public long add(long a, long b) {
        return a + b;
    }

    public double areaOfCircle(double a) throws ArithmeticException {
        if (a < 0.0) {
            throw new ArithmeticException();
        }
        return Math.PI * a * a;
    }

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0.0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public double square(double a) {
        return a * a;
    }

    public double squareRoot(double a) throws ArithmeticException {
        if (a < 0.0) {
            throw new ArithmeticException();
        }
        return Math.sqrt(a);
    }

    public long subtract(long a, long b) {
        return a - b;
    }
}
