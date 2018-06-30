/*
 * This class defines the functions(methods) of the CPU.
 * @author Mihai C
 */
package siit.calculatorV2;

/**
 *
 * @author Mihai C
 */
public class Processor {
    
    private String model;

    public Processor() {
        this.model = "Snapdragon";
    }
    
// A method used to transfer data from inputs to memory     
    
    public String dataTransfer (String info) {
        return info;
    }
  
//   A method to start an action (ex. print data or clear data) 
    
    public boolean myAction () {
        return true;
    }
    
//     A method to verify that the information that is inputed as a string is a valid double variable
//     If  the input is invalid the program is terminated
    
    public void isDouble(String str) {
    if(str == null || str.trim().isEmpty()) {
        System.out.println("This is not the right input, I QUIT");
        System.exit(0);
    }
    for (int i = 0; i < str.length(); i++) {
        if(!Character.isDigit(str.charAt(i)) || ".".equals(str.charAt(i))) {
        System.out.println("This is not the right input, I QUIT");
        System.exit(0);
        } 
    }
    }

//     The mai method for simple mathematic operations that returns a result.
//     It also checks the operator is valid ( + , - , * , / )
//     If the check fails the program is terminated.    
    
    public String calculateResult(String firstOperator, String secondOperator, String operation) {
        double i = -1;
        String result = "null";
        
        if ("+".equals(operation)) {
            i = Double.parseDouble(firstOperator) + Double.parseDouble(secondOperator);
        } else
       
        if ("-".equals(operation)) {
            i = Double.parseDouble(firstOperator) - Double.parseDouble(secondOperator);
        } else
           
        if ("*".equals(operation)) {
            i = Double.parseDouble(firstOperator) * Double.parseDouble(secondOperator);
        } else
            
        if ("/".equals(operation)) {
            i = Double.parseDouble(firstOperator) / Double.parseDouble(secondOperator);
        } 
        
        else {
            System.out.println("The operator you introduced is invalid, I QUIT");
            System.exit(0);
        }
        
      
        result = Double.toString(i);
        return result;
        
       }  
    
}
