public class ZigZagNumbersBox {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<n;i++){
            if(i%2==0){
                for(int j = 1;j<=n;j++){
                    if(j==n){
                        System.out.print(i+2 + " ");
                    }
                    else{
                        System.out.print(i+1+ " ");
                    }
                }
            }
            else{
                for(int j = 1;j<=n;j++){
                    if(j==1){
                        System.out.print(i+2+ " ");
                    }
                    else{
                        System.out.print(i+1+ " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
