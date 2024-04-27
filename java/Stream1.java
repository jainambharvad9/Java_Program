/*
 * 
 *              Stream Class :
 * -> A Stream is path or a medium along witch the data flows.
 * -> Data Passes though stream from source to detiation .
 * -> The Source called input and the detination is called output.
 * -> example of input stream can be keyboard or mouse
 * -> example of output stream can be monitor or printer
 * 
 * 
 * THERE are two main categories of stream
 * 1) charachter steam
 * 2) byte stream
 * 
 * 
 * 1) character stream(((((((Frist)))))))
 *  1.1) reader
 *      a) bufferedreder
 *      b)inoutsream reder
 *          C)file reader
 * 
 * 1.2)writer
 *         a)bufferreader
 *          B)output sream reader
 *              >filewriter
 *          c)printwriter
 * 
 * 
 * 2)byte strem class 
 * 2.1)inputstream
 *      A)file inputstream
 *      b)objectinputstream
 *      c)filterinputstream
 * 2.2)outputstream
 *      a)fileoutputstream
 *      b)objectinputstream
 *      c)filteroutputstream
 * 
 * 
 * 1) character stream
 * ->Writer Class 
 *     - The Writer class is an Abstract class so ve can not create obj.
 *     - OutpuStreamWriter is sub class of Writer class
 *     - The FileWriter is used to Write cahr in a file
 * 
 * 
 * ->Reader Class 
 *     - The Reader class is an Abstract class so ve can not create obj.
 *     - InpuStreamWriter is sub class of Reader class
 *     - The FileWriter is used to sub class of Reader char in a file
 
 */

import java.io.*;
import java.util.*;

public class Stream1 {
    public static void main(String[] args) {
        try {
            String m="This is BEST Stream Class";

            FileReader f = new FileReader("msg.txt");
            int ch;
            do {
                ch=f.read();
                if(ch!=-1)
                System.out.print((char)ch);
            } while (ch!=1);
            f.close();

            //Reader n="NOt IS THis Best";
        } catch (Exception e) {
            // TODO: handle exception
                
        }
        //Scanner sc = new Scanner(System.in);
    }
}
