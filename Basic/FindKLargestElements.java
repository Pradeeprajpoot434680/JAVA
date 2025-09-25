import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FindKLargestElements {
    public void solve(int arr[],int k){

    }
    public static void main(String[] args) {
        int k = 3;
        int arr[] = {1, 4, 17, 7, 25, 3, 100};
        // Integer [] temp = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        // Arrays.sort(temp);
        // for(int i=temp.length-1; i>=0 && k>0; i--){
        //     k--;
        //     System.out.println(temp[i]);
        // }

        // find k largest elements

        // PriorityQueue<Integer>pq = new PriorityQueue<>(k);

        // for(int i=0; i<arr.length; i++){
        //     if(pq.size() < k){
        //         pq.add(arr[i]);
        //     }
        //     else {
        //         if(pq.peek() < arr[i]){
        //             pq.remove();
        //             pq.add(arr[i]);
        //         }
        //     }
        // }

        // for (int  integer : pq) {
        //     System.out.println(integer);
        // }


        PriorityQueue<Integer>maxHeap = new PriorityQueue<>(k,Comparator.reverseOrder());
        for(int i=0; i<arr.length; i++){
            if(maxHeap.size()<k){
                maxHeap.add(arr[i]);
            }
            else{
                if(maxHeap.peek() > arr[i]){
                    maxHeap.remove();
                    maxHeap.add(arr[i]);
                }
            }
        }

        for( Integer i:maxHeap){
            System.out.println(i);
        }
       
    }
}
