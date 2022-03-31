package zb.iteratorpattern.d.iteratorfixopenclose;

import zb.iteratorpattern.a.simplecode.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by shivam.si on 31/03/22 3:25 pm
 */

public class PancakeHouseIterator implements Iterator {
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size() && menuItems.get(position) != null;
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }

    @Override
    public void remove() {
        if(position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        menuItems.remove(position-1);
    }
}
