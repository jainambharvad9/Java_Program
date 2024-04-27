class RecurFact{
    public static int printfact(int n) {
        if (n == 1){
            return 1;
        }

        int FACT_Num = printfact(n-1);
        int Fact_N = n *FACT_Num; 
        return Fact_N;

        
    }
    
    public static void main(String[] args) {
        int n = 5;
       int ans = printfact(n);
       System.out.println(ans);
        
    }
}