package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    private ProductManager manager = new ProductManager();

    Product product1 = new Book(1, "Empire V", 750, "Виктор Пелевин");
    Product product2 = new Book(2, "S.N.U.F.F", 520, "Виктор Пелевин");
    Product product3 = new Book(3, "Чапаев и Пустота", 1500, "Виктор Пелевин");
    Product product4 = new Book(4, "Бэтман Аполло", 700, "Виктор Пелевин");
    Product product5 = new Book(5, "Ананасная вода для прекрасной дамы", 265, "Виктор Пелевин");
    Product product11 = new Book(6, "Generation P", 750, "Виктор Пелевин");

    Product product6 = new Smartphone(1, "Redmi 5Plus", 12990, "Redmi");
    Product product7 = new Smartphone(2, "Xiaomi Mi8T", 16990, "Xiaomi");
    Product product8 = new Smartphone(3, "Lenovo K9", 8990, "Lenovo");
    Product product9 = new Smartphone(4, "Iphone SE 2020", 49990, "Apple");
    Product product10 = new Smartphone(5, "Gnusmas Galaxy Fold", 224990, "Samsung");

    @BeforeEach
    void setup(){
        manager.addProduct(product1);
        manager.addProduct(product2);
        manager.addProduct(product3);
        manager.addProduct(product4);
        manager.addProduct(product5);
        manager.addProduct(product6);
        manager.addProduct(product7);
        manager.addProduct(product8);
        manager.addProduct(product9);
        manager.addProduct(product10);
        manager.addProduct(product11);
    }

    @Test

    void searchByBrand(){
        Product[]actual = manager.searchBy("Lenovo");
        Product[]expected = {new Smartphone(3,"Lenovo K9", 8990,"Lenovo")};
        assertArrayEquals(expected,actual);
    }

    @Test
    void searchBySmartphoneName(){
        Product[]actual = manager.searchBy("Redmi 5Plus");
        Product[]expected = {new Smartphone(1, "Redmi 5Plus", 12990,"Redmi")};
        assertArrayEquals(expected,actual);
    }

    @Test
    void searchByBookName(){
        Product[]actual = manager.searchBy("Чапаев и Пустота");
        Product[]excepted = {new Book(3, "Чапаев и Пустота", 1500, "Виктор Пелевин")};
        assertArrayEquals(excepted, actual);
    }

    @Test
    void searchByAuthor(){
        Product[]actual =manager.searchBy("Виктор Пелевин");
        Product[]expected = {
                new Book(1, "Empire V", 750, "Виктор Пелевин"),
                new Book(2, "S.N.U.F.F", 520, "Виктор Пелевин"),
                new Book(3, "Чапаев и Пустота", 1500, "Виктор Пелевин"),
                new Book(4, "Бэтман Аполло", 700, "Виктор Пелевин"),
                new Book(5, "Ананасная вода для прекрасной дамы", 265, "Виктор Пелевин"),
                new Book(6, "Generation P", 750, "Виктор Пелевин")};
        assertArrayEquals(expected,actual);
    }

    @Test
    void searchByIncorrectBrand(){
        Product[]actual = manager.searchBy("Самсунг");
        Product[]expected = {};
        assertArrayEquals(expected,actual);
    }

    @Test
    void searchByIncorrectAuthor(){
        Product[]actual = manager.searchBy("Виктор Сорокин");
        Product[]expected = {};
        assertArrayEquals(expected,actual);
    }



}