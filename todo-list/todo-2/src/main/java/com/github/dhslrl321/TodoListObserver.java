package com.github.dhslrl321;

public class TodoListObserver {

    private final TodoListView view;

    public TodoListObserver(TodoListView view) {
        this.view = view;
    }

    // 현재는 reference 를 유지하니까 괜찮다
    // model 이 바뀌면 큰일
    public void publish(Item item) {
        view.add(item);
    }
}
