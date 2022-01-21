/*
Max Krause
October 30
Exercise 20
*/
import java.util. *;
public class Exercise_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine (); 
        int space = name.indexOf(" "); //finds index of the space which separates the first and last name in the input
        int length = name.length ();
        String last = name.substring(space, length); //takes the text between the space and end and assigns it to "last"
        System.out.print (last + ", " + name.charAt(0) + ".");
    }
}