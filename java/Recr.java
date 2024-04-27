

public class Recr {
    public static int PrintN(int x,int n) {
        if(n == 0){
            return 1;

        }
        if( x == 0){
            return 0;
        }
        
        if( n % 2 == 0){
            return PrintN(x, n/2)*PrintN(x, n/2);
        }else{
            return PrintN(x, n/2)*PrintN(x, n/2)*x;
        }
        
    }
    public static void main(String[] args) {
        int x =2,n=5;
        int ans = PrintN(x, n);
        System.out.println(ans);
    }
}
