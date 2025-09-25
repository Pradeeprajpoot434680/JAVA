
public class CreateMatrix {
    public static void main(String[] args) {
        int n = 3;
       int [][]arr = new int[n][n];
       for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            arr[i][j] = i+j;
        }
       }
        
        for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            System.out.print(arr[i][j]);
        }
        System.out.println();
       }

       int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i=0; i<matrix.length; i++){
            if(i%2==0){
                for(int j=0;j<matrix[i].length; j++){
                    System.out.print(matrix[i][j]);
                }
            }
            else{
                for(int j=matrix[i].length-1; j>=0; j--){
                    System.out.print(matrix[i][j]);
                }
            }
        }

    }
}
