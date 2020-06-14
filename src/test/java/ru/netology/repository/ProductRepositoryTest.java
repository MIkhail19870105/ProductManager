package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    private ProductRepository repository = new ProductRepository();

    Product product1 = new Book(1, "Empire V", 750, "Виктор Пелевин");
    Product product2 = new Book(2, "S.N.U.F.F", 520, "Виктор Пелевин");
    Product product3 = new Book(3, "Чапаев и Пустота", 1500, "Виктор Пелевин");
    Product product4 = new Book(4, "Бэтман Аполло", 700, "Виктор Пелевин");
    Product product5 = new Book(5, "Ананасная вода для прекрасной дамы", 265, "Виктор Пелевин");
    Product product6 = new Smartphone(6, "Redmi 5Plus", 12990, "Redmi");
    Product product7 = new Smartphone(7, "Xiaomi Mi8T", 16990, "Xiaomi");
    Product product8 = new Smartphone(8, "Lenovo K9", 8990, "Lenovo");
    Product product9 = new Smartphone(9, "Iphone SE 2020", 49990, "Apple");
    Product product10 = new Smartphone(10, "Gnusmas Galaxy Fold", 224990, "Samsung");
    Product product11 = new Book(11, "Generation P", 750, "Виктор Пелевин");


    @BeforeEach
    void setup(){
        repository.save(product1);
        repository.save(product2);
        repository.save(product3);
        repository.save(product4);
        repository.save(product5);
        repository.save(product6);
        repository.save(product7);
        repository.save(product8);
        repository.save(product9);
        repository.save(product10);
        repository.save(product11);
    }



    @Test
    void shouldSaveNewProduct() {
        Product product12 = new Book(12, "Голубое Сало", 555, "Владимир Сорокин");
        repository.save(product12);
        Product[] actual = repository.findAll();
        Product[] expected = {
                new Book(1, "Empire V", 750, "Виктор Пелевин"),
                new Book(2, "S.N.U.F.F", 520, "Виктор Пелевин"),
                new Book(3, "Чапаев и Пустота", 1500, "Виктор Пелевин"),
                new Book(4, "Бэтман Аполло", 700, "Виктор Пелевин"),
                new Book(5, "Ананасная вода для прекрасной дамы", 265, "Виктор Пелевин"),
                new Smartphone(6, "Redmi 5Plus", 12990, "Redmi"),
                new Smartphone(7, "Xiaomi Mi8T", 16990, "Xiaomi"),
                new Smartphone(8, "Lenovo K9", 8990, "Lenovo"),
                new Smartphone(9, "Iphone SE 2020", 49990, "Apple"),
                new Smartphone(10, "Gnusmas Galaxy Fold", 224990, "Samsung"),
                new Book(11, "Generation P", 750, "Виктор Пелевин"),
                new Book(12, "Голубое Сало", 555, "Владимир Сорокин")};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAll() {
        Product[] actual = repository.findAll();
        Product[] expected = {
                new Book(1, "Empire V", 750, "Виктор Пелевин"),
                new Book(2, "S.N.U.F.F", 520, "Виктор Пелевин"),
                new Book(3, "Чапаев и Пустота", 1500, "Виктор Пелевин"),
                new Book(4, "Бэтман Аполло", 700, "Виктор Пелевин"),
                new Book(5, "Ананасная вода для прекрасной дамы", 265, "Виктор Пелевин"),
                new Smartphone(6, "Redmi 5Plus", 12990, "Redmi"),
                new Smartphone(7, "Xiaomi Mi8T", 16990, "Xiaomi"),
                new Smartphone(8, "Lenovo K9", 8990, "Lenovo"),
                new Smartphone(9, "Iphone SE 2020", 49990, "Apple"),
                new Smartphone(10, "Gnusmas Galaxy Fold", 224990, "Samsung"),
                new Book(11, "Generation P", 750, "Виктор Пелевин")};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveById(){
        repository.removeById(2);
        Product[]actual = repository.findAll();
        Product[]expected = {
                new Book(1, "Empire V", 750, "Виктор Пелевин"),
                new Book(3, "Чапаев и Пустота", 1500, "Виктор Пелевин"),
                new Book(4, "Бэтман Аполло", 700, "Виктор Пелевин"),
                new Book(5, "Ананасная вода для прекрасной дамы", 265, "Виктор Пелевин"),
                new Smartphone(6, "Redmi 5Plus", 12990, "Redmi"),
                new Smartphone(7, "Xiaomi Mi8T", 16990, "Xiaomi"),
                new Smartphone(8, "Lenovo K9", 8990, "Lenovo"),
                new Smartphone(9, "Iphone SE 2020", 49990, "Apple"),
                new Smartphone(10, "Gnusmas Galaxy Fold", 224990, "Samsung"),
                new Book(11, "Generation P", 750, "Виктор Пелевин")};
        assertArrayEquals(expected,actual);
        }
    }
