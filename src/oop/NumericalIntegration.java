package oop;

import java.util.function.DoubleUnaryOperator;

public class NumericalIntegration {
    public static void main(String[] args) {
        System.out.println(integrate(NumericalIntegration::porable, 0, 10));
    }

    public static double porable(double x) {
        return x * x;
    }
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        final double step = 1e-6;
        double result = 0.0;
        for (double x = a; x < b; x += step) {
            result += f.applyAsDouble(x) * step;
        }
        return result;
    }
}
