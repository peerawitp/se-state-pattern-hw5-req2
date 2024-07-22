package ku.cs.models;

import ku.cs.interfaces.State;
import ku.cs.states.*;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class Machine {
    private int inventory;
    private State currentState;

    private final State noQuarterState;
    private final State hasQuarterState;
    private final State gumballSoldState;
    private final State outOfGumballsState;

    public Machine(int gumballAmount) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        gumballSoldState = new GumballSoldState(this);
        outOfGumballsState = new OutOfGumballsState(this);

        this.inventory = gumballAmount;
        this.currentState = new NoQuarterState(this);
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getGumballSoldState() {
        return gumballSoldState;
    }

    public State getOutOfGumballsState() {
        return outOfGumballsState;
    }

    public int getInventory() {
        return inventory;
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
    }

    public void dispenseGumball() {
        currentState.dispenseGumball();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot");
        if (inventory != 0) {
            inventory--;
        }
    }

    public void getInfo() {
        System.out.println("Mighty Gumball, Inc.\nJava-enabled Standing Gumball Model #2004\nInventory: " + this.getInventory() + " gumballs");
        currentState.getInfo();
    }
}
