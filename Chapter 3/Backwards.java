/*
Max Krause
10/11/18
Write a phrase backwards 
*/
import java.util.*; //for scanner
public class Backwards {
    public static void main(String[] args) {
        Scanner consol = new Scanner(System.in); 
        System.out.print("Enter phrase to reverse: ");
            String phrase = consol.nextLine (); //adds the cursor to allow you to input data, nextline means it takes a string, you can also use things like double
            int l = phrase.length();
        for(int x=l; x>0; x=x-1) {
            int y=x-1;
            char i = phrase.charAt(y);
            System.out.print(i); 
        }
    }
}