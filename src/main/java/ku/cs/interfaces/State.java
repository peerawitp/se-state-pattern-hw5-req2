package ku.cs.interfaces;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public interface State {
    void insertQuarter();
    void turnCrank();
    void dispenseGumball();
    void ejectQuarter();
    void choose(String flavor);
    void getInfo();
}
