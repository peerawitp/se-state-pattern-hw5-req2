package ku.cs.states;

import ku.cs.interfaces.State;
import ku.cs.models.Machine;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class HasQuarterState implements State {
    private Machine machine;

    public HasQuarterState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        machine.setCurrentState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned..");
        machine.setCurrentState(machine.getGumballSoldState());
        machine.dispenseGumball();
    }

    @Override
    public void dispenseGumball() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void getInfo() {
        System.out.println("Machine has a quarter");
    }
}

