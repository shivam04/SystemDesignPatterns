package zd.statepattern.a.simpleexample;

/**
 * Created by shivam.si on 01/04/22 11:56 am
 */

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;

    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if(count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if(state == HAS_QUARTER) {
            System.out.println("You can't insert another Quarter");
        } else if(state == NO_QUARTER) {
            System.out.println("You inserted a Quarter");
            state = HAS_QUARTER;
        } else if(state == SOLD_OUT) {
            System.out.println("You can't insert another Quarter, the machine is sold out");
        } else if (state == SOLD) {
            System.out.println("Please wait, we're already giving you a gumball");
        }
    }

    public void ejectQuarter() {
        if(state == HAS_QUARTER) {
            System.out.println("Quarter Returned");
            state = NO_QUARTER;
        } else if(state == NO_QUARTER) {
            System.out.println("You haven't inserted a Quarter");
        } else if(state == SOLD) {
            System.out.println("Sorry, you already turned the crank");
        } else if(state == SOLD_OUT) {
            System.out.println("You can't eject, you haven't inserted a Quarter");
        }
    }

    public void turnCrank() {
        if(state == SOLD) {
            System.out.println("Turning twice won't get you another gumball");
        } else if(state == NO_QUARTER) {
            System.out.println("You turned but there's no quarter");
        } else if(state == SOLD_OUT) {
            System.out.println("You turned but there's no gumball");
        } else if(state == HAS_QUARTER){
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }

    public void dispense() {
        if(state == SOLD) {
            System.out.println("A gumball comes rolling out of the slot");
            count = count - 1;
            if(count == 0) {
                System.out.println("Oops, out of the gumball");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if(state == NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if(state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if(state == HAS_QUARTER){
            System.out.println("No gumball dispensed");
        }
    }
}
