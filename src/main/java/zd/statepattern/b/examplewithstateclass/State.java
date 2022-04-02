package zd.statepattern.b.examplewithstateclass;

/**
 * Created by shivam.si on 01/04/22 5:43 pm
 */

public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
