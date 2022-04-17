package ch8_Composite.legacyComposite;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeMenu pancakeMenu = new PancakeMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
