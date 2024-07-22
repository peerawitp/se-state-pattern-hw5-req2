package ku.cs.models;

import ku.cs.interfaces.State;
import ku.cs.states.*;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class Machine {
    private int inventory;
    private State currentState;
    private String flavor;

    private final State noQuarterState;
    private final State hasQuarterState;
    private final State chooseFlavorState;
    private final State gumballSoldState;
    private final State outOfGumballsState;
    private final State winnerState;

    public Machine(int gumballAmount) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        chooseFlavorState = new ChooseFlavorState(this);
        gumballSoldState = new GumballSoldState(this);
        outOfGumballsState = new OutOfGumballsState(this);
        winnerState = new WinnerState(this);

        this.inventory = gumballAmount;
        this.currentState = new NoQuarterState(this);
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getChooseFlavorState() {
        return chooseFlavorState;
    }

    public State getGumballSoldState() {
        return gumballSoldState;
    }

    public State getOutOfGumballsState() { return outOfGumballsState; }

    public State getWinnerState() { return winnerState; }

    public int getInventory() {
        return inventory;
    }

    public String getFlavor() {
        return flavor;
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

    public void choose(String flavor) {
        currentState.choose(flavor);
    }

    public void releaseBall() {
        System.out.println("A " + this.getFlavor() + " gumball comes rolling out the slot");
        if (inventory != 0) {
            inventory--;
        }
    }

    public void getInfo() {
        System.out.println("Mighty Gumball, Inc.\nJava-enabled Standing Gumball Model #2004\nInventory: " + this.getInventory() + " gumballs");
        currentState.getInfo();
    }
}
