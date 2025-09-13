
public class FreqCount {
    public static void main(String[] args){
        int x = 'a';
        char[] s = "dsaohwnjdsa".toCharArray();
        int[] count = new int[26];
        for(int i=0; i<s.length; i++){
            count[s[i]-'a']++;
        }
      for(int i=0; i<26; i++){
        if(count[i]>0){
            System.out.println((char)('a'+i) + " => " + count[i]);
        }
      }
    }
}
