import java.util.*;

interface Body {
    int a=10;
     static void A(){
        System.out.println( " This is a");
        
    
    }
    
}
interface Body1{
    int b=20;
     static void A() {
        System.out.println(" this is b");
        
    }
    public static void mult() {
        int D = 12;
        int C = 5;
        int F = D*C;

        System.out.println("this is mult->"+F);

       
        
    }
    
}


class Sum implements Body,Body1{

    public void sum() {
        int c = a + b;
        System.out.println("this is sum of A and B->"+c);
        
    }
    public void mult() {
        int D = 12;
        int C = 5;
        int F = D*C;
        System.out.println("this is mult->"+F);   
    }   
}
class Interface{
    public static void main(String[] args) {
        Sum S1 = new Sum();
        S1.sum();
        Sum s2 = new Sum();
        s2.mult();
    
    }

}