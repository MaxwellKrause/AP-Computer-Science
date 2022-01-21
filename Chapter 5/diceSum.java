/*
Max Krause
Nov 28 2018
Dice sum activity
*/
import java.util.*;
public class diceSum {
    public static void main(String[] args) {
        Boolean loop = true;
        while (loop == true) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a desired sum for the dice ");
        int desired = test (input, "Please enter a desired sum for the dice ");
        if (desired >= 2 && desired <= 12) {
        boolean go = true;
        while (go == true) {
            int d1 = roll();
            int d2 = roll();
            int sum = d1 + d2;
            System.out.println (d1 + " + " + d2 + " = " + sum);
            if (sum == desired) {
            go = false ;
            loop = false;
        }
    }
}
else {
    System.out.println("This value is not valid ");
    loop = true;
}
}
}
    public static int roll () {
        Random dice = new Random();
        int result = dice.nextInt(6) + 1;
        return result;
        }
        
    public static int test (Scanner input, String prompt) {
        while (!input.hasNextInt ()) {
            input.next();
            System.out.print("Not a valid input, please try again ");
            System.out.print(prompt);
        }
        return input.nextInt ();
    }
}