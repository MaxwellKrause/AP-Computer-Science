/*
Max Krause
9/20/18
problem 19
*/

public class Ex19 {
    
public static void main(String[] args) {
    int height = 9;                             /* Change this for height */
    int width = 9;                              /* Change this for width*/
    int a, b, c, d, number;
    int n=width-3;
    int x=n/2;
    int h=height-3;
    int y=h/2;
    
    System.out.print("+");                  /*print out plus signs and equal signs*/
    for (b=1; b<=x; b=b+1) {
        System.out.print("=");
    }
    System.out.print("+");
    for (b=1; b<=x; b=b+1) {
        System.out.print("=");
    }
        System.out.print("+");
        System.out.println(" ");
         
    for (a=1; a<=y; a=a+1) {                        /*print out vertical lines and spaces*/
        for (d=1; d<=2; d=d+1) {
        System.out.print("|");
        for(c=1; c<=x; c=c+1) {
            System.out.print(" ");
        }
        }
        System.out.print("|");
        System.out.println(" ");
    }
        System.out.print("+");
    for (b=1; b<=x; b=b+1) {
        System.out.print("=");
    }
    System.out.print("+");
    for (b=1; b<=x; b=b+1) {
        System.out.print("=");
    }
        System.out.print("+");
        System.out.println(" ");
        
        for (a=1; a<=y; a=a+1) {
        for (d=1; d<=2; d=d+1) {
        System.out.print("|");
        for(c=1; c<=x; c=c+1) {
            System.out.print(" ");
        }
        }
        System.out.print("|");
        System.out.println(" ");
    }
    
    System.out.print("+");
    for (b=1; b<=x; b=b+1) {
        System.out.print("=");
    }
    System.out.print("+");
    for (b=1; b<=x; b=b+1) {
        System.out.print("=");
    }
        System.out.print("+");
        System.out.println(" ");
    }
}