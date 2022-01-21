/*
Max Krause
10/15/18
Unit 3 big program
*/
import java.util. *;
public class Investment {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Please enter the present value of the investment ");
        double pv = value.nextDouble ();
        System.out.print("Please enter the annual intrest rate as a decimal ");
        double r = value.nextDouble ();
        System.out.print("Please enter the number of times the intrest is calculate per year ");
        double n = value.nextDouble ();
        System.out.print("Please enter the time in years ");
        double t = value.nextDouble ();
        System.out.print("Please enter the additional ammount added per compound ");
        double pmt = value.nextDouble ();
        double nr = r/n;
        double pow = Math.pow(1+nr, (n*t));
        double total = (pv*pow) + (pmt*((pow-1)/(nr)));
        total = Math.round(total*100.0)/100.0;
        System.out.print("The ammount is " + total);
    }
}