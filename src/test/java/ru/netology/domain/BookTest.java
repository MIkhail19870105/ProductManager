package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book(5, "Ананасная вода для прекрасной дамы", 265, "Виктор Пелевин");


    @Test
    void shouldMatchByName() {
        String text = "Ананасная вода для прекрасной дамы";
        book.matches(text);
        assertTrue(book.matches(text));
    }

    @Test
    void shouldMatchByAuthor() {
        String text = "Виктор Пелевин";
        book.matches(text);
        assertTrue(book.matches(text));
    }

    @Test
    void shouldNotMatchByIncorrectName() {
        String text = "Мертвые души";
        book.matches(text);
        assertFalse(book.matches(text));
    }

    @Test
    void shouldNotMatchByIncorrectAuthor() {
        String text = "Николай Васильевич Гоголь";
        book.matches(text);
        assertFalse(book.matches(text));
    }


}