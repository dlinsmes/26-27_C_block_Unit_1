import java.util.Scanner;

public class Casting {

    public static void main(String [] args) {
        // warm up
        // prompt for two numbers
        //output quotient of first divided by second
        Scanner input = new Scanner(System.in);

        System.out.println("give me a number");
        int num = input.nextInt();
        System.out.println("give me more number");
        double num2 = input.nextInt();

        //int division when both division terms are ints
        //-any decimals will get truncated
        //double division when at least one term is a double
        System.out.println(num + " / " + num2 + " is " + num/num2);

        //you CAN assign an int value to a double variable
        double a = 5;

        //when assigning an int to a double, .0 will get added
        System.out.println("a is " + a);

        //another way - cast (convert) an int value to a double
        System.out.println( (double)3 );

        //save the int variable num as a double variable
        double b = (double) num;
        System.out.println(b);

        //can't save a decimal value to an int variable
        //int c = (double)num;
        //int c = 9.5;

        //with the =, do the right side first
        // (9/2 is int div and gives 4)
        //THEN assign 4 to the double variable c
        //and you get 4.0
        double c = 9 / 2;
        System.out.println(c);

        //only the term immediately to the right
        //of the typecast gets converted

        // 9.0/2
        c = (double) 9 / 2;
        System.out.println(c);

        // 9/2.0
        c = 9 / (double) 2;
        System.out.println(c);

        //order of operations - PEMDAS
        //9/2 evaluates to 4, which then gets cast to 4.0
        c = (double) (9 / 2);
        System.out.println(c);

        //doubles can be cast into ints
        //any decimals get truncated - no rounding up occurs
        //int d = 4.5;
        int d = (int)4.8;
        System.out.println(d);

        //normal rounding rule - if the decimal is .5 or higher
        //round up by incrementing the whole number by 1
        //otherwise stay at the current whole number

        //assume toRound is always positive
        double toRound = 4.4;
        //add the rounding threshold so that toRound values with
        //a decimal of .5 and higher will add to a sum that
        //is at least the next whole number
        //-decimals less than  the threshold will stay
        //at the same whole number
        int rounded = (int)(toRound + 0.5);
        System.out.println(toRound + " rounded is " + rounded);

        //sometimes there are precision issues with doubles
        //where the value might be really close to what's expected
        //but slightly under or over
        double e = 9.7 - 2.1;
        System.out.println(e);

        e = 9.7 - 2.2;
        System.out.println(e);

        e = 47.49 % 1;

        e =  9.7 - 2.2;
        System.out.println(e);

        //round to two decimal places (hundredths)

        //try to come up with steps to round to 2 decimals

        //move the decimal to include the place values you want to keep
        double mult = e * 100;
        System.out.println(mult);

        //apply the normal rounding rule
        int multRounded = (int)(mult + 0.5);
        System.out.println(multRounded);

        //be careful to use double division, not int div
        double multDivide = multRounded/100.0;
        System.out.println(multDivide);



    }
}
