package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void tablica() {
        //given
        int[] oczekiwana = {1,2,3};
        int[] tab = {1,2,4};
        //when
        int[] dane = Main.sortArrayWithoutCheating(tab);
        //then
        assertArrayEquals(oczekiwana, dane);

}