package zb.iteratorpattern.c.iteratorfix;

import zb.iteratorpattern.a.simplecode.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by shivam.si on 31/03/22 2:44 pm
 */

public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast",
                true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage",
                false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries",
                true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries",
                true, 3.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator() {
        return new PancakeHouseIterator(menuItems);
    }

    //other methods here
}
