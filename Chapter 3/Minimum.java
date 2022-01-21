/*
Max Krause
10/10/18
Return the minimum value problem (number 12)
*/
public class Minimum {
    public static void main(String[] args) {
        min(3, -2, 7);
    }
    public static void min(int a, int b, int c) {
        int i = Math.min(a,b);
        int minimum = Math.min(i,c);
        System.out.print(minimum);
    }
}