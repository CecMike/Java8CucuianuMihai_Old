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
public class OnButtonTest {
    
    public OnButtonTest() {
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
     * Test of powerComand method, of class OnButton.
     */
    @Test
    public void testPowerComand() {
        System.out.println("powerComand");
        boolean power = false;
        OnButton instance = null;
        instance.powerComand(power);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPower method, of class OnButton.
     */
    @Test
    public void testIsPower() {
        System.out.println("isPower");
        OnButton instance = null;
        boolean expResult = false;
        boolean result = instance.isPower();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPower method, of class OnButton.
     */
    @Test
    public void testSetPower() {
        System.out.println("setPower");
        boolean state = false;
        OnButton instance = null;
        instance.setPower(state);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
