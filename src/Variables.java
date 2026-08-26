public class Variables {

    public static void main(String [] args) {

        //can append/concatenate/join different strings with a +
        System.out.print("my name is" + " " + "my name");

        //print() will output on the same line as previous
        System.out.print("bye");

        //"\n" will insert a line break
        System.out.print("\nnew line");

        //println() - print line - inserts a line break AFTER
        //the output text
        System.out.println("blah");

        System.out.println("blah");

        //Variables
        //a container that holds a value

        //declare a variable - set it up for its first use
        //by indicating its data type (String)
        //and variable name (userName)
        String userName = "monkey pickle pants";

        System.out.println(userName);

        //can append strings and variables together
        System.out.println("you win, " + userName);

        //update/change the value of an existing variable
        userName = "chicken nugget";

        System.out.println("new username: " + userName);

        //when you want to update an existing variable, do not
        //redeclare it (include the data type) bc the variable
        //has already been declared
        //String userName = "chicken nugget";

        //variable naming conventions - can't have spaces
        //-can use camelCase - cap first letter of any additional words
        //or use underscores _
        //String u name = "fadsf";
        String u_name = "fdasfdsa";

        // = is the assignment operator
        // FIRST evaluate what's on the right
        // SECOND save that value the variable on the left

        //first take the value of userName (chicken nugget) and add bbq
        //then save that value (chicken nuggetbbq) to the userName variable
        userName = userName + "bbq";

        System.out.println(userName);

        //int (integer) is a numerical data type that can hold whole numbers, incl
        //zero and negatives
        int num = 7;

        System.out.println("num is " + num);

        //invalid bc num was declared as an int data type variable and can't hold strings
        //(what number is table supposed to be?)
        //num = "table";

        //can't automatically turn a decimal number into an int
        //num = 12.4;

        num = 25;
        System.out.println("num is " + num);

        //similar as before - evaluate what's on the RIGHT (25 + 75), then
        //assign that value to the left
        num = num + 75;

        System.out.println(num);

        // + addition
        // - subtraction
        // * multiplication
        // / division
        // % modulo (mod) - remainder after division

        //13 DIVIDED by 5 is 2 remainder 3, but the whole number is irrelevant
        //-mod just gives the remainder: 3
        System.out.println(13 % 5);

        //mod producing 0 means that there's an even division with no remainder
        System.out.println(100 % 10);

        num++; //same as num = num + 1;
        System.out.println(num);

        //similar for --, however there is no ** or //

        num += 3; //same as num = num + 3
        System.out.println(num);

        //similar for -=, *=, /=

        System.out.println( 9 / 3);

        //int division (when both terms are integers with no decimals)
        //any decimals get truncated (cut off) and you only get the
        //whole number part of the division
        //rounding UP does not occur - this essentially rounds down
        System.out.println(9 / 2);
        System.out.println(10 / 3);
        System.out.println(99 / 100);

        //int division is calculated bc the int data type cannot hold decimals
        int num2 = 99 / 100;

        //the double data type can hold decimal numbers
        double decimalNum = 4.5;

        //when dividing, if one of the division terms is a double (has a decimal),
        //a double will be evaluated and you'll have a decimal in the result
        System.out.println(decimalNum/9);

        decimalNum = 4;
        //since decinmalNum is a double data type,
        // it will add on .0 to any int values
        System.out.println(decimalNum);


        System.out.println();

        //first 3 - at least one term in the division has a decimal (double)
        //so division will calculate as a double with a decimal
        System.out.println(99.0 / 100);
        System.out.println(99 / 100.0);
        System.out.println(99.0 / 100.0);

        //both 99 and 100 are ints (no decimals) so int division gets performed
        System.out.println(99 / 100);

    }
}
