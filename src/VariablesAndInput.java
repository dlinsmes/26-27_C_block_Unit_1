//built-in library that allows us to get keyboard input
import java.util.Scanner;


public class VariablesAndInput {

    public static void main(String [] args) {
        //can use + to concatenate/append/join different strings
        //together
        System.out.print("my name is " + "mateen");

        //print() will output on the same line as previous
        System.out.print("hi");

        //"\n" will output a line break
        System.out.print("\nnew line");

        //println() - print line - output a line break AFTER
        //the string that gets printed
        System.out.println("hello");

        System.out.println("blah");

        //variables
        //hold values that can be used in the program
        //in app lab - var x = 12

        //in java - similar format but need to replace var
        //with a specific data type when declaring variables

        //declare a variable of data type String named word
        //and assign the value "potato"
        String word = "potato";

        System.out.println(word);

        //once a variable has already been declared (where the
        //data type gets specified, don't redeclare the same
        //variable
        //String word = "something else";

        //-reassign a different value to word
        word = "something else";


        System.out.println(word);

        //int is a numerical data type that holds whole numbers,
        //including zero and negatives
        int num = 8;

        System.out.println("num + 2 is " + (num + 2));
        System.out.println("num: " + num);

        //cannot assign non-int values to an int variable
        //num = "potato";
        //num = 9.2;

        //= is the assignment operator
        //FIRST evaluate the RIGHT (take the value of num and add 2)
        //THEN assign that evaluation (10) to the variable on the left
        num = num + 2;

        System.out.println("now num is " + num);

        //+ addition, - subtraction, * multiplication, / division
        // % modulo (mod) - gives remainder after division

        //remainder 3 after dividing 13 by 5
        System.out.println(13 % 5);

        //mod gives 0 when it's an even division and there's no remainder
        System.out.println(15 % 5);

        //shorthand operator
        num++; //same as num = num + 1
        System.out.println(num);

        //can also do num--, there's no ** or // or %%

        num += 3; //same as num = num + 3
        // can also do -= *= /= %=

        System.out.println(num);

        System.out.println("12 / 3 is " + 12 / 3);

        //int division - when both terms of a division operation are
        //ints (whole numbers, no decimals), then the outcome of the division
        //will also be an int and any decimals get truncated (cut off)

        System.out.println("9 / 2 is " + 9 / 2);

        System.out.println("10 / 3 is " + 10 / 3);

        //rounding up does not occur bc the decimal gets cut
        //(closer to rounding down)
        System.out.println("99 / 100 is " + 99 / 100);

        //double is a numerical data type that can hold decimals
        double dec = 9.5;

        //when at least one term of a division operation is a double
        //(has a decimal), the division will evaluate as a double, with
        //a decimal
        System.out.println(dec/10);

        System.out.println();

        //if at least one term of the division has a decimal,
        //it will evaluate as double division
        System.out.println(99.0 / 100);
        System.out.println(99 / 100.0);
        System.out.println(99.0 / 100.0);

        //int div - both terms are integers
        System.out.println(99 / 100);


        //inputs - allow the user to provide data via the keyboard
        //for use in the program

        //declare a Scanner object named input so that we can get
        //keyboard input
        Scanner input = new Scanner(System.in);

        System.out.println("what is your name?");
        //declare a string variable to get and hold what the
        //user types

        //program will pause and wait for the user to type and press enter
        String name = input.nextLine();
        System.out.println("hi " + name);

        System.out.println("tell me about your day");
        //.next() will only save the first word before a space
        String response = input.next();
        System.out.println("your response: " + response);

        System.out.println("how old are you?");
        int age = input.nextInt();
        System.out.println("your age + 5 is " + (age + 5));

        System.out.println("what's your favorite decimal number?");
        double d = input.nextDouble();
        System.out.println("your favorite decimal is " + d);

    }
}
