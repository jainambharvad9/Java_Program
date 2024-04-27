import java.util.HashSet;

public class Recursion3 {
    public static void SubsequenceNUmber(String str,int indx,String newString,HashSet<String> allsubseq) {

        if(indx == str.length()){
            if(allsubseq.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                allsubseq.add(newString);
                return;
            }
            // System.out.println(newString);
            // return;
        }
    char CurrChat = str.charAt(indx);

    SubsequenceNUmber(str, indx+1, newString+CurrChat,allsubseq);

    SubsequenceNUmber(str, indx+1, newString,allsubseq);
        
    }
    public static void main(String[] args) {
        //String str ="ABCD";
        String str = "AAA";
        HashSet<String>set = new HashSet<>();
        SubsequenceNUmber(str, 0, "",set);

        
    }
}
