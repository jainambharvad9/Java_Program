public class unq {
    public static void main (String args[]) {
        int i,j;
        int n=5;
        for(i=1;i<=5;i++){
            int sp = (n-i);
            for(j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
