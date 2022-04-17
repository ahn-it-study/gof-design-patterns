package ch8_Composite.compositeTest;

import javax.naming.OperationNotSupportedException;

public abstract class MenuComponent {

    public void add(MenuComponent menuComponent) throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    public void remove(MenuComponent menuComponent) throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    public MenuComponent getChild(int i) throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    public String getName() throws OperationNotSupportedException{
        throw new OperationNotSupportedException();
    }

    public String getDescription() throws OperationNotSupportedException{
        throw new OperationNotSupportedException();
    }

    public double getPrice() throws OperationNotSupportedException{
        throw new OperationNotSupportedException();
    }

    public boolean isVegetarian() throws OperationNotSupportedException{
        throw new OperationNotSupportedException();
    }

    public void print() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

}
