package zb.iteratorpattern.d.iteratorfixopenclose;

import zb.iteratorpattern.a.simplecode.MenuItem;

import java.util.Iterator;
import java.util.List;

/**
 * Created by shivam.si on 31/03/22 3:27 pm
 */

public class Waitress {
    List<Menu> menuList;

    public Waitress(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public void printMenu() {
        for (Menu menu : menuList) {
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = ( MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
