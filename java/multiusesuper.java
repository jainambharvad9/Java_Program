class A{
    int a;
    A(int a){
        this.a=a;
    }
}
class B extends A{
    int b;
    B(int a,int b){
        super(a);
        this.b=b;
    }
}
class c extends B{
    int c ;
    c(int a,int b){
        super(a,b);

    }
    void sum(){
        c=a+b;
    }
}

public class multiusesuper {
    public static void main(String[] args) {
        c x =new c(10,20);
        x.sum();
        
    }
}
