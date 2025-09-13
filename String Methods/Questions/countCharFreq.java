

public class countCharFreq {
    public static void main(String[] args){
        String s = "pradeep kumar";
        System.out.println(s.indexOf('n'));
        System.out.println(s.lastIndexOf('a'));
          char target = 'a';
        int index = s.indexOf(target);
        int count =0;
        while(index != -1){
            count++;
            index = s.indexOf(target,index+1);
        }

        System.out.println("Char is "+count + " Times");
    }
}
