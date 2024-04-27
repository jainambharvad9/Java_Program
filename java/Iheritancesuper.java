class Bird{
    String name ,color;
    Bird(String name ,String color){
    this.name =  name;
    this.color = color;        
    }
}
class FD extends Bird{
    FD(String name, String color){
        super (name ,color);
    }
    void show(){
        System.out.println(" my name  is "+name);
        System.out.println((" my  color is "+color));
    }
}
public class Iheritancesuper {
    public static void main(String[] args) {
        FD c = new FD ("crow","B");
        FD p = new  FD("perrot"," g");
        FD d = new  FD("jay","w");
        c.show();
        p.show();
        d.show();
    }
}
