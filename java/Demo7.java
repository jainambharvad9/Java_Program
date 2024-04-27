/*call by ref 
 * when we pass by obj as para
 * it becomes  acall by ref
 * we can change org para value
*/
class Number{
    int a, b;
    Number(){}
    Number(int a,int b){
        this.a = a;
        this.b=b;

    }
    void show(){
        System.out.println("a is "+a);
        System.out.println(" b is "+b);

    }
    void swap(Number n){
        int c =n.a;
        n.a=n.b;
        n.b=c;

    }
    public void swap() {
    }
}


public class Demo7 {
    public static void main(String[] args) {
        

        int a=10,b=12;
        Number n = new Number();
        System.out.println("****** bEf Swap*******");
     
        n.swap(n);
        System.out.println("********AfF*********************");
        n.swap();

    }
    
}
