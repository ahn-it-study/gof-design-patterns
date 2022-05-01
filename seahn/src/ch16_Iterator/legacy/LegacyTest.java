package ch16_Iterator.legacy;

import java.util.ArrayList;

public class LegacyTest {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        System.out.println("PancakeHouseMenu");
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = breakfastItems.get(i);
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
            System.out.println(menuItem.getDescription());
        }

        System.out.println("DinerMenu");
        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            if (menuItem == null) break;
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
            System.out.println(menuItem.getDescription());
        }
    }
}
