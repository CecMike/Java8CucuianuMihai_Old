/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8cucuianumihai;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author MiIke Window
 */
public class Java8CucuianuMihai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int firstOperator;
        int secondOperator;
        int result = 0;
        int operation;
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Hello World");
        
        System.out.println("Please insert your first number:");
        String inputLine = scan.nextLine();
        while (true) {
            if (Pattern.matches ("\\d+", inputLine)){
                firstOperator = Integer.parseInt(inputLine);
                break;
            } 
            
            System.out.println("Your " + inputLine + "isn't a number please try again");
            inputLine = scan.next();
        }
        
        
        System.out.println("Please insert your second number:");
             inputLine = scan.nextLine();
        while (true) {
            if (Pattern.matches ("\\d+", inputLine)){
                secondOperator = Integer.parseInt(inputLine);
                break;
            } 
            
            System.out.println("Your " + inputLine + "isn't a number please try again");
            inputLine = scan.next();
        }
        
        
        System.out.println("Choese the number for the operation you would like:\n"
                + "1. Sum \n"
                + "2. Difference \n"
                + "3. Multiply \n"
                + "4. Division");
                inputLine = scan.next();
        while (true) {
            if (Pattern.matches ("\\d+", inputLine)){
                operation = Integer.parseInt(inputLine);
                if ((operation > 0)&&(operation < 5)){
                break;
                }
            } else { 
                
            }
            System.out.println(inputLine + " not a valid choise please select again:\n"
                + "1. Sum \n"
                + "2. Difference \n"
                + "3. Multiply \n"
                + "4. Division");
               inputLine = scan.next();
        }
        
        if (operation == 1) {
            result = firstOperator + secondOperator;
            }
        if (operation == 2) {
            result = firstOperator - secondOperator;
            }
        if (operation == 3) {
            result = firstOperator * secondOperator;
            }
        if (operation == 4) {
            result = firstOperator / secondOperator;
            }
        
        System.out.println("The result is " + result);
    }
    
}
