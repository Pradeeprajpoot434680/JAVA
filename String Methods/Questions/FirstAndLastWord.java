
public class FirstAndLastWord {
    public static void main(String[] args){
        String s = "i love java";
        String[] arr = s.split((" "));
        System.out.println("First word is:"+arr[0]);
        System.out.println("Last Word is:"+ arr[arr.length-1]);

    }
}
