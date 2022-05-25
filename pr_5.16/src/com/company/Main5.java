package com.company;

import java.util.Scanner;

public class Main5 {
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
            int b = sc.nextInt();
            if (b == s2) {
                System.out.println("Ви вгадали другу цифру");
                int c = sc.nextInt();
                if (c == s3) {
                    System.out.println("Ви виграли ");
                }
            }
        } else {
            System.out.println("Ви не вгадали і у вас залишається " + j-- + "спроб");
            System.out.println("Попробуйте ще раз");
            if (a == s1) {
                System.out.println("Ви вгадали першу цифру");
                int b = sc.nextInt();
                if (b == s2) {
                    System.out.println("Ви вгадали другу цифру");
                }else {
                    System.out.println("Ви не вгадали і у вас залишається " + j-- + "спроб");
                    if
                }

            }else{
                System.out.println("Ви програли");

            }
        }
    }
}