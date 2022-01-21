/*
Max Krause
November 2
Find the type of the triangle
*/
import java.util. *;
public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a value for the first side of a triangle: ");
        double side_1 = input.nextDouble (); 
        System.out.print ("Please enter a value for the second side of a triangle: ");
        double side_2 = input.nextDouble ();
        System.out.print("Please enter a value for the third side of a triangle: ");
        double side_3 = input.nextDouble ();
        System.out.print("The classification of the triangle with the given side lengths is " + calc (side_1, side_2, side_3));
        
    }
    public static String calc (double side_1, double side_2, double side_3) {
        double hyp = Math.max((Math.max(side_1, side_2)), side_3);
        double other = Math.min((Math.max(side_1, side_2)), side_3);
        double other2 = Math.min((Math.max(side_2, side_3)), side_1);
        if (hyp == other && hyp == other2 && other == other2)
            return "equilateral";
        if (hyp == other || hyp == other2 || other == other2) 
            return "isosceles";
        if (hyp != other && hyp != other2 && other != other2)
            return "scalene";
        return "";
    }
}