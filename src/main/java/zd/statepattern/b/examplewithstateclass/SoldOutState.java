package zd.statepattern.b.examplewithstateclass;

/**
 * Created by shivam.si on 01/04/22 6:05 pm
 */

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another Quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a Quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no gumball");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
