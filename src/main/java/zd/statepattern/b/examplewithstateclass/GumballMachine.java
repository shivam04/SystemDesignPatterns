package zd.statepattern.b.examplewithstateclass;

/**
 * Created by shivam.si on 01/04/22 5:48 pm
 */

public class GumballMachine {
    State soldOutState;
    State soldState;
    State hasQuarterState;
    State noQuarterState;
    State winnerState;

    State state;
    int count = 0;

    public GumballMachine(int numberOfGumBalls) {
        this.count = numberOfGumBalls;
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        winnerState = new WinnerState(this);
        if(numberOfGumBalls > 0 ){
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out of the slot");
        if(count != 0)
            count -= 1;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public String toString() {
        return "Mighty Gumball, Inc.\n" +
                "Inventory: " + count + " Gumballs\n" +
                state;
    }
}
