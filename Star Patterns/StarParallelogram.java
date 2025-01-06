public class StarParallelogram {
    public static void main(String[] args) {
        int n = 15;
        for(int i = n;i>0;i--){
            for(int j =1;j<=n*2;j++){
                if(i>j){
                    System.out.print(" ");
                }
                else if(j-i==8){
                    
                    break;
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
