import java.util.*;

import javafx.util.converter.FormatStringConverter;


public class multipelfun {
   
    /*public static int calculatesum(int a,int b) {
        int  sum=a+b;
        return sum;
         
    }
    public static int calculatesum(int a,int b){ 
        return a * b;
    }*/
    public static void printFactorial(int n ) {
        if (n<0){
            System.out.println("invalide number");
            return;
        }
        int Factorial = 1;
        for(int i=n;i>=1;i--){
            Factorial = Factorial * i;
        }
        System.out.println(Factorial);
        return;

        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printFactorial(n);
        System.out.println();



        /*int a = sc.nextInt();
        int b = sc.nextInt();
        

       ;
        System.out.println("multiple of 2 number is :"+calculatesum(a, b));*/

        
    }
    
}
    

