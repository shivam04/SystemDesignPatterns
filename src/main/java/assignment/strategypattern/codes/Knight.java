package assignment.strategypattern.codes;

/**
 * Created by shivam.si on 29/03/22 9:10 am
 */

public class Knight extends Character{
    public Knight() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
