package zc.compositepattern.b.complexexamplewithiterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by shivam.si on 01/04/22 8:50 am
 */

public class CompositeIterator implements Iterator {

    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty())
            return false;
        Iterator<MenuComponent> iterator = stack.peek();
        if(!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return true;
    }

    @Override
    public Object next() {
        if(hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent menuComponent = iterator.next();
            stack.push(menuComponent.createIterator());
            return menuComponent;
        }
        return null;
    }
}
