package ch16_Iterator;

import ch16_Iterator.iterator.DinerMenuIterator;
import ch16_Iterator.iterator.Iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuitems;

    public PancakeHouseMenu() {
        menuitems = new ArrayList();
        addItem("팬케이크 세트", "스크램블드 에그와 토스트가 곁들여진 팬케이크", true, 2.99);
        addItem("레귤러 팬케이크 세트", "달걀 후라이와 소시지가 곁들여진 팬케이크", false, 2.99);
        addItem("블루베리 팬케이크", "신선한 블루베리와 블루베리 시럽으로 만든 팬케이크", true, 3.49);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuitems.add(menuItem);
    }

}
