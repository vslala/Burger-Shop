package test.main.java.com.bitwiseglobal.burgershop;

import main.java.com.bitwiseglobal.burgershop.*;
import org.junit.Test;

import java.util.List;

/**
 * Created by akankshap on 7/22/2016.
 */


public class TestUtility {
    Utility utility;

    @Test
    public void itShouldPrintAnyList(){
        List list = new Burger().getList();
        List list1 = new Additional().getList();
        List list2 = new Drink().getList();

        Utility.printList(list);
        Utility.printList(list1);
        Utility.printList(list2);
    }

    @Test
    public void itShouldGetTheBurgerFromTheList () {
        Menu menu = new Menu ();
    }
}
