public class FindKeypadformet {
    public static String[] keyad={".","abc","def","ghi","jkl","mno","pqrs","tuvw","xyw"};
        public static void PrintCombokeypadnum(String str,int idx, String combinaction ){
            if( idx == str.length()){
                System.out.println(combinaction);
                return;
            }
            char CurrChar = str.charAt(idx);
            String maping = keyad[CurrChar - '0'];
            
            for(int i =0; i < maping.length();i++){
                PrintCombokeypadnum(str, idx+1, combinaction+maping.charAt(i));
            }
        } 
    public static void main(String[] args) {
        String str = "555";
        PrintCombokeypadnum(str, 0, "");
        
    }
}
