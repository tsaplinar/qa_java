package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    @Mock
    Feline feline;
    private final String methodParam;
    private final boolean expectedResult;

    public LionParameterizedTest(String methodParam, boolean expectedResult) throws Exception {
        this.methodParam = methodParam;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][]{
                {"Самец",true},
                {"Самка",false},
        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(methodParam,feline);
        boolean actualResult = lion.hasMane;
        assertEquals(expectedResult,actualResult);
    }
}