
class Reverse {
    public static void main(String[] arg){
        String s = "My name is pradeep";
        char[] arr = s.toCharArray();
        int n =s.length();
        for(int i=0; i<n/2; i++){
            char ch = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = ch;
        }

        String reversedString = new String(arr);
        System.out.println(reversedString);
    }
}