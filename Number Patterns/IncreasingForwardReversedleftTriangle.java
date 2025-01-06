public class IncreasingForwardReversedleftTriangle {
    public static void main(String[] args) {
        int n =5;
        for(int i =0;i<n;i++){
            if(i%2==0){
                for(int j = 0;j<=i;j++){
                    System.out.print(j+1);
                }
            }
            else{
                for(int j = i;j>=0;j--){
                    System.out.print(j+1);
                }
            }
            System.out.println();
        }
    }
}
