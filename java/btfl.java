public class btfl {
    public static void main(String args[]) {
        int i,j;
        int n=9;
        //up
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");

            }
            int sp = 2 * (n-i);
            for(j=1;j<=sp;j++){
                System.out.print(" ");

            }
            for(j=1;j<=i;j++){
                System.out.print("*");

            }
           
            System.out.println();
        }
         //dp
         for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");

            }
            int sp = 2 * (n-i);
            for(j=1;j<=sp;j++){
                System.out.print(" ");

            }
            for(j=1;j<=i;j++){
                System.out.print("*");

            }
           
            System.out.println();
         

        }
        
        
    }
    
}
