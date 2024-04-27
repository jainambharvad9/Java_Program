/*
 * 
 * 
 */

class TestThread implements Runnable{
    Therad1 t;
    String name;
    TestThread(String  neam){
        this.name = name;
        t = new Therad1();
        
    }
    public void Start(){
        try{
            for(int i=0;i<=10;i++){
                System.out.println(" name is "+name+"val"+i);
                Therad1.sleep(1000);
            }

        }catch(Exception e){
            System.out.println("error"+e);
        }
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }
}
public class Therad1 {
    public static void main(String[] args) {
        Therad1 t = new Therad1();
        t.Start();
        // new TestThread("null");
       

    }

    public static void sleep(int i) {
    }
}
