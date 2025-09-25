import java.util.Scanner;
public class FindMiddleCharOfString {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String s = sin.nextLine();

        int n = s.length();
        String ans ;
        if(n%2==0){
            int start = n/2-1;
            ans = s.substring(start, start+2);
        }
        else{
            ans = s.substring(n/2,n/2+1);
        }

        System.out.println(ans);
    }
}
