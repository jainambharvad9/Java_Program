class loop{
    public static void main(String args[]) {
        int i,j;
        int n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
           
        } 
    }
}