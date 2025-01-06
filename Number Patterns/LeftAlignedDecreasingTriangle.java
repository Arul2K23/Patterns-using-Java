public class LeftAlignedDecreasingTriangle {
    public static void main(String[] args) {
        int n =6,j;
        for(int i =1;i<=n;i++){
            for(j=n;j>=0;j--){
                if(i<j){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
