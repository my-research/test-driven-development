package com.github.dhslrl321;

public class Main {
    public static void main(String[] args) {
        TodoListView view = new TodoListView();
        TodoListObserver observer = new TodoListObserver(view);
        TodoList list = new TodoList(observer);
        TodoItemFactory factory = new TodoItemFactory();

        Item item1 = factory.todo(Title.of("밥 먹기"));
        list.add(item1);
        Item item2 = factory.todo(Title.of("라면 끓이기"));
        list.add(item2);
        item1.transitionTo(State.DONE);
        view.show();
    }
}
