/*
Max Krause
9/24/18
Stair case program
*/
public class Staircase {
    public static final int size = 5;
    public static void main(String[] args) {
        int x, y, n, t, s, r, i;
        t=0;
        s=(size*6)+7;
        for (y=1; y<=size; y=y+1) {
        t=t+1;
        n=size;
        n=(n-t)*6;
        r=((t-1)*6)+5;
        i=r-6;
        for (x=1; x<=n; x=x+1) {
            System.out.print (" ");
        }
        System.out.print("  o   *******");
        for(x=1; x<i; x=x+0) {
            for (x=1; x<=i; x=x+1) {
            System.out.print(" ");
        }
        System.out.print("*");
        }
        System.out.println(" ");
        for (x=1; x<=n; x=x+1) {
            System.out.print (" ");
        }
        System.out.print(" /|\\  *");
        for (x=1; x<=r; x=x+1) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println("");
        for (x=1; x<=n; x=x+1) {
            System.out.print (" ");
        }
        System.out.print(" / \\  *");
        for (x=1; x<=r; x=x+1) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println(" ");
        }
        for (x=1; x<=s; x=x+1) {
            System.out.print("*");
        }
    }
}