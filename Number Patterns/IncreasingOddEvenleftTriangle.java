public class IncreasingOddEvenleftTriangle {
    public static void main(String[] args) {
        int n =5;
        int o = 1,e=2;
        for(int i = 1;i<=n;i++){
            if(i%2==1){
                for(int j =1;j<=i;j++){
                    System.out.print(o+" ");
                    o+=2;
                }
            }
            else{
                for(int j =1;j<=i;j++){
                    System.out.print(e+ " ");
                    e+=2;
                }
            }
            o = 1;e=2;
            System.out.println();
        }
    }   
}
