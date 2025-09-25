

import java.util.ArrayList;

public class Question1 {
    public static void main(String[] arg){
        ArrayList<Integer>arr = new ArrayList<>(10);
        for(int i=1; i<=10; i++){
            arr.add(i);
        }

       for(int i=0; i<arr.size(); i++){
            if(arr.get(i) % 2 ==0){
                arr.remove(i);
            }
       }

       System.out.println(arr);
    }
}
