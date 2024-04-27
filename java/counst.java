import pl;

class cd{
    double p,r,n;

      cd (double p,double r,double n){
        this.p=p;
        this.r=r;
        this.n=n;

    }
    cd (){
        this.p=10045;
        this.r=23;
        this.n=4;
    }
    void show(){
        double i  = p*r*n/100;
        System.out.println(i);

    }
}




public class counst {
    public static void main(String[] args) {
        
    
        cd b1 = new cd();
        cd b2 = new cd(1000,23,4);
b1.show();
b2.show();

    
}
}
