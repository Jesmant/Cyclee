package ru.netology.sqr;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SQRServiceTest {

    @Test
    void shouldNumberOfSquares() {
        SQRService sqrService = new SQRService();
        int expected = 6;
        int loweLimit = 200;
        int upperLimit = 400;
        int actual = sqrService.sqr(loweLimit, upperLimit);
        assertEquals(expected, actual);
    }
    @Test
    void shouldNumberOfSquaresMin() {
        SQRService sqrService = new SQRService();
        int expected = 0;
        int loweLimit = 50;
        int upperLimit = 90;
        int actual = sqrService.sqr(loweLimit, upperLimit);
        assertEquals(expected, actual);
    }
    @Test
    void shouldNumberOfSquaresMax() {
        SQRService sqrService = new SQRService();
        int expected = 90;
        int loweLimit = 10;
        int upperLimit = 9000000;
        int actual = sqrService.sqr(loweLimit, upperLimit);
        assertEquals(expected, actual);
    }
}