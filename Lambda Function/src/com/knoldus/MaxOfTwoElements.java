package com.knoldus;

import java.util.Scanner;
import java.util.stream.Stream;

public class MaxOfTwoElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any 2 nos: ");
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        Integer maximum = Stream.of(input1, input2)
                .max(Integer::compareTo)
                .get();

        System.out.println("Max number: " + maximum);
    }
}
