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
    public void testSomeMethod() throws Exception {
         Assert.assertFalse(!someClass.someMethod());
    }
}
