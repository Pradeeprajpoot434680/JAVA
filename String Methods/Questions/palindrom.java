

public class palindrom {
    public static void main(String[] arg){
        String s = "madam";
        int n = s.length();
        for(int i=0; i<n/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                System.out.println("Not a Palindrom string");
                return;
            }
        }
        System.out.println("String is a palindrom String");

    }
}
