/*
Max Krause
October 29th
Exercise 13 for chapter 4
*/
import java.util. *;
public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a possible palindrome: ");
        String p = input.nextLine ();
        String palindrome = p.toLowerCase();
        System.out.print("The string entered " + determine (palindrome) + " a palindrome!");
            }
    public static String determine (String palindrome) {
          int halfLength = palindrome.length() / 2;
          int length = palindrome.length() - 1;
          String answer = "";
        for(int x=0; x<= halfLength; x=x+1) {
            if (palindrome.charAt(x) == palindrome.charAt(length - x)) {
                answer = "is";
            }
            else {
                answer = "is not";
                return answer;
        }
        }
    return answer;
}
}