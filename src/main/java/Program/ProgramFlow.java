package Program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramFlow {
    /*
    * Menu Method:
    * Add possible menu functions with Arrays
    * menu adds menu options to choose to it
    * returns 0 for program exit
    * */
    public static int menu(String[] options) {
        final int MAXMENUOPTIONS = 9;

        if(options.length > MAXMENUOPTIONS) {
            throw new Error("To much Options");
        }

        //List Options
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ") " + options[i]);
        }
        System.out.println("0) Exit program.");

        //Scan options
        int input = intInput("\nEnter Option: ");
        if (input > options.length || input < 0) {
            System.out.println("Please Enter an valid Menu point");
            menu(options);
        }
        //options
        return input;
    }

    public static int intInput(String message) {
        Scanner integer = new Scanner(System.in);
        System.out.print(message);
        try {
            return integer.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter Integer.");
            intInput(message);
        }
        return 0;
    }

    public static String stringInput(String message) {
        Scanner string = new Scanner(System.in);
        System.out.print(message);
        return string.next();
    }

    public static int[] intArrayInput(String message) {

        String input = stringInput(message);
        input = input.replace(" ","");
        String[] arr = input.split(",");
        int[]  output = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            output[i] = Integer.parseInt(arr[i]);
        }
        return output;
        }



}
