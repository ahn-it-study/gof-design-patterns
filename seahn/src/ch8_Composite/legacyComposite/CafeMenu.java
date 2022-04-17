package ch8_Composite.legacyComposite;

import ch8_Composite.compositeTest.MenuItem;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{
    HashMap menuItems = new HashMap();

    public CafeMenu(){
        addItem("아바라", "바닐라 향 가득",true, 1.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
