package ru.netology.sqr;

public class SQRService {
    public int sqr (int loweLimit, int upperLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= loweLimit && i * i <= upperLimit) {
                counter ++;
    }
        }
        System.out.println(counter);
        return counter;
    }
}
