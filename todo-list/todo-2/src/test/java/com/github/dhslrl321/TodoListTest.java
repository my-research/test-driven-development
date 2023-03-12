package com.github.dhslrl321;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class TodoListTest {

    TodoList sut;

    Item item = mock(Item.class);

    TodoListView view = new TodoListView();
    TodoListObserver observer = new TodoListObserver(view);

    @BeforeEach
    void setUp() {
        sut = new TodoList(observer);
    }

    @Test
    void name() {
        sut.add(item);

        assertThat(sut.size()).isEqualTo(1);
        assertThat(view.size()).isEqualTo(1);
    }

    @Test
    void name2() {
        sut.add(item);
        sut.add(item);

        assertThat(sut.size()).isEqualTo(2);
        assertThat(view.size()).isEqualTo(2);
    }

}