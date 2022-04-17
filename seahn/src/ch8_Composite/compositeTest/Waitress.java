package ch8_Composite.compositeTest;

import javax.naming.OperationNotSupportedException;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() throws OperationNotSupportedException {
        allMenus.print();
    }
}
