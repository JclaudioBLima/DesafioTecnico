package com.exemplo.springboot.util;

public class FibonacciUtil {

    public static boolean pertenceFibonacci(int numero) {
        if (numero <= 1) {
            return true;
        }
        int a = 0;
        int b = 1;
        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == numero;
    }
}