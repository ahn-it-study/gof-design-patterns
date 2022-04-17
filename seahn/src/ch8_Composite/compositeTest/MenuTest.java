package ch8_Composite.compositeTest;

import javax.naming.OperationNotSupportedException;

public class MenuTest {
    public static void main(String[] args) throws OperationNotSupportedException {
        MenuComponent pancakeHouseMenu =
                new Menu("팬케이크 하우스 메뉴", "아침 메뉴");
        MenuComponent dinerMenu =
                new Menu("객체마을 식당 메뉴", "점심 메뉴");
        MenuComponent cafeMenu =
                new Menu("카페 메뉴", "저녁 메뉴");
        MenuComponent dessertMenu =
                new Menu("디저트 메뉴", "디저트를 즐겨 보세요!");

        MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // 메뉴 항목을 추가하는 부분
        pancakeHouseMenu.add(new MenuItem("팬케이크","블루베리 팬케이크",true,2.99));

        dinerMenu.add(new MenuItem("파스타", "올리브 파스타",true, 3.89));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("애플 파이", "바닐라 아이스크림이 얹혀있는 애플 파이", true, 1.59));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();

    }
}
