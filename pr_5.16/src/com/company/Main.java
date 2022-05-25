package com.company;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt();
        int randomNumber =-random.nextInt(20);
        System.out.println(randomNumber);
    }
}
