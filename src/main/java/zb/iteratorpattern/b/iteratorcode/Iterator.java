package zb.iteratorpattern.b.iteratorcode;

import zb.iteratorpattern.a.simplecode.MenuItem;

/**
 * Created by shivam.si on 31/03/22 3:15 pm
 */

public interface Iterator {
    public boolean hasNext();
    public MenuItem next();
}
