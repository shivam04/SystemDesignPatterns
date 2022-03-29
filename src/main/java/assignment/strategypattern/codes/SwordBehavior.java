package assignment.strategypattern.codes;

/**
 * Created by shivam.si on 29/03/22 9:08 am
 */

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Cutting With Sword");
    }
}
