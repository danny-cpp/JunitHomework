import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * ECE 325 - Fall 2020
 * Assignment 4 Part 1: Static Code Analysis <br />
 * The buggy {@code CodingHorror} source code
 */
public class CodingHorror {

    public static void main(String args[]) {
        // TODO: Assignment 4 Part 1 -- run FindBugs on the code

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input = "";
        try {
            input = br.readLine();                  // e.g., peel
        } catch (IOException ioex) {
            System.err.println(ioex.getMessage());
        }

        if (input != null)
            input = input.replace('e', 'o');

        if (input != null) {
            if (input.equals("pool")) {
                System.out.println("User entered peel.");
            } else {
                System.out.println("User entered something else.");
        }
        }
    }
}
