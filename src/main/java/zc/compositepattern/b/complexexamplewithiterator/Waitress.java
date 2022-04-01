package zc.compositepattern.b.complexexamplewithiterator;

import java.util.Iterator;

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

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n---");
        while(iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if(menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException ignored) {}
        }
    }
}
