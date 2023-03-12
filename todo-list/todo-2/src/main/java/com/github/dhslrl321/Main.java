package com.github.dhslrl321;

public class Main {
    public static void main(String[] args) {
        TodoListView view = new TodoListView();
        TodoListObserver observer = new TodoListObserver(view);
        TodoList list = new TodoList(observer);
        TodoItemFactory factory = new TodoItemFactory();

        list.add(factory.todo(Title.of("밥 먹기")));
        list.add(factory.todo(Title.of("라면 끓이기")));

        view.show();
    }
}
