package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
    }

    static String getSeason(int monthNumber) {
        if (monthNumber == 12 || monthNumber <= 2) return  "зима";
        if (monthNumber <= 5) return  "весна";
        if (monthNumber <= 8) return  "лето";
        if (monthNumber <= 11) return  "осень";
        throw new IllegalArgumentException("Ivalid monthNumber argument");
    }
}