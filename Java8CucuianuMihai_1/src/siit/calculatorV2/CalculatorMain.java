/*
 * Main program class for Calculator V2
 *@ MihaiC
 */
package siit.calculatorV2;

/**
 *
 * @author MihaiC
 */
public class CalculatorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Case nzxt = new Case();
        Processor ryzen = new Processor();
        MotherBoard asus = new MotherBoard();
        Screen cheapScreen = new Screen();
        OnButton startButton = new OnButton("Function");
        NumPad numbers = new NumPad("Numpers");
        Operators operators = new Operators("Operators");
        ScreenBufferMem screenBuffer = new ScreenBufferMem();
        FirstInputMem firstMem = new FirstInputMem();
        SecondInputMem secondMem = new SecondInputMem();
        OperationMem operationMem = new OperationMem();
        ClearButton clearButton = new ClearButton("Clear Button");
        
        
       
        Calculator PocketCalculator = new Calculator(nzxt, asus, ryzen, cheapScreen, screenBuffer, firstMem, secondMem, operationMem, startButton, numbers, operators, clearButton);
        
        PocketCalculator.powerCalculator();       
        
    }
    
}
