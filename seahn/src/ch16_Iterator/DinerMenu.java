package ch16_Iterator;

import ch16_Iterator.iterator.DinerMenuIterator;
import ch16_Iterator.iterator.Iterator;
import ch8_Composite.compositeTest.Menu;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("채식주의자용 BLT","통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴",true,2.99);
        addItem("BLT","통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴",true,2.99);
        addItem("오늘의 스프","감자 샐러드를 곁들인 오늘의 스프",true,3.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name,description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("죄송합니다, 메뉴가 꽉 찼습니다. 더이상 추가할 수 없습니다.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
