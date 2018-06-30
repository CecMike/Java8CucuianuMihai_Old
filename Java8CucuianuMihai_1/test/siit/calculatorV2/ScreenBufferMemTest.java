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
public class ScreenBufferMemTest {
    
    public ScreenBufferMemTest() {
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
     * Test of defaultBuffer method, of class ScreenBufferMem.
     */
    @Test
    public void testDefaultBuffer() {
        System.out.println("defaultBuffer");
        ScreenBufferMem instance = new ScreenBufferMem();
        instance.defaultBuffer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMyBuffer method, of class ScreenBufferMem.
     */
    @Test
    public void testSetMyBuffer() {
        System.out.println("setMyBuffer");
        String inputData = "";
        ScreenBufferMem instance = new ScreenBufferMem();
        instance.setMyBuffer(inputData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMyBuffer method, of class ScreenBufferMem.
     */
    @Test
    public void testGetMyBuffer() {
        System.out.println("getMyBuffer");
        ScreenBufferMem instance = new ScreenBufferMem();
        String expResult = "";
        String result = instance.getMyBuffer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
