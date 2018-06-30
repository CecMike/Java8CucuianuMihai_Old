/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siit.calculatorV2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MiIke Window
 */
public class ProcessorTest {
    
    public ProcessorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of dataTransfer method, of class Processor.
     */
    @Test
    public void testDataTransfer() {
        System.out.println("dataTransfer");
        String info = "";
        Processor instance = new Processor();
        String expResult = "";
        String result = instance.dataTransfer(info);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of myAction method, of class Processor.
     */
    @Test
    public void testMyAction() {
        System.out.println("myAction");
        Processor instance = new Processor();
        boolean expResult = false;
        boolean result = instance.myAction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isDouble method, of class Processor.
     */
    @Test
    public void testIsDouble() {
        System.out.println("isDouble");
        String str = "";
        Processor instance = new Processor();
        instance.isDouble(str);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateResult method, of class Processor.
     */
    @Test
    public void testCalculateResult() {
        System.out.println("calculateResult");
        String firstOperator = "";
        String secondOperator = "";
        String operation = "";
        Processor instance = new Processor();
        String expResult = "";
        String result = instance.calculateResult(firstOperator, secondOperator, operation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
