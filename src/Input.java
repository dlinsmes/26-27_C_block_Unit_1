//built-in library that allows us to get input
//from the user
import java.util.Scanner;

public class Input {

    public static void main(String [] args) {
        int age = 58;
        System.out.println(age + " years old");

        //with division, when both terms are ints (whole numbers, no decimals)
        //then java will perform int division and truncate (cut off) any decimals in the
        //evaluation

        //full decades
        System.out.println("number of decades: " + age / 10);

        //remaining years not counted in a decade
        // mod is remainder after division
        System.out.println("number of remaining years: " + age % 10);

        //long way without mod
        int remaining = age - (10 * (age / 10) );
        System.out.println("long way: " + remaining);

        //number of decades as a decimal
        //if one of the division terms is a double (has a decimal)
        //the division will evaluate as a double
        System.out.println("decimal decades: " + age/10.0);

        //input - the user can type values into the keyboard
        //to interact with and provide values for the program

        //declare a scanner with variable name input
        Scanner input = new Scanner(System.in);

        //prompt for input
        System.out.println("what is your name?");

        //declare a string var for the user's input
        //and get what they type
        //-this will pause and wait until the user types
        //something and presses enter
        String name = input.nextLine();

        //if you try to save a input.nextLine() to an
        //int or double variable, the data types won't match
        //bc nextLine() is expecting a string

        System.out.println("hi " + name);

        System.out.println("tell me about your day, " + name);
        String response = input.next();
        //input.next() will only get the first word before a space

        System.out.println("your response: " + response);

        System.out.println("what's your favorite whole number?");
        int num = input.nextInt();
        //.nextInt() when the input is expected to be an int
        System.out.println("your number times 2 is " + num*2);

        //assume the user will provide input of the correct data type
        //-the program will crash if they do not do this, but don't worry
        //about that (don't need to address that situation)

        System.out.println("what's your favorite decimal number?");
        double dec = input.nextDouble();
        System.out.println("your number divided 10 is " + dec/10);

        //when you switch from getting a numerical input to a string input,
        //the scanner will annoyingly skip the nextLine()

        //workaround: add an extra nextLine() that will be
        //the one that gets skipped
        input.nextLine();

        System.out.println("what's your favorite color?");
        String color = input.nextLine();
        System.out.println("your favorite color is " + color);

    }
}
