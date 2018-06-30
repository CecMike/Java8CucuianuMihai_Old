/*
 * A simple class to define a mother board
 * @author Mihai C
 */
package siit.calculatorV2;

/**
 *
 * @author Mihai C
 */
public class MotherBoard {
    
    private String model;

    public MotherBoard() {
        this.model = "Generic motherboard";
    }
    
//    A method to transmit comands from the procesor to the screen.
    
    public boolean comandTransfer() {
        return true;
    }
    
    
    
}
