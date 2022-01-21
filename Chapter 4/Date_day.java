/*
Max Krause
October 23
turning ##/## into day of the year
*/
import java.util. *;
public class Date_day {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the date in (mm/dd) format: ");
        String date = input.nextLine ();
        String[] arr = date.split("/",2); //separate month value and the day value
        int month = Integer.valueOf(arr[0]);
        int day = Integer.valueOf(arr[1]);
        System.out.print("The day of the year that " + date + " falls on is " + day_of_year (month, day));
    }
    public static int day_of_year (int month, int day) { //find the # of days in completed months
        int y = 0;
        for (int x=1; x<month; x=x+1) {
            if(x==1 || x==3 || x==5 || x==7 || x==8 || x==10) 
            y=y+31;
            if(x==4 || x==6 || x==9 || x==11) 
            y=y+30;
            if(x==2)
            y=y+28;
        }
        return y + day; //add the ammount of days in the completed months to the ammount of days already completed in the month
    }
    
}
