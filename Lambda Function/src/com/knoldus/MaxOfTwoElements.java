package com.knoldus;

import java.util.Scanner;
import java.util.stream.Stream;

public class MaxOfTwoElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any 2 nos: ");
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        System.out.println("Max number: " + getMaxOfTwoElements(input1,input2));
    }

    static Integer getMaxOfTwoElements(Integer i1, Integer i2) {
        Integer maximum = Stream.of(i1, i2)
                .max(Integer::compareTo)
                .get();
        return maximum;
    }
}
