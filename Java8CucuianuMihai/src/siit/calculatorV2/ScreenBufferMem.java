/*
 * Sub type of memory responsible for holding information that the Screen ca print out.
 * @author Mihai C.
 */
package siit.calculatorV2;

/**
 *
 * @author Mihai C
 */
public class ScreenBufferMem extends Memory{

    public ScreenBufferMem() {
        super.setMyData("null");
    }
    
//    A method that sets the default value of 0 to be printed out when turning on the computer or hitting the clear key
    
    public void defaultBuffer() {
        super.setMyData("0");
    }
    
    public void setMyBuffer(String inputData) {
        super.setMyData(inputData);
    }
    
    public String getMyBuffer() {
        return super.getMyData();
    }
}
