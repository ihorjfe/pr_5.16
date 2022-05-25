package com.company;
import java.util.Random;
import  java.util.random.RandomGenerator;
import  java.util.random.RandomGeneratorFactory;
import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        int s1 = (int) (Math.random() * 3 + 1);
        int s2 = (int) (Math.random() * 3 + 1);
        int s3 = (int) (Math.random() * 3 + 1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        int j = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть першу цифру :");
        int a = sc.nextInt();
        if (a == s1) {
            System.out.println("Ви вгадали першу цифру");
        } else {
            System.out.println("Ви не вгадали і у вас залишається " + j-- + "спроб");
        }
        System.out.println("Введіть другу цифру :");
        int b = sc.nextInt();
        if (b == s2) {
            System.out.println("Ви вгадали другу цифру");
        } else {
            System.out.println("Ви не вгадали і у вас залишається " + j-- + "спроб");
        }
        if (j == 0) {
            System.out.println("У вас закінчились спроби");
        } else {
            System.out.println("Введіть третю цифру :");
        }
        int c = sc.nextInt();
        if (c == s3) {
            System.out.println("Ви виграли ");
        } else {
            System.out.println("Ви не вгадали і у вас залишається " + j-- + "спроб");
        }

    }
}
