public class GCDUsingEuclidsAlgorithm {
    public static void main(String[] args) {
        int b=363;
        int a = 432;
        while(a>b){
            int x = a-b;
            if(b>x){
                a=b;
                b = x;
            }
            else{
                a=x;
                b = b;
            }
            
        }

        if(a==b){
            System.out.println(a);
        }
    }
}
