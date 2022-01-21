/*
System.out.println ("");
*/
public class Hexagon {
    public static void main(String[] args) {
        top_half();
        bottom_half();
        System.out.println(" ");
        middle();
        top_half();
        bottom_half();
        System.out.println(" ");
        middle();
        bottom_half();
        System.out.println(" ");
        top_half();
        middle();
        bottom_half();
        
    
    }
    public static void top_half(){
        System.out.println ("  _______");
        System.out.println (" /       \\");
        System.out.println ("/         \\");
    }
    public static void middle(){
        System.out.println ("-\"-'-\"-'-\"-");
    }
    public static void bottom_half(){
        System.out.println ("\\         /");
        System.out.println (" \\_______/");
    }
}