package zc.compositepattern.a.simpleexample;

import zb.iteratorpattern.a.simplecode.MenuItem;

import java.util.Iterator;
import java.util.List;

/**
 * Created by shivam.si on 31/03/22 3:27 pm
 */

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
