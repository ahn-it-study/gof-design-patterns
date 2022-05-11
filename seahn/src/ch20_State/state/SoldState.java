package ch20_State.state;

public class SoldState implements State{

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("잠시만 기다려주세요. 지금 뽑기가 진행중 입니다");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("이미 알멩이를 뽑으셨습니다");
    }

    @Override
    public void tumCrank() {
        System.out.println("손잡이는 한 번만 돌려주세요");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
