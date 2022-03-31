package zb.iteratorpattern.c.iteratorfix;

import zb.iteratorpattern.a.simplecode.MenuItem;

import java.util.Iterator;

/**
 * Created by shivam.si on 31/03/22 3:19 pm
 */

public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public MenuItem next() {
        return menuItems[position++];
    }

    @Override
    public void remove() {
        if(position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if(menuItems[position-1] != null) {
            for(int i=position-1; i < (menuItems.length-1); i++) {
                menuItems[i] = menuItems[i+1];
            }
            menuItems[menuItems.length - 1] = null;
        }
    }
}
