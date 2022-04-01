package zc.compositepattern.b.complexexamplewithiterator;

import java.util.Iterator;

/**
 * Created by shivam.si on 01/04/22 8:55 am
 */

public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
