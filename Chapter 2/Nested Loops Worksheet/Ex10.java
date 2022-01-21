/*
Max Krause
9/20/18
number 10
*/

public class Ex10 {
    public static void main(String[] args) {
        
        int x, n, ten;
        
        for (x=1; x<7; x=x+1) {
            for (n=1; n<10; n=n+1) {
                System.out.print(" ");
            }
            for (ten=10; ten<=10; ten=ten+1) {
                System.out.print("|");
            }
        }
        System.out.println(" ");
        
        for (x=1; x<7; x=x+1) {
            for (n=1; n<10; n=n+1) {
                System.out.print(n);
            }
            for (ten=10; ten<=10; ten=ten+1) {
                System.out.print("0");
            }
        }
        
        
    }
}