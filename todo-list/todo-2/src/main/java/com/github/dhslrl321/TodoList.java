package com.github.dhslrl321;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private final List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public int size() {
        return items.size();
    }
}
