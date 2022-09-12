package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;
    private Cat cat;

    @Before
    public void setUp (){
        this.cat = new Cat(feline);
    }
    @Test
    public void getSoundShouldBeMaw() {
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void getFoodShouldUseEatMeat() throws Exception {
        List<String> expectedResult = List.of("meat");
        Mockito.when(feline.eatMeat()).thenReturn(expectedResult);
        List<String> actualResult = cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
        assertEquals(expectedResult,actualResult);
    }
}