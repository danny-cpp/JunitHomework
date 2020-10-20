package ece325;

/**
 * Assignment 4 Part 2: Unit Testing <br />
 * The calculator to run the test cases
 */
// TODO: Assignment 4 Part 2 -- Create the Calculator here
public class Calculator {
    public Double add(Double a, Double b) {
        return a + b;
    }

    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    public Double divide(Double a, Double b) {
        return a/b;
    }

    public Double divide(Integer a, Integer b) {
        return (double) a/(double)b;
    }

    public Double multiply(Double a, Double b) {
        return a*b;
    }

    public Double multiply(Integer a, Integer b) {
        return (double)a*(double)b;
    }

    public Double[] getRoots(Double a, Double b, Double c) {
        Double delta = b*b - 4*a*c;
        Double r1 = (-b + Math.sqrt(delta))*(0.5/a);
        Double r2 = (-b - Math.sqrt(delta))*(0.5/a);
        return new Double[] {r1, r2};
    }

    public Double subtract(Double a, Double b) {
        return a - b;
    }

}