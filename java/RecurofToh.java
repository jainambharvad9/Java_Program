class RecurofToh{
    public static void towerOfHanoi(int n,String src,String hlp,String dest) {
        if(n == 1){
            System.out.println("Trancfer disk to "+ n + "  from  "+ src +"  to  "+ dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, hlp);
        System.out.println("Trancfer disk to "+ n + "  from  "+ src +"  to  "+ dest);
        towerOfHanoi(n-1, hlp, src, dest);
        
    }
    public static void main(String[] args) {
        
        int n = 2;
        towerOfHanoi(n, " S ", " H ", " D ");
    }
}