package com.github.dhslrl321;

import java.util.ArrayList;
import java.util.List;

public class ItemList {

    private final List<Item> items = new ArrayList<>();

    public int size() {
        return items.size();
    }

    public void add(Item item) {
        items.add(item);
    }

    public int countOf(States state) {
        return (int) items.stream()
                .filter(it -> state.equals(it.state()))
                .count();
    }

    public void remove(ItemId item) {
        items.remove(0);
    }

    public Item getBy(ItemId id) {
        return items.stream()
                .filter(it -> id.equals(it.getId()))
                .findAny()
                .get();
    }
}
