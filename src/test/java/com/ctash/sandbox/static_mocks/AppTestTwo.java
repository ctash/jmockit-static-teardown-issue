package com.ctash.sandbox.static_mocks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTestTwo {
    private App classUnderTest;

    @BeforeEach
    public void setupTest() {
        classUnderTest = new App();
    }

    @AfterEach
    public void tearDown() { }

    @Test
    public void testNonMockedStatic() {
        // due to an apparent bug w/Jmockit's auto-teardown
        // functionality - this fails if run after testStaticMocking in AppTest
        assertEquals(App.TEST_STRING, classUnderTest.getTestString(), "testString should equal default value (\"321\"");
    }
}
