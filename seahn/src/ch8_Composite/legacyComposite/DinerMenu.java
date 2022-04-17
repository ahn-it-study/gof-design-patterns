package ch8_Composite.legacyComposite;

import ch8_Composite.compositeTest.MenuItem;

import java.util.HashMap;
import java.util.Iterator;

public class DinerMenu implements Menu{
    HashMap menuItems = new HashMap();

    public DinerMenu(){
        addItem("양고기 스테이크", "국산 양고기",true, 13.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
