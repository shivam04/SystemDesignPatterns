package zb.iteratorpattern.c.iteratorfix;

import zb.iteratorpattern.a.simplecode.MenuItem;

import java.util.Iterator;

/**
 * Created by shivam.si on 31/03/22 3:43 pm
 */

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
