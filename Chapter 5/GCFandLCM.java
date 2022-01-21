/*
Max Krause
Nov 26
Finding the least common multiple and the greatest common factor
*/
import java.util. *;
public class GCFandLCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean again = true;
        while (again==true) {
        System.out.print("Please enter the first number: ");
        int a = input.nextInt ();
        System.out.print("Please enter the second number: ");
        int b = input.nextInt ();
        boolean run = true;
        int gcf = 0;
        int x=(a*b);
        while (run==true) {
                if(a%x == 0 && b%x == 0) {
                    gcf = x;
                    run = false;
                    System.out.println("The greatest common factor of " + a + " and " + b + " is " + gcf);
                }
            x=x-1;
        }
    run = true;
    x = a;
    while (run==true) {
        if(x%b == 0){
            int lcm = x;
            run = false;
            System.out.println("The least common multiple of " + a + " and " + b + " is " + lcm);
            }
        x = x + a;
        }
    System.out.print("Do you wish to continue? (no = 1, yes = 2)");
    int answer = input.nextInt();
    if(answer == 1) {
        again = false;
    }
}
}
}