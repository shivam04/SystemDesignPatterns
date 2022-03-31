package zb.iteratorpattern.d.iteratorfixopenclose;

import zb.iteratorpattern.a.simplecode.MenuItem;

import java.util.Iterator;

/**
 * Created by shivam.si on 31/03/22 2:49 pm
 */

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce& tomato on whole wheat",
                true, 2.99);
        addItem("BLT", "Bacon with lettuce& tomato on whole wheat",
                false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad",
                false, 3.29);
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu if full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    //other methods here
}
