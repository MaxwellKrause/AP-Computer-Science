/*
Max Krause
10/8/18
chapter 3 worksheet exercise 8
*/
public class Exercise_8 {
    public static void main(String[] args) {
        quadratic(1, -7, 12);
    }
    public static void quadratic(double a, double b, double c) {
        double plus, minus;
        plus = ((0-b)+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
        minus = ((0-b)-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
        System.out.println("x=" + plus);
        System.out.println("x=" + minus);
    }
}