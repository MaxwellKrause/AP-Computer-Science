/*
Max Krause
10/4/18
Parameter Example 
*/
public class Parameters {
    public static void main(String[] args) {
        writeChars ('=', 20);
        System.out.println();
        for (int i=1; i<=10; i=i+1) {
            writeChars('>', i);
            writeChars(' ', 20-(2*i));
            writeChars('<', i);
            System.out.println();
        }
    }
    public static void writeChars(char ch, int number) {
        for (int i=1; i<=number; i=i+1) {
            System.out.print(ch);
        }
    }
}