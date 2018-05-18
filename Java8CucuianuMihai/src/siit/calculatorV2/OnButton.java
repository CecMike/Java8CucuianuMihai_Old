/*
 * This class defines a button to powering the device on and off.
 * The initial state of the computer is always off.
 * @author Mihai C
 */
package siit.calculatorV2;

/**
 *
 * @author Mihai C
 */
public class OnButton extends Buttons {
    
    private boolean power = false;
    
    public OnButton(String ButtonType) {
        super(ButtonType);
    }
    
//    This method switches the device On or Off. In order to easly observ the state in our program it also gives us a message on what happened
   
    public void powerComand(boolean power) {
        if (power) {
          setPower(false);
            System.out.println("As you press the button the calculator turns off");
        } else {
            setPower(true);
            System.out.println("As you press the button the calculator comes to life");
        }
    }

    public boolean isPower() {
        return power;
    }
    
    public void setPower(boolean state) {
        this.power = true;
    }

    
    
    
}
