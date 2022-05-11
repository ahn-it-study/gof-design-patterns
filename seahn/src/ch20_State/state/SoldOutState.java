package ch20_State.state;

public class SoldOutState implements State{

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어주세요");
    }

    @Override
    public void tumCrank() {
        System.out.println("동전을 넣어주세요");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어주세요");
    }
}
