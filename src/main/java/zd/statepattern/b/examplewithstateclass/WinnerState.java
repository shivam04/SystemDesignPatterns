package zd.statepattern.b.examplewithstateclass;

/**
 * Created by shivam.si on 01/04/22 6:25 pm
 */

public class WinnerState implements State{

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Winner, Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Winner, Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Winner, Turning twice won't get you another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
            if(gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of the gumball");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
