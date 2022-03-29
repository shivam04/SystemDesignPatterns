package assignment.strategypattern.codes;

/**
 * Created by shivam.si on 29/03/22 9:09 am
 */

public class King extends Character{
    public King() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
