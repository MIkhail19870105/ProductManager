package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    Smartphone smartphone = new Smartphone(4, "Iphone SE 2020", 49990, "Apple");

    @Test
    void shouldMatchByName() {
        String text = "Iphone SE 2020";
        smartphone.matches(text);
        assertTrue(smartphone.matches(text));
    }

    @Test
    void shouldMatchByBrand() {
        String text = "Apple";
        smartphone.matches(text);
        assertTrue(smartphone.matches(text));
    }

    @Test
    void shouldNotMatchByIncorrectName() {
        String text = "HTC One M8";
        smartphone.matches(text);
        assertFalse(smartphone.matches(text));
    }

    @Test
    void shouldNotMatchByIncorrectBrand() {
        String text = "HTC";
        smartphone.matches(text);
        assertFalse(smartphone.matches(text));
    }


}