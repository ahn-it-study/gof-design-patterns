package ch20_State.state;

public class GumballMachineTest {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.tumCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.tumCrank();
        gumballMachine.insertQuarter();
        gumballMachine.tumCrank();

        System.out.println(gumballMachine);

        gumballMachine.releaseBall();

        System.out.println(gumballMachine);
    }
}
