public class OddPyramid {
    public static void main(String[] args) {
        int n = 12;
        for(int i =n;i>=0;i-=2){
            for(int j =0 ; j<n-1;j++){
                    if(j<i){
                      System.out.print(" ");
                    }
                    else{
                        
                        System.out.print("* ");
                    }
            }
            System.out.println();
        }
    }
}
