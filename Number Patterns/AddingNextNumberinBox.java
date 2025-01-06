class AddingNextNumberinBox{
    public static void main(String[] args) {
        int n =5,j;
        for(int i = 0;i<n;i++){
            for(j =1+i;j<=n;j++){
                System.out.print(j);
            }
            for(int k = 1;k<=i;k++){
                System.out.print(j);
                j++;
            }
            System.out.println();
        }
    }
}