package com.katalon.testops;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class CalculatorAssertFailedTestNGTest {

    private Calculator calculator;

    @BeforeSuite
    public void beforeThisSuite() {
        System.out.println("BEFORE SUITE");
    }

    @BeforeTest
    public void beforeThisTest() {
        System.out.println("BEFORE TEST");
    }

    @BeforeClass
    public void beforeThisClass() {
        System.out.println("BEFORE CLASS");
    }

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddAssertFailed() {
        assertEquals(300, calculator.add(365, 12));
        assertEquals(300, calculator.add(12, 365));
    }

    @Test
    public void testSubtractAssertFailed() {
        assertEquals(300, calculator.subtract(365, 12));
        assertEquals(300, calculator.subtract(12, 365));
    }

    @Test
    public void testMultiplyAssertFailed() {
        assertEquals(300, calculator.multiply(365, 12));
        assertEquals(300, calculator.multiply(12, 365));
    }

    @Test
    public void testDivideAssertFailed() {
        assertEquals(300, calculator.divide(365, 10), 0);
    }

    @Test
    @Parameters({"a", "b", "result"})
    public void testAddParamAssertFailed(@Optional("321") int a, @Optional("123") int b, @Optional("300") int result) {
        assertEquals(result, calculator.add(a, b));
    }
}
