/*super keyword
 * super keyword can applied with 
 * 1 .to call the constructor
 *  -> using super keyword U can call the constructor
 * 
 * 2 .to access the member of bace calss 
 */

class A {
    int a ;
    A(int a){
       this.a =a;
    }
    void showA(){
        System.out.println("A is="+ a);
    }

}
class B extends A {
    int b ;
    int c;
    B(int a,int b,int c){
        
        super(a);
        this.b=b;
        this.c=c;
    }
   public void showB(){
        super.showA();
        System.out.println("B is="+ b);
        System.out.println(c);
    }

}

public class Inheritsuper2 {
    public static void main(String[] args) {
        B x = new B(10,20,30);
        x.showB();
        
    }
}
