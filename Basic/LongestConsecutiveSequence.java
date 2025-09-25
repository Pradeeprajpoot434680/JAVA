public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Integer []arr = new Integer[]{1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2};

        int s=0,e=0,ml=0;
        int start=0;int end=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]<arr[i]){
                end=i;
            }else{
                start=i;
            }

            if(end-start>ml){
                s=start ;
                e=end;
                ml = end - start;
            }
        }

        for(int i=s; i<=e; i++){
            System.out.println(arr[i]);
        }
    }
}
