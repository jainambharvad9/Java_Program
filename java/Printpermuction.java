public class Printpermuction {
    public static void printPream(String str,String permu) {
        if(str.length() == 0){
            System.out.println(permu);
            return;
        }

        for(int i =0;i<str.length();i++){
            char CurrChar = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i+1);
            printPream(newStr, permu+CurrChar);
        }
        
    }
    public static void main(String[] args) {    
        String str = "ABC";
        printPream(str, "");
    }
}
