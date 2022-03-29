package assignment.strategypattern.codes;

/**
 * Created by shivam.si on 29/03/22 9:07 am
 */

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Shooting Arrow With Bow");
    }
}
