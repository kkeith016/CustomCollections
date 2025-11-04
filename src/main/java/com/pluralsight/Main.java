package com.pluralsight;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Test FixedList with integers
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); // This should fail (maxSize exceeded)

        System.out.println("Number of integers: " + numbers.getItems().size());
        System.out.println("Items: " + numbers.getItems());

        // Test FixedList with LocalDate
        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now().plusDays(1));
        dates.add(LocalDate.now().plusDays(2)); // This should fail (maxSize exceeded)

        System.out.println("Number of dates: " + dates.getItems().size());
        System.out.println("Items: " + dates.getItems());

    }
}