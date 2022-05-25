package com.company;
import  java.util.random.RandomGenerator;



public class Main3 {
    public static void main(String[] args) {
        int a =(int)(Math.random() * 101);
        String sr1 = new String();
        sr1 = String.valueOf(a);
        System.out.println(a);

        System.out.println(sr1.length());
    }
}