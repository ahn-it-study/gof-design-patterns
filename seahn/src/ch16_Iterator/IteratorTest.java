package ch16_Iterator;

import ch16_Iterator.iterator.Iterator;
import ch16_Iterator.menu.DinerMenu;
import ch16_Iterator.menu.PancakeHouseMenu;

public class IteratorTest {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        System.out.println("PancakeHouseMenu");
        Iterator breakfastItemsIterator = pancakeHouseMenu.createIterator();
        while (breakfastItemsIterator.hasNext()) {
            MenuItem menuItem = (MenuItem) breakfastItemsIterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
            System.out.println(menuItem.getDescription());
        }

        System.out.println("\n\n\nDinerMenu");
        Iterator lunchItemsIterator = dinerMenu.createIterator();
        while (lunchItemsIterator.hasNext()) {
            MenuItem menuItem = (MenuItem) lunchItemsIterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
            System.out.println(menuItem.getDescription());
        }


    }
}
