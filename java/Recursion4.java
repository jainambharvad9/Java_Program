public class Recursion4 {
    public static int placeTiles(int n ,int m) {
        if( n ==m){
            return 2;
        }
        if( n < m){
            return 1;
            
        }

        int Pl = placeTiles(n-m, m);

        int lp = placeTiles(n-1, m);

        return Pl + lp ;
        
    }
    public static void main(String[] args) {
        int n = 4,m = 2;
        int totalplaceT =placeTiles(n, m);
        System.out.println(totalplaceT);

        
    }
}
