/*
 * 1) by extending the therad class
 * 2) by implementing the Runnble interface
 * 
 * 1))) By extending the Therad classs:
 * -> The Thraed cl has Run() method after extending Thread ck , u have to overrdi Than run() method 
 * -> the run () method running sratr
 * -> The start nethoid witch is turn called to run() method
 */

class TheThread extends Thread{
    String name;
    TheThread ( String name){
        super(name);
        this.name= name;
    }
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("name is " +name + " value "+i);
                Thread.sleep(2000);
                System.out.println();
            }
        }
        catch(Exception e ){
            System.out.println("error"+e);
        }
    }
}

public class Therad {
    public static void main(String[] args) {
        TheThread t1 = new TheThread(" First ");
        TheThread t2 = new TheThread(" Second ");
        TheThread t3 = new TheThread(" Three ");
        TheThread t4 = new TheThread(" Four ");
        TheThread t5 = new TheThread(" Five ");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    public void Start() {
    }
}
