package zb.iteratorpattern.d.iteratorfixopenclose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shivam.si on 31/03/22 3:31 pm
 */

public class MenuTestDrive {
    public static void main(String[] args) {
        List<Menu> menuList = new ArrayList<>();
        menuList.add(new PancakeHouseMenu());
        menuList.add(new DinerMenu());
        menuList.add(new CafeMenu());

        Waitress waitress = new Waitress(menuList);
        waitress.printMenu();
    }
}
