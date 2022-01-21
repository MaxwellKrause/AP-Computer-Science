/*
Max Krause
9/19/18
Fidonacci numbers
*/

public class Fibonacci {
    public static void main(String[] args) {
        
        int first=1;
        int second=1;
        
        for (int constant = 1; constant < 12; constant=constant+1) 
        {
        System.out.print(first+" ");
        int sum=second + first;
        first=second;
        second=sum;
        }
        
    }
    
}