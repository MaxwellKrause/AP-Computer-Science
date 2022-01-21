/*
Max Krause
9/17/18
Excercise three from worksheet
*/
import java.util. *;
public class Exercise_3 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Please enter the month as a number ");
        int month = value.nextInt ();
        System.out.print("Please enter the day as a number ");
        int day = value.nextInt ();
        int combine = (month*100)+day; //figures out day and month number code by multiplying month by 100 and adding to day
        season (combine); //runs method
    }
    public static void season (int combine) { //method to figure out the season by given ints
        if (916 <= combine) {
            if (1215 >= combine)
            System.out.print("The season is fall!");
            else if (1216 <= combine)
            System.out.print("The season is winter!"); //had to use "else if" because of resent due to the new year in the winter season
        }
        if (616 <= combine) {
            if (915 >= combine) 
                System.out.print("The season is summer!");
        }
        if (316 <= combine) {
            if (615 >= combine)
                System.out.print("The season is spring!");
        }
        if (315 >= combine) 
            System.out.print("The season is winter!");
    }
    
}
