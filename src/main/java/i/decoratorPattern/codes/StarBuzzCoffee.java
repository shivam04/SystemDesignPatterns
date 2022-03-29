package i.decoratorPattern.codes;

/**
 * Created by shivam.si on 29/03/22 1:27 pm
 */

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setSize(Beverage.Size.VENTI);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage doubleMochaWhipDarkRoast = new DarkRoast();
        doubleMochaWhipDarkRoast = new Mocha(doubleMochaWhipDarkRoast);
        doubleMochaWhipDarkRoast = new Mocha(doubleMochaWhipDarkRoast);
        doubleMochaWhipDarkRoast = new Whip(doubleMochaWhipDarkRoast);
        System.out.println(doubleMochaWhipDarkRoast.getDescription() + " $" + doubleMochaWhipDarkRoast.cost());

        Beverage soyMochaWhipHouseBlend = new HouseBlend();
        soyMochaWhipHouseBlend = new Soy(soyMochaWhipHouseBlend);
        soyMochaWhipHouseBlend = new Mocha(soyMochaWhipHouseBlend);
        soyMochaWhipHouseBlend = new Whip(soyMochaWhipHouseBlend);
        System.out.println(soyMochaWhipHouseBlend.getDescription() + " $" + soyMochaWhipHouseBlend.cost());
    }
}
