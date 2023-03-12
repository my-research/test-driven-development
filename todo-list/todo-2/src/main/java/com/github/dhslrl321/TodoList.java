package com.github.dhslrl321;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private final List<Item> items = new ArrayList<>();
    private final TodoListObserver observer;

    public TodoList(TodoListObserver observer) {
        this.observer = observer;
    }

    public void add(Item item) {
        items.add(item);
        observer.publish(item);
    }

    public int size() {
        return items.size();
    }
}
