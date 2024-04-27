import javax.lang.model.element.Element;

public class Recurfind {
    public static int first=-1;
     public static int last=-1;
    
            public static void  printChar(String src,int index,Character element) {
                if(index == src.length()){
                    System.out.println(first);
                    System.out.println(last);
                    return;
                }
        // Character currchar = src.charAt(index);
        // if(currchar == element){
           if(first == -1){
            first = index;
           }else{
            last = index;
           }
           printChar(src, index+1, element);
        }
    //}
    public static void main(String args[]) {
        String src ="abaacdaefah";
        printChar(src, 0, 'a');
    }
}
