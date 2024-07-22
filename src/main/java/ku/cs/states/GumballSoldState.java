package ku.cs.states;

import ku.cs.interfaces.State;
import ku.cs.models.Machine;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class GumballSoldState implements State {
    private Machine machine;

    public GumballSoldState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
    }

    @Override
    public void ejectQuarter() {
    }

    @Override
    public void choose(String flavor) {
    }

    @Override
    public void turnCrank() {
    }

    @Override
    public void dispenseGumball() {
        machine.releaseBall();
        if (machine.getInventory() > 0) {
            machine.setCurrentState(machine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            machine.setCurrentState(machine.getOutOfGumballsState());
        }
        machine.setFlavor(null);
    }

    @Override
    public void getInfo() {
        System.out.println("Dispensing a gumball");
    }
}

