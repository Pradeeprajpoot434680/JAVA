package Array;

import java.util.ArrayList;
import java.util.List;

public class Functions {
    public static void main(String[] args){
        //creation 
        ArrayList arr = new ArrayList<>(20);
        // ArrayList arr1 = new ArrayList<>();

        //append an element O(1)
        arr.add(1);
        arr.add(2);
        arr.add(3);
        //insert at a specfic position time complexity O(n)
        arr.add(0,2);

        //Access / Modify

        arr.get(1); // get(Index) O(1);
        // set(int index, E e) //replcees the element
        arr.set(1, 4);
        //contains(Object o) Check if element exists (linear search) O(n)

        arr.contains(4);

        // arr.indexOf => returns the first index of the elemnt O(n)
        arr.indexOf(2);
        //lastIndexOf(Object o) return the last index of the element O(n)


        //arr.remove(index) O(n) dueto shifting
        // list.remove(Integer.valueOf(20)); remove the first occurance of the element
        // int n = list.size();
        //boolean empty = list.isEmpty();
        // boolean found = list.contains(99);
        // int idx = list.indexOf(99);
        //ArrayList<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5));
        //List<Integer> sub = nums.subList(1, 4); // [2,3,4]

    }
}
