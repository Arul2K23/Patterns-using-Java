public class OddEvenBox {
    public static void main(String[] args) {
        int n =5,o = 1,e=2;
        for(int i = 0;i<n-1;i++){
            for(int j =1;j<n;j++){
                if(i%2==0){
                    System.out.print(o+" ");
                    o+=2;
                }
                else{
                    System.out.print(e+ " ");
                    e+=2;
                }
            }
            System.out.println();
        }
    }
}
