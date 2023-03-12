package com.github.dhslrl321;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TodoListObserverTest {

    TodoListObserver sut;

    TodoListView view = new TodoListView();
    TodoItemFactory factory = new TodoItemFactory();

    @BeforeEach
    void setUp() {
        sut = new TodoListObserver(view);
    }

    @Test
    void name() {
        assertThat(view.size()).isEqualTo(0);

        sut.publish(factory.todo(Title.of("A")));

        assertThat(view.size()).isEqualTo(1);
    }

    @Test
    void name2() {
        Item item = factory.todo(Title.of("A"));
        sut.publish(item);
        item.transitionTo(State.DONE);

        assertThat(view.size()).isEqualTo(1);
        assertThat(view.getItems().get(0).state()).isEqualTo(State.DONE);
    }
}
