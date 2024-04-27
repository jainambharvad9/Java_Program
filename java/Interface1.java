interface AD{
    int R=10;
    void MJ();
}
interface AC{
    int A=20;
    void MJ();
}
class BC implements AD,AC{
    public void MJ(){
        int C = R*A;
        System.out.println("this is multip->"+C);
    }
}

public class Interface1 {
    
    

    public static void ma
    in(String[] args) {
        BC b1 = new BC();
        b1.MJ();
        
    }
}
