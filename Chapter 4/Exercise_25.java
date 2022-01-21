/*
Max krause
October 30
Exercise 25
*/
import java.util. *;
public class Exercise_25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a value for a: ");
        double a = input.nextDouble ();
        System.out.print("Please enter a value for b: ");
        double b = input.nextDouble ();
        System.out.print("Pease enter a value for c: ");
        double c = input.nextDouble ();
        equation (a,b,c); //send numbers into the method and run it
    }
    public static double equation (double a, double b, double c) { //determine if it will be undefined or not
        double inside = Math.pow(b, 2) - (4*a*c);
        if (inside <0) {
            System.out.print("These values are undefined, please try again.");
        } 
        else {                                                          //if the values are valid, contrinue the rest of the equation
            double add = (-b + Math.sqrt(inside)) / (2 * a);
            double subtract = (-b - Math.sqrt(inside)) / (2 * a);
            System.out.print("The answers are " + add + " and " + subtract);
        }
        return 0;
    }
}