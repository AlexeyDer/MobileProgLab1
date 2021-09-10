package com.example.mobileproglab1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Класс для тестирования MainActivity
 *
 * @author Деревцов Алексей
 * @version 1.0
 */
public class MainActivityTest {

    /**
     * Тест метода min, проверяющий правильность нахождения минималного значения
     */
    @Test
    public void minTestReturnZero() {
        assertEquals(MainActivity.min(0, 1), 0);
    }

    /**
     * Тест метода min, возвращающий неправильное значение
     */
    @Test
    public void minTestReturnNotEquals() {
        assertNotEquals(MainActivity.min(0, 1), 1);
    }

    /**
     * Тест метода min, возвращающий правильное значение вводе одинаковых чисел
     */
    @Test
    public void minTestWithEqualsValues() {
        assertEquals(MainActivity.min(1, 1), 1);
    }

    /**
     * Тест метода min с отрицательными значениями
     */
    @Test
    public void minTestwithNegativeNumbers() {
        assertEquals(MainActivity.min(-123, 123), -123);
    }

    /**
     * Тест метода max, проверяющий правильность нахождения максимального значения
     */
    @Test
    public void maxTestReturnZero() {
        assertEquals(MainActivity.max(0, 1), 1);
    }

    /**
     * Тест метода max, возвращающий неправильное значение
     */
    @Test
    public void maxTestReturnNotEquals() {
        assertNotEquals(MainActivity.max(0, 1), 0);
    }

    /**
     * Тест метода max, возвращающий правильное значение вводе одинаковых чисел
     */
    @Test
    public void maxTestWithEqualsValues() {
        assertEquals(MainActivity.max(1, 1), 1);
    }

    /**
     * Тест метода max с отрицательными значениями
     */
    @Test
    public void maxTestwithNegativeNumbers() {
        assertEquals(MainActivity.max(-123, 123), 123);
    }
}
