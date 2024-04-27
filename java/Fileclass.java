import java.io.*;

/*
 *              The fileclass 
 *  ->The file class in used to get the info of a class.
 *  ->such as the length of a fil, file path etc.
 *  ->You can also create directory ,delet file and directory using file class
 *  ->the file has following constructor :
 *      1)file(String path)
 *      2)(string directory ,string filename)
 *      3)(file onj,string filename)
 * 
 *          
 */


public class Fileclass {
    public static void main(String[] args) {
        File f1 = new File("D:/MOVIES AND WEB");
        //File f2 = new File(f1, null);
        //File f3 = new File(f2, null);

        System.out.println(f1.isFile());

        System.out.println(f1.isDirectory());

        System.out.println(f1.lastModified());



       // File f2 = new File();
    }
}
