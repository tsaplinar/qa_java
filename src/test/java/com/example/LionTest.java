package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;


    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        int expectedResult = 1;
        Mockito.when(lion.getKittens()).thenReturn(1);
        int actualResult = lion.getKittens();
        assertEquals(expectedResult,actualResult);
    }

    @Test(expected = Exception.class)
    public void lionCreationThrowsException() throws Exception {
        Lion lion = new Lion("kek",feline);
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedResult);
        List<String> actualResult = lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
        assertEquals(expectedResult,actualResult);
    }
}