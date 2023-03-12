package com.github.dhslrl321;

public class TodoListObserver {

    private final TodoListView view;

    public TodoListObserver(TodoListView view) {
        this.view = view;
    }

    public void publish(Item item) {
        view.add(item);
    }
}
