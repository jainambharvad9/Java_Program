import javafx.scene.effect.ColorInput;

public class Recursion1 {
    public static int countPaths(int i,int j,int m,int n) {
        if( i == n || j == m){
            return 0 ;

        }
        if ( i == n-1 && j == m-1){
            return 1;
        }
        
       int leftpaths = countPaths(i+1, j, m, n);

        int rightpaths = countPaths(i , j+1, m, n);

        return leftpaths + rightpaths;

        
    }
    public static void main(String[] args) {
        int n= 10, m =10;
       int totlepaths = countPaths(0, 0, m, n);
       System.out.println(totlepaths);
    }
}
