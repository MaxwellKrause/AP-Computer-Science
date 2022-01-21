/*
Max Krause 
Exercise 21
October 30
*/
import java.util. *;
public class Exercise_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string to determine the number of letters which lay in the second half of the alphabet: ");
        String in = input.nextLine ();
        String lowerCase = in.toLowerCase();
        System.out.print("The entered text contains " + calculate (lowerCase) + " letters in the second half of the alphabet.");
        
    }
    public static int calculate (String lowerCase) {
        String abc = "abcdefghijklmnopqrstuvwxyz"; //string of the ABC's to reference
        int total = lowerCase.length ();
        int count = 0;
        for (int x = 0; x<total; x=x+1) { //go throught the letters in the incoming string and assing them to y one by one
            char y = lowerCase.charAt(x); 
            if ((abc.indexOf(y)) >= 13) { //compare the index of the letter in ABC to first half of alphabet
                count = count + 1;
            }
        }
        return count;
    }
}