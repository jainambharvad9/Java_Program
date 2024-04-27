/*call by value 
 * -> in pass by value copy of data are passed
 * -> we can't change origal param value.
*/
 class Number{
    void swap (int a,int b ){
    int c = a;
    a=b;
    b=c;
 }
}


public class Demo6 {
    public static void main(String[] args) {
        Number n = new Number();
        int a=10;
        int b=20;
        System.out.println(" a is "+a);
        System.out.println(" b is"+b);
        n.swap(a, b);
        System.out.println(" a is "+ a);
        System.out.println(" b is"+b);
    }
    
}