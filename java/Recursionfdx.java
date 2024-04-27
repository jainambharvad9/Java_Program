public class Recursionfdx {
    public static void mallx(String str,int inx,int count,String newString) {
        if(inx == str.length()){
            for(int i=0;i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
    char currChar = str.charAt(inx);
    if(currChar == 'x'){
        count++;
        mallx(str, inx+1, count, newString);
    }else{
       newString += currChar;
       mallx(str, inx+1, count, newString);
    }   
    }
    public static void main(String args[]) {
        String str = "AxCDExxFGxHX";
        mallx(str, 0, 0, " ");
    
}
}
