package ku.cs.states;

import ku.cs.interfaces.State;
import ku.cs.models.Machine;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class OutOfGumballsState implements State {
    private Machine machine;

    public OutOfGumballsState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
    }

    @Override
    public void choose(String flavor) {
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void dispenseGumball() {
    }

    @Override
    public void getInfo() {
        System.out.println("Machine is sold out");
    }
}
