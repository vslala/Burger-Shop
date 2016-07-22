package main.java.com.bitwiseglobal.burgershop;

import java.util.Iterator;
import java.util.List;

/**
 * Created by akankshap on 7/22/2016.
 */
public class Utility {

    public static void printList(List list){
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            Object object = itr.next();
            System.out.println(object + " ");
        }

    }
}
