/*
Max Krause
10/12/18
print out your name backwards using input from consol (problem 15)
*/
import java.util.*;
public class Rev_Name {
    public static void main(String[] args) {
        Scanner consol = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = consol.nextLine ();
        int space = name.indexOf(" ")+2;
        int length = name.length();
        for(int x=space; x<=length; x=x+1) {
            int y = x-1;
            char letter = name.charAt(y);
            System.out.print (letter);
        }
        System.out.print (", ");
        for(int x=0; x<=space-2; x=x+1) {
            char letter = name.charAt(x);
            System.out.print (letter);
        }
        
    }
}