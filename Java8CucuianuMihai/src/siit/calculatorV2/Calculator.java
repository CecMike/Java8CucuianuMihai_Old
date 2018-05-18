/*
 * Calculator class. Defines the calculator and how the difent components interact with one another.
 *@author Mihai C
 */
package siit.calculatorV2;

import java.util.Scanner;

/**
 *
 * @author MihaiC
 */
public class Calculator {
    
    /*
     * The elements that come toghether to creat a calculator    
     */
    
    private Case myCase;
    private MotherBoard myMotherBoard;
    private Processor myProcessor;
    private Screen myScreen;
    private ScreenBufferMem myBuffer;
    private FirstInputMem myFirstInput;
    private SecondInputMem mySecondInput;
    private OperationMem myOperation;
    private OnButton myOnButton;
    private NumPad myNumPad;
    private Operators myOperators;
    private ClearButton myClearButton;

    // Calculator generator
    
    public Calculator(Case myCase, MotherBoard myMotherBoard, Processor myProcessor, Screen myScreen, ScreenBufferMem myBuffer, FirstInputMem myFirstInput, SecondInputMem mySecondInput, OperationMem myOperaton, OnButton myOnButton, NumPad myNumPad, Operators myOperators, ClearButton myClearButton) {
        this.myCase = myCase;
        this.myMotherBoard = myMotherBoard;
        this.myProcessor = myProcessor;
        this.myScreen = myScreen;
        this.myBuffer = myBuffer;
        this.myFirstInput = myFirstInput;
        this.mySecondInput = mySecondInput;
        this.myOperation = myOperaton;
        this.myOnButton = myOnButton;
        this.myNumPad = myNumPad;
        this.myOperators = myOperators;
        this.myClearButton = myClearButton;
    }
    
// Method for starting the calculator and it also calls myComputation method
    
    public void powerCalculator() {
        myOnButton.powerComand(myOnButton.isPower());
        if (myOnButton.isPower()) {
            boolean i = myProcessor.myAction();
            while (i) {
                i = false;
                myBuffer.defaultBuffer();
                boolean j = myMotherBoard.comandTransfer();
                while (j) {
                    myScreen.printResult(myBuffer.getMyBuffer());
                    j = false;
                }
            }
            myComputation();            
        }        
    }
    
//    myComputation is the method responsible of conecting the processes of each part
//    It conects the various inputs (Power button, numeric keys, operation keys and clear key) with the CPU in order to save data in the memory 
//    The CPU also sends comads through the mother board to the display in order to print out the data found in the display buffer memory
    
    public void myComputation() {
        
        Boolean quit = false;
        Scanner scan = new Scanner(System.in);
        
        while (!quit) {
            
        System.out.println("Type in your first operator");
        myFirstInput.setMyData(myProcessor.dataTransfer(myNumPad.comandsInput()));
        myProcessor.isDouble(myFirstInput.getMyData());
        System.out.println("Type in your operation");
        myOperation.setMyData(myProcessor.dataTransfer(myOperators.comandsInput()));
        System.out.println("Type your second operation");
        mySecondInput.setMyData(myProcessor.dataTransfer(myNumPad.comandsInput()));
        myProcessor.isDouble(mySecondInput.getMyData());
        myBuffer.setMyBuffer(myProcessor.calculateResult(myFirstInput.getMyData(), mySecondInput.getMyData(), myOperation.getMyData()));
        boolean i = myProcessor.myAction();
        while (i) {
            i = false;
            boolean j = myMotherBoard.comandTransfer();
            while (j) {
                j = false;
                myScreen.printResult(myBuffer.getMyBuffer());
            }
        }
        
                System.out.println("Do you want to hit the clear button and do another calculation? (y/n)");
                String h = scan.nextLine();
                if ("y".equals(h)) {
                    Boolean press = myClearButton.clearComand();
                    while (press) {
                        press = false;
                        Boolean procesorComTransfer = myProcessor.myAction();
                        while (procesorComTransfer) {
                            procesorComTransfer = false;
                            myBuffer.defaultBuffer();
                            Boolean mbDisplayCom = myMotherBoard.comandTransfer();
                            while (mbDisplayCom) {
                                mbDisplayCom = false;
                                myScreen.printResult(myBuffer.getMyData());
                            }
                        }
                    }
//                    break;
                } else {
                    if ("n".equals(h)){
                myOnButton.powerComand(myOnButton.isPower());
                quit = true;                    
                break;
                } else {
                    if (!"y".equals(h) || !"n".equals(h)) {
                        System.out.println("Wrong imput, I QUIT");
                        System.exit(0);
                    }
                }  
            }
        }   
    }
}

