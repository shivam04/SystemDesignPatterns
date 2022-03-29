package assignment.strategypattern.codes;

/**
 * Created by shivam.si on 29/03/22 9:06 am
 */

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Cutting With Knife");
    }
}
