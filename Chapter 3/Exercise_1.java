/*
Max Krause
10/8/18
Chapter 3 worksheet problem 1
*/

public class Exercise_1 {
    public static void main(String[] args) {
        printNumbers(15);
        printNumbers(5);
    }
    public static void printNumbers(int n) {
            for (int x=1; x<=n; x=x+1) {
                System.out.print("[" + x + "] ");
            }
        System.out.println(" ");
        }
}