package zb.iteratorpattern.b.iteratorcode;

import zb.iteratorpattern.a.simplecode.MenuItem;

/**
 * Created by shivam.si on 31/03/22 3:19 pm
 */

public class DinerMenuIterator implements Iterator{
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
}
