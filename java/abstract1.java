import java.util.function.DoubleToIntFunction;

/*
 * Threre may be a situation when an  method in super c;ass does nota definea read implemention 
 * ,means the super class define only declaration no code part this type of method call abstract .
 * 
 * the abstract method must be on abstract class.
 * 
 * no object can be craate of abstract class 
 * 
 * the sub class of abstract class must override all abstracr method 
 */


abstract class B{
    double p ,r,n;
    void getdata(double p ,double r, double n){
        this .p = p;
        this . r= r;
        this . n=n;   
    }
    abstract void show();
}
class Simple extends B{
    void show(){
        double i= p*r*n/100;
        System.out.println( "simple i="+i );
    }
}
public class abstract1 {
    public static void main(String[] args) {
        Simple x = new Simple();
        x.show();   
    }
}