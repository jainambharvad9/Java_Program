/*
-> if u have method in subclass in with same name and same sign as in 


when a method is called by subcl by obj the , method of subcla is c



method overloding                   VS                        methodoverriding
1)same name but different signature                     1) same name with same signature
2)it applied in same class                              2)it applied two diffrent class in inheritance
3)method overloding is ex of compiletime polymorphism   3) method overriding is run time poilymorphism


*/class A{
    
    void A(){
        System.out.println(" a is this");
    }
} 
class B extends A{
   
    void A(){
        System.out.println(" b is this ");
    }
}


public class methodoverriding {
    public static void main(String[] args) {
        B x = new B();
        x.A();
        
    }
}
