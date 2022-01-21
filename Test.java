public class Test {
public static void main(String[] args) {
    String str = "ss s ssss ssssss";
    int key = 4;
    text (str, key);
}
public static void text (String str, int key) {
    int y = 0;
    int length = str.length();
    for(int x=0; x<length; x=x+1) {
        char a = str.charAt(x);
        if(a == ' ') {
            int end = x;
            int Length = (end-y);
            int start = x-Length;
            if(Length <= key) {
            for(int i=start; i<end; i=i+1){
                System.out.print(str.charAt(i));
            }
        System.out.println("");
            }
        y = end+1;
        }
    }
}
}
