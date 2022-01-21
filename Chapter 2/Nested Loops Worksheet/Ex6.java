/*
Max Krause
9/20/18
nested loops worksheet
*/





public class Ex6 {
    public static void main(String[] args) {
        
        int x, number;
        for (x=1; x<8; x=x+1) 
        {
            for (number=1; number<=x; number=number+1) 
            {
                System.out.print(x);
            }
            System.out.println(" ");
        }
    }
}