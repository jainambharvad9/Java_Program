/*Sub : java
 * 
 * date 6 - jan- 2003
 * 
 * String Buffer class
 * 
 * -> sting cl create is fixed length
 * 
 * -> StringBuffer cl is peer cl of String cl.
 * 
 * -> it has all the functionlities of String cl.but it create a var length and changble string obj
 * 
 * -> so u can insert char into a stringbuffer,delete a char from stringBuffer 
 */

public class Strings {
    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer("Frind ");
        System.out.println(" String is "+s1);

        s1.append("Best");
        System.out.println(" String is "+s1);

        s1.insert(5, " is ");
        System.out.println(" String is "+s1);

        s1.delete(6, 9);
        System.out.println(" String is "+s1);

        s1.replace(2, 3, "*");
        System.out.println(" String is "+s1);

        String Name1 = "jainam";
        String Name2 = "jainam Bharvad";

        // System.out.println(FullName.length());
        // for(int i=0;i<=FullName.length();i++){
        //     System.out.println(FullName.charAt(i));

        if(Name1.compareTo(Name2) == 0){
            System.out.println("String are equle");

        }else{
            System.out.println("string are not equle");
        }
        }        
    }