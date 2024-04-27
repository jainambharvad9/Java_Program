/*
 * ccommand line args
 * 
 * => u can pass args to the main()
 * => this can  be ar runtime 
 * main() takes String args 
 * => ek
 */


public class cmdline {
    
    public static void main(String[] args) {
        if (args.length == 2){
            int a,s=0;
            for (int i=0;i<=args.length;i++){
                a=Integer.parseInt(args[i]);
                s=s+a;
                
                
            }
            System.out.println("sum is "+s);
        }
        else
        {
            System.out.println(" pass two args");
        }   
        }
        
    }

