import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;

import javafx.print.Collation;

class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList<String> list2 = new ArrayList<String>();
        
        //add 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        // get
        int element = list.get(0);
        System.out.println(element);
        // add el in between 
        list.add(0,0);
        System.out.println(list);

        // set 
        list.set(0,5);

        System.out.println(list);

        // // delet
        // list.remove(3);
        // System.out.println(list);

        // //size 

        // int size = list.size();
        // System.out.println(size);

        // //loops

        // for(int i=0; i<=list.size(); i++){
        //     System.out.print(" "+list.get(i));
        // }
        // System.out.println();

        // Soring

        Collections.sort(list);
        System.out.println(list);
    }
}
