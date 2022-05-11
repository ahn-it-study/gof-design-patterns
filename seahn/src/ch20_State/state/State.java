package ch20_State.state;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void tumCrank();
    void dispense();
}
