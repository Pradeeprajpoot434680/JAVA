import java.util.Arrays;

public class NumGreaterThanAvg {
    public static void main(String[] args) {
        Integer []arr = new Integer[]{1, 4, 17, 7, 25, 3, 100};

        System.out.println("Original arr:");
        System.out.println(Arrays.toString(arr));

        float sum = 0f;
        for(int i:arr){
            sum+=i;
        }
        double avg = (double)sum/arr.length;

        for(int i:arr){
            if(i>avg){
                System.out.println(i);
            }
        }
    }
}
