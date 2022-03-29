package assignment.strategypattern.codes;

/**
 * Created by shivam.si on 29/03/22 9:10 am
 */

public class Troll extends Character{
    public Troll() {
        weaponBehavior = new AxeBehavior();
    }


    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
