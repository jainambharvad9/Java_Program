import java.util.Scanner;

public class bitm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        int n = 5;//0101
        int pos = 1;
         int bitmask = 1<<pos;

        //  if((bitmask & n) == 0){
        //     System.out.println("bit is zero");
        //  }else{
        //     System.out.println("bit is one ");
        //  }

        // int newnumberBit = bitmask | n;
        // System.out.println(newnumberBit);

        // int notBitmask = ~(bitmask);
        // int newBitmask = notBitmask & n ;
        // System.out.println(newBitmask);


        if (oper == 1){
            int newnumberBit = bitmask | n;
            System.out.println(newnumberBit);

        }else{
           int newbitnum = ~(bitmask);
           int newnumberBit = bitmask & n;
           System.out.println(newnumberBit);

        }
    }
    
}
