package com.example;

import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    Feline feline;


    @Before
    public void setUp() {
        this.feline = new Feline();
    }

    @Test
    public void eatMeatShouldReturnPredatorFood() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertTrue(expectedResult.equals(actualResult));
    }

    @Test
    public void getFamilyShouldReturnFeline() {
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensShouldBeOne() {
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals(expectedResult, actualResult);
    }
}