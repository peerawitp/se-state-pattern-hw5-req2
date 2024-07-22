package ku.cs.states;

import ku.cs.interfaces.State;
import ku.cs.models.Machine;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class WinnerState implements State {
    private Machine machine;

    public WinnerState(Machine machine) {
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
        System.out.println("Congratulations! You are a winner! You get two gumballs");
        machine.releaseBall();
        machine.releaseBall();

        if (machine.getInventory() == 0) {
            machine.setCurrentState(machine.getOutOfGumballsState());
        } else {
            machine.setCurrentState(machine.getNoQuarterState());
        }
        machine.setFlavor(null);
    }

    @Override
    public void getInfo() {
        System.out.println("You are a winner!");
    }
}