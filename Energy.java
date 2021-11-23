/*
* This program gets mass of object from the user,
* calculates and show how much energy could be released from that object.
*
* @author  Donggeun Lim
* @version 1.0
* @since   2021-11-20
*/

import java.util.Scanner;

/**
* This is the standard calculated energy program.
*/
public final class Energy {
    // Constant
    /**
    * Speed of light: 2.998*10^8 m/s.
    */
    static final double SPEED_OF_LIGHT = 2.998e8;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Energy() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the mass of an object in kilograms: ");
        try {
            final float massOfObject = myObj.nextFloat();

            // Process
            final float amountOfEnergy = massOfObject
                           * (float) Math.pow(SPEED_OF_LIGHT, 2);

            // Output
            System.out.println(massOfObject + "kg of mass would produce "
                + amountOfEnergy + "J of energy.");
        }
        catch (java.util.InputMismatchException errorCode) {
            System.err.print("Invalid input\n");
        }
        System.err.print("\nDone.\n");
    }
}
