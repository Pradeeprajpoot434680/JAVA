import java.util.Scanner;
public class CountWordsinString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        String []arr = s.split(" ");
        System.out.println("Number of words in the string:"+arr.length);
    }
}
