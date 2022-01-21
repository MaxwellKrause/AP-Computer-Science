/*
Max Krause
Nov. 30
Rock paper scissors project
*/
import java.util.*;
public class RPS {
    public static void main(String[] args) {
        
        int rounds, x, c_val;  //declarations
        Boolean again = true;
        
        Scanner input = new Scanner(System.in); //java.util setups
        Random computer = new Random();
        
        System.out.println("This is a program which allows you to play rock paper scissors against a computer.");
        
        while (again == true) {
            
            System.out.println("Would you like to play [r]ock, [p]aper, or [s]cissors? ");
            System.out.println(" ");
            String play = input.nextLine();
            int converted = convert_user(play); 
            int computer_play = computer.nextInt(3) + 1; //finds a random int between 1 and 3 which is used as the computers play
            System.out.println(" ");
            System.out.println("You " + win_loss(converted, computer_play) + " against " + convert_computer(computer_play) + " with a play of " + full_user_input(play) + "!");
            System.out.println(" ");
            System.out.println("Would you like to play again? [y]es or [n]o"); //asks if the user wants to play again
            System.out.println(" ");
            String loop = input.nextLine();
            if (loop.equals("no") || loop.equals("n")) {    //determines whether the user wishes to continue playing another round or not
                again = false;
            }
            else again = true;
            System.out.println(" ");
        }
        
    }
    public static int convert_user (String play) { //converts the user into an integer which is easy to work with
        int user_play = 0;
        if (play.equals("r") || play.equals("rock")) {
                user_play = 1;
        }
        else if(play.equals("p") || play.equals("paper")) {
                user_play = 2;
        }
        else if(play.equals("s") || play.equals("scissors")) {
                user_play = 3;
        }
    return user_play;
    }
    
    public static String convert_computer (int computer_play) { //converts the randomly generated computer integer into a string wit h the connected play
        String computer_p = " ";
        if (computer_play == 1) {
            computer_p = "rock";
        }
        else if (computer_play == 2) {
            computer_p = "paper";
        }
        else if (computer_play == 3) {
            computer_p = "scissors";
        }
    return computer_p;
    }
    
    public static String win_loss (int converted, int computer_play) { //calculates whether the play was a win, loss, or tie
        String WorL = " ";
        if (converted == 1) {
            if (computer_play == 1) {
                WorL = "tied";
            }
            else if (computer_play == 2) {
                WorL = "lost";
            }
            else if (computer_play == 3) {
                WorL = "won";
            }
        }
        else if (converted == 2) {
            if (computer_play == 1) {
                WorL = "won";
            }
            else if (computer_play == 2) {
                WorL = "tied";
            }
            else if (computer_play == 3) {
                WorL = "lost";
            }
        }
        else if(converted == 3) {
            if (computer_play == 1) {
                WorL = "lost";
            }
            else if (computer_play == 2) {
                WorL = "won";
            }
            else if (computer_play == 3) {
                WorL = "tied";
            }
        }
    return WorL;
    }
    
    public static String full_user_input(String play) { //converts a single letter input by the user into a full length word 
        String full = play;
        if (play.equals("r")) {
            full = "rock";
        }
        else if (play.equals("p")) {
            full = "paper";
        }
        else if (play.equals("s")) {
            full = "scissors";
        }
    return full;
    }
}