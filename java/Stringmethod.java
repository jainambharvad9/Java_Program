class Stringmethod{
    public static void main(String[] args) {
        String st1 ="This is String Method";
        String st2= "       Str Ex:        ";

        System.out.println("str1 is ->"+st1);
        System.out.println("str2 is ->"+st2);

        String subString = st1.substring(9);
        String subString2= st2.substring(9,16);

        System.out.println("SubString Is :->"+subString);
        System.out.println("Substring IS->"+subString2);

        String newString = st1.replace('s', 's');
        System.out.println("New String:"+newString);

        System.out.println();
    }
}