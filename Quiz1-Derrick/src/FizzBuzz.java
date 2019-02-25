import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Type one number to count.\n" +
                        "Max Value? ");
        Scanner generalin = new Scanner(System.in);
        int numberinput = generalin.nextInt(); // user input


        int counter = 0;
        int number = 0;
        for (number = 1; number <= numberinput; number++)
        {
            String numberToPrint = "";
            if ((number%3) == 0 && (number%5 == 0))
            {
                numberToPrint = numberToPrint + "FizzBuzz";
            }
            else if ((number%3) == 0)
            {
                numberToPrint = numberToPrint + "Fizz";

            }
            else if ((number%5) == 0)
            {
                numberToPrint = numberToPrint + "Buzz";
            }
            else
                numberToPrint = Integer.toString(number);

            System.out.print(numberToPrint + " ");
            counter++;
            if(counter == 20) {
                counter = 0;
                System.out.println();}
        }
    }
}

