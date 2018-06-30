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
public class MemoryTest {
    
    public MemoryTest() {
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
     * Test of getMyData method, of class Memory.
     */
    @Test
    public void testGetMyData() {
        System.out.println("getMyData");
        Memory instance = new Memory();
        String expResult = "253";
        String result = instance.getMyData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setMyData method, of class Memory.
     */
    @Test
    public void testSetMyData() {
        System.out.println("setMyData");
        String myData = "";
        Memory instance = new Memory();
        instance.setMyData(myData);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
