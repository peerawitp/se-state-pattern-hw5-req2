package ku.cs;

import ku.cs.models.Machine;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine(5);
        machine.getInfo();

        machine.insertQuarter();
        machine.turnCrank();
        machine.ejectQuarter();

        System.out.println();

        machine.insertQuarter();
        machine.choose("Mango");
        machine.choose("Orange");
        machine.turnCrank();
    }
}