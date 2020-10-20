package ece325;

/**
 * Assignment 4 Part 2: Unit Testing <br />
 * The calculator to run the test cases
 */
// TODO: Assignment 4 Part 2 -- Create the Calculator here
public class Calculator {

    // The following functions are design for question 1
    public Double add(Double a, Double b) {
        return a + b;
    }

    // This particular function designed to fit only for question 1 and fail for other
    // questions. Since we can't overload a function with same signature, please un-comment
    // this function for test suite 1.
    //
    // public Integer add(Integer a, Integer b) {
    //     return a + b;
    // }

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

    // This function is designed to pass test suite 1 only. Un-comment this for test suite 1.
    // Otherwise, keep the other version
    //
    // public Double[] getRoots(Double a, Double b, Double c) {
    //     Double delta = b*b - 4*a*c;
    //     Double r1 = (-b + Math.sqrt(delta))*(0.5/a);
    //     Double r2 = (-b - Math.sqrt(delta))*(0.5/a);
    //     return new Double[] {r1, r2};
    // }

    public Double subtract(Double a, Double b) {
        return a - b;
    }

    // The following functions are design for question 2
    public Double add(Integer a, Integer b) {
        return (double)a + (double) b;
    }

    /**
     * Get roots of quadratic. Return array of 1 if double root, array of 2 NaN if
     * complex root, and array 2 of 2 distinct root
     * @param a
     * @param b
     * @param c
     * @return Array of roots
     */
    public Double[] getRoots(Double a, Double b, Double c) {
        Double delta = b*b - 4*a*c;

        // We don't allow complex root here
        if (delta < 0) {
            // This is a NaN value use for placeholder
            Double tmp = 0.0 / 0.0;
            return new Double[] {tmp, tmp};
        }
        Double r1 = (-b + Math.sqrt(delta))*(0.5/a);
        Double r2 = (-b - Math.sqrt(delta))*(0.5/a);
        // If we have double root.
        if (r1.equals(r2)) {
            return new Double[] {r1};
        }

        return new Double[] {r1, r2};
    }

    public Double sqrt(Double a) {
        return Math.sqrt(a);
    }

    public Double sqrt(Integer a) {
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        Double res = c.sqrt(2);
        System.out.println(res);
    }
}