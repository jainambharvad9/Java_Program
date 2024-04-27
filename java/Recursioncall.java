public class Recursioncall {
    public static int callGuests(int n) {
        if( n<= 1){
            return 1;
        }

        int w1 = callGuests(n-1);

        int w2 = (n-1) * callGuests(n-2);        

        return w1+w2;

    }
    public static void main(String[] args) {
        int n =4;
        int totalcall = callGuests(n);
        System.out.println(totalcall);       
    }
}