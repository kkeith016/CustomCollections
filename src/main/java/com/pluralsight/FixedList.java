package com.pluralsight;

import java.util.ArrayList;
import java.util.List;


public class FixedList<T> {

    private final int maxSize;
    private final List<T> items;


    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        if (items.size() >= maxSize) {
            System.out.println("Error: Cannot add more than " + maxSize + " items.");
        } else {
            items.add(item);
        }
    }

    public List<T> getItems() {
        return items;
    }
}
