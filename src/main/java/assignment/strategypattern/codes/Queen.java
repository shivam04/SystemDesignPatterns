package assignment.strategypattern.codes;

/**
 * Created by shivam.si on 29/03/22 9:09 am
 */

public class Queen extends Character{
    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
