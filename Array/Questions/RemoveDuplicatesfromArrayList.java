// package Array.Questions;

import java.util.ArrayList;
import java.util.HashMap;
// public class RemoveDuplicatesfromArrayList {
//     public static void removeDuplicates(ArrayList<Integer> arr) {
//         for(int i=0; i<arr.size(); i++){
//             for(int j=i+1; j<arr.size(); j++){
//                 if(arr.get(i) == arr.get(j)){
//                     arr.set(j,-1);
//                 }
//             }
//         }
//     for(int i = arr.size() - 1; i >= 0; i--){
//         if(arr.get(i) == -1){
//             arr.remove(i);
//         }
//     }
//     }
//     public static void main(String[] args){
//         ArrayList<Integer> arr = new ArrayList<>();
//         for(int i=0; i<16; i++){
//             arr.add((int)(Math.random() * 10)); 
//         }
//         System.out.println("Original ArrayList: " + arr);
import java.util.HashSet;

//         removeDuplicates(arr);
//         System.out.println("ArrayList after removing duplicates: " + arr);
//     };
// }


public class RemoveDuplicatesfromArrayList {
    public static void main(String[] arg){
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> m = new HashMap<>();
        HashSet<Integer> s = new HashSet<>();

        for(int i=0; i<16; i++){
            arr.add((int)(Math.random() * 10)); 
            s.add(arr.get(i));
        }
        for(int i=0; i<arr.size(); i++){
            if(m.containsKey(arr.get(i))){
                m.put(arr.get(i), m.get(arr.get(i)) + 1);
                arr.set(i,-1);
            } else {
                m.put(arr.get(i),1);
            }
        }
        for(int i = arr.size() - 1; i >= 0; i--){
            if(arr.get(i) == -1){
                arr.remove(i);
            }
        }
        for(int i=0; i<arr.size(); i++){
            if(m.containsKey(arr.get(i))){
                m.put(arr.get(i), m.get(arr.get(i)) + 1);
                arr.set(i,-1);
            } else {
                m.put(arr.get(i),1);
            }
        }
        for(int i = arr.size() - 1; i >= 0; i--){
            if(arr.get(i) == -1){
                arr.remove(i);
            }
        }
        for(int i=0; i<arr.size(); i++){
            if(!s.contains(arr.get(i))){
                s.add(arr.get(i));
            }
        }
        System.out.println(arr.addAll(s));
    }

}