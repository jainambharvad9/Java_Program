/*
 * 
 *          package:
 * -> pack is just a container or collection of class .
 * -> It is a directory or folder witch contains the source files ans its class file .
 * -> To Create a package keyword is used as the first statement .
 * after creating a package ,
 * you can use its classes in other java file
 * to dp this you have to import that package as follow
 * 
 *      import mypackage.java
 *         ->in bove Ex mypackage is follow name it conta Nunber class and two method sum() and sub()
 * -> anthor Ex:
 * import java.lang.Meth;
 * -> main dir.java-> sub dir lan -> Meth class.
 * 
 * 
 * 
 * -> for Ex:
 * ->Package mypackage:
 */

import mypackage.*;

public class Packagecreate {
    public static void main(String[] args) {
        Num n = new Num();
        System.out.println("sum is->"+n.sum(12, 12));
        System.out.println("sum is->"+n.sub(12, 10));
    }
}
