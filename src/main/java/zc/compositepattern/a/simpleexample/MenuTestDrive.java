package zc.compositepattern.a.simpleexample;

/**
 * Created by shivam.si on 31/03/22 3:31 pm
 */

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeMenu = new Menu("PANCAKE HOUSE MENU", "BreakFast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT  MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENU", "All Menus Combined");

        allMenus.add(pancakeMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast",
                true, 2.99));
        pancakeMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage",
                false, 2.99));
        pancakeMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries",
                true, 3.49));
        pancakeMenu.add(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries",
                true, 3.59));

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day", "Soup of the day, with a side of potato salad",
                false, 3.69));
        cafeMenu.add(new MenuItem("Burrito", "A large Burrito, with whole pinot beans, salsa, guacamole",
                true, 4.29));


        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89));
        dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce& tomato on whole wheat",
                true, 2.99));
        dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce& tomato on whole wheat",
                false, 2.99));
        dinerMenu.add(new MenuItem("Soup of the day", "Soup of the day, with a side of potato salad",
                false, 3.29));
        dinerMenu.add(new MenuItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple Pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
