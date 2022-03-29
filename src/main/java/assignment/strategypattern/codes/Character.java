package assignment.strategypattern.codes;

/**
 * Created by shivam.si on 29/03/22 9:08 am
 */

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
