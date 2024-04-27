class demo1{
    double  p,r,n;
    void getdata(double a,double b,double c){
        p = a;
        r = b;
        n = c;

    }
    void Shoowdata(){
       
        double simp=p*r*n/100;
        System.out.println(simp);
    }

}

class simple{
    public static void main(String args[]) {
        
        demo1 d1 = new  demo1();
        d1.getdata(123,4,5);
        d1.Shoowdata();

        
    }
}