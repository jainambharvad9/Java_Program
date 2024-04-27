

/*
 * >
 */



public class Handling {
    public static void main(String[] args) {
        //GetBytes
        String str2 = "ABC";
        byte byArray[] = new byte[3];
        
        byArray = str2.getBytes();
        System.out.println("byte 1 is"+byArray[0]);

        // toCharArray()
        // convert to char type aarray

        String str3 = "ABC";
        char chArray[] = new char[3];
        
        chArray = str3.toCharArray();
        System.out.println("byte 1 is"+chArray[0]);

        //String comparision 

        String s1 = "ABC";
        String s2 = " ABD";
        String s3 = "ABC";

        if(s1.equals(s2));
        System.out.println(" both are equals");}
        else
        System.out.println(" both are not equles");

        //equalsIgnoreCase
        if(s1.equalsIgnoreCase(s2));
        System.out.println("both are equles");
        else 
        System.out.println(" both are not equles");}
            // Starswith
        if(s1.startsWith(s2));
        System.out.println(" yes");
        else 
        System.out.println(" no ");

        if(s1.startsWith(s3));
        System.out.println(" yes");
        else 
        System.out.println(" no ");


    }

    }
    
