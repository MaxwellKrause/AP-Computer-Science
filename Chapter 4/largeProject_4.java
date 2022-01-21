/* 
Max Krause
November 6
Large Project number 4
*/
import java.util. *;
public class largeProject_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("please enter a string to Ceasar Cipher: ");
        String original = input.nextLine ();
        System.out.print("please enter the encoding key: ");
        int key = input.nextInt (); 
        Cipher (original, key);
}
    public static void Cipher(String original, int key) { //overall method to determine the new output of letters
        String new_input = original.toLowerCase(); 
        String abc = "abcdefghijklmnopqrstuvwxyz";
        int length = new_input.length ();
        for(int x=0; x<length; x=x+1) { //runs the loop as many times as the string is long
            char individual = new_input.charAt(x); //takes letters from the input string one by one
            if (individual == ' ') {    //because we want to retain spaces, if it is a space it runs this exception 
                System.out.print(" "); 
            }
            else {
            int old = abc.indexOf(individual);   //compairs the letter extracted from the input string to the abc string and finds the index
            int New = old + key;  //adds the selected key to the index of the letter
            if(New > 25) { //if the new value is over 25 it finds what letter it will be by looping back to the strat of the abcs
                New = (New % 25) - 1;
            }
            char letter = abc.charAt(New); //finds the char at the index of of the newly aquired number
            System.out.print(letter); 
            }
        }
    }
}