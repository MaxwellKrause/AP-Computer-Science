/* 
Max Krause
November 6
Large project (number 3)
*/
import java.util. *;
public class largeProject_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter how many levels you want to be displayed: ");
        int size = input.nextInt ();
        for(int i = 0; i <= size; i=i+1) {               //repeats the loop for the number of levels that are on the triangle
            for(int x=(size-i) * 3; x>=0; x=x-1) {       //figures out the ammount of spaces needed before the start of each level
                System.out.print(" ");
            }
            int number = 1;
            for(int j=0; j<=i; j=j+1) {
                System.out.printf ("%6d",number); //formats the width of the characters
                number = number * (i-j)/(j+1);     //equation to calculate the number that is going to be printed
            }
            System.out.println (" ");
        }
    }
}