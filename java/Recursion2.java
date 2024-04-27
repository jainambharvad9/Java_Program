import org.omg.CORBA.SystemException;

class Recursion2{
    public static boolean[] map = new  boolean[26];

    private static void Removedup(String str,int indx,String newString ) {

        if(indx == str.charAt(indx)){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(indx);
        if(map [currChar - 'a'] == true){
            Removedup(str, indx+1, newString);

        }else{
            newString += currChar;
            map [currChar - 'a'] = true;
            Removedup(str, indx+1, newString);
        }
    }


    public static void main(String args[]) {
        String str = "afsrddd";
        Removedup(null, 0, "");
        
    }
}
