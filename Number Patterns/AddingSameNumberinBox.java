public class AddingSameNumberinBox {
    public static void main(String[] args) {
        int n =6;
        for(int i = 0;i<n;i++){
            for(int j =1+i;j<=n;j++){
                System.out.print(j);
            }
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
