package com.github.dhslrl321;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ItemList {

    private final List<Item> items = new ArrayList<>();

    public int size() {
        return items.size();
    }

    public void add(Item item) {
        items.add(item);
    }

    public int countOf(State state) {
        return (int) items.stream()
                .filter(it -> state.equals(it.state()))
                .count();
    }

    public void remove(ItemId id) {
        items.removeIf(it -> it.getId().equals(id));
    }

    public Item getBy(ItemId id) {
        return items.stream()
                .filter(it -> id.equals(it.getId()))
                .findAny()
                .orElseThrow(NoSuchElementException::new);
    }
}
