package com.rishabh.junitfundamentals;

import org.junit.*;
import static org.junit.Assert.*;



public class BeforeAfterClasses {

    @BeforeClass //in eclipse BeforeClass
    public static void beforeAll(){
        System.out.println("Before all");
    }

    @Before  // in eclipse Before
    public void beforeEach(){
        System.out.println("Before each");
    }

    @Test
    public void one(){
        assertTrue(true);

        System.out.println("one");

    }
    @Test
    public void two(){
        assertTrue(true);

        System.out.println("two");
    }

    @Test
    public void three(){
        assertTrue(true);

        System.out.println("three");
    }

    @AfterClass
    public static void afterAll(){
        System.out.println("After all");
    }

    @After
    public void afterEach(){
        System.out.println("After Each");
    }

}
