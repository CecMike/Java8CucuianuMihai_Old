/*
 * A class that describes a cler button.
 * @author Mihai C
 */
package siit.calculatorV2;

/**
 *
 * @author Mihai C
 */
public class ClearButton extends Buttons {

    public ClearButton(String ButtonType) {
        super(ButtonType);
    }
    
    
//    This method gives sends a comand to the CPU to whipe the buffer memmory. For the porpus of this program it also prints out a message in the console.
    
public boolean clearComand() {
    System.out.println("You pressed clear");
    return true;
}    
    
}
