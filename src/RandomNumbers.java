import java.util.Scanner;
public class RandomNumbers {

    public static void main(String [] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("how much is potato?");
//        double unitCost = input.nextDouble();
//        System.out.println("how many potato?");
//        int num = input.nextInt();
//
//        double taxPercent = 0.075;
//
//        double taxAmt = unitCost * num * taxPercent;
//        System.out.println("tax on " + num + " potatoes is $" + taxAmt);
//
//        //total of the quantity of potatoes + tax
//
//        //java applies normal math order of operations
//        //PEMDAS
//        //multiplication, division, and modulo all run at the
//        //same priority and will execute left to right
//        //similar with add/subtract - run at the same priority from left to right
//        double total = unitCost * num + taxAmt;
//        System.out.println("total: $" + total);
//
//        //apply the two-decimal rule for total
//
//        //-move the decimal so that any needed place values are part
//        //of the whole number
//        //-turn that number into an int and either round or truncate
//        //the decimals
//        //-put the decimal back where it's supposed to go
//
//        double movedDecimal = total * 100;
//        System.out.println("moved decimal: " + movedDecimal);
//
//        int moneyInt = (int)(movedDecimal + .5);
//        System.out.println("money int: " + moneyInt);
//
//        //be careful TO use double division in order to keep track
//        //of the desired cents
//        double roundedAmt = moneyInt/100.0;
//        System.out.println("rounded amt: " + roundedAmt);
        System.out.println("random numbers");

        //Math.random() will produce a random double in the range
        // [0,1)
        // inclusive of 0, exclusive of 1
        // always 0.something

        double r = Math.random();
        System.out.println(r);

        //generate a random double in the range [0, 5);
        //since 1 is never generated, this will multiply the range
        //of [0,1) by 5, resulting [0,5)
        r = Math.random() * 5;
        System.out.println(r);

        //generate a random int [0, 5) - same as [0, 4]

        //when casting, only the term immediately to the right of
        //(int) gets converted. Since Math.random() always produces
        //0.something, that will cast to 0. 0 times anything is 0
        int rInt = (int) Math.random() * 5;
        System.out.println(rInt);

        //NEED to multiply before casting to avoid getting 0 at the end
        //ints [0,4]
        rInt = (int)(Math.random() * 5);
        System.out.println(rInt);

        //random ints [1,5]
        //by adding 1 to the generated [0,4], we get [1,5]
        rInt = (int)(Math.random() * 5) + 1;
        System.out.println(rInt);

        //[10,20]
        //multiplier is how many numbers that can be generated
        //add term is the lowest number generated

        //[min, max]
        //(int)(Math.random() * (max-min+1)) + min
        rInt = (int)(Math.random() * 11) + 10;
        System.out.println(rInt);

    }
}
