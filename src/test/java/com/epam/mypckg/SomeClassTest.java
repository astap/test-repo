package com.epam.mypckg;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SomeClassTest {
    private SomeClass someClass;

    @Before
    public void setUp() throws Exception {
        someClass = new SomeClass();
    }

    @Test
    public void testFalseMethod() throws Exception {
        Assert.assertFalse(!someClass.getFalse());
    }

    @Test
    public void testTrueMethod() throws Exception {
        Assert.assertTrue(!someClass.getFalse());
    }
}
