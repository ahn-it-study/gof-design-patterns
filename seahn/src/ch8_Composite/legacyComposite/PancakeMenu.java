package ch8_Composite.legacyComposite;

import ch8_Composite.compositeTest.MenuItem;

import java.util.HashMap;
import java.util.Iterator;

public class PancakeMenu implements Menu{
    HashMap menuItems = new HashMap();

    public PancakeMenu(){
        addItem("블루베리 팬케이크", "블루베리 가득",true, 3.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
