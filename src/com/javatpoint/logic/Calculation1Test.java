package com.javatpoint.logic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class Calculation1Test {


    @BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
    }  
    @Before  
    public void setUp() throws Exception {  
        System.out.println("before");  
    }  
  
    @Test  
    public void testFindMax(){  
        System.out.println("test case find max");  
        assertEquals(4,Calculation1.findMax(new int[]{1,3,4,2}));  
        assertEquals(-2,Calculation1.findMax(new int[]{-12,-3,-4,-2}));  
    }  
    @Test  
    public void testCube(){  
        System.out.println("test case cube");  
        assertEquals(27,Calculation1.cube(3));  
    }  

	/*
	 * @Test public void testReverseWord(){
	 * System.out.println("test case reverse word");
	 * assertEquals("ym eman si nahk",Calculation1.reverseWord("my name is khan"); }
	 */
    @After  
    public void tearDown() throws Exception {  
        System.out.println("after");  
    }  
  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  
}
