/*
Max Krause
Card problem
october 26
*/
import java.util. *;
public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the rank of your card: ");
        String rank = input.nextLine ();
        System.out.print("Please enter the suit of your card: ");
        String suit = input.nextLine ();
        System.out.print("Your card is the "  + value (rank) + " of " + type (suit));
    }
    public static String value (String rank) { //find the rank
        String r = "not a valid rank input";
        if (rank.equals("2"))
        r = "two" ;
        else if (rank.equals("3"))
        r = "three";
        else if (rank.equals("4"))
        r = "four";
        else if (rank.equals("5"))
        r = "five";
        else if (rank.equals("6"))
        r = "six";
        else if (rank.equals("7"))
        r = "seven";
        else if (rank.equals("8"))
        r = "eight";
        else if (rank.equals("9"))
        r = "nine";
        else if (rank.equals("10"))
        r = "ten";
        else if (rank.equals("a"))
        r = "ace";
        else if (rank.equals("j"))
        r = "jack";
        else if (rank.equals("q"))
        r = "queen";
        else if (rank.equals("k"))
        r = "king";
        return r;
    }
    public static String type (String suit) { //find the suit
        String s = "not a valid suit input";
        if (suit.equals("c")) {
        s = "Clubs";
        return s;
        }
        else if (suit.equals("d")) {
        s = "Diamonds";
        return s;
        }
        else if (suit.equals("h")) {
        s = "Hearts";
        return s;
        }
        else if (suit.equals("s")) {
        s = "Spades";
        return s;
        }
        return s;
    }
}