

public class AmericanFlag {
    public static void main(String[] args) {
        int col=70;
        int row = 15;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i<8 && j < 13){
                    if(i%2==0)
                    System.out.print("* ");
                    else
                    System.out.print(" *");
                }
                else{
                    System.out.print("=");
                    if(i<8)
                    j++;
                }
            }
            System.out.println();
        }
    }
}
