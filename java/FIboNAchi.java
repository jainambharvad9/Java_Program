import org.omg.CORBA.SystemException;

class FiboNAChi{
    public static void PrintFibonachi(int a,int b,int n) {
        if( n == 0){
            return;

        }
        int c = a+b;
        System.out.println(c);
        PrintFibonachi(b, c, n-1);
        
    }
    public static void main(String[] args) {
        int a=0;
        System.out.println(a);
        int b=1;
        System.out.println(b);
        int n =10;
        
        PrintFibonachi(0,1,n-2);

    }
}