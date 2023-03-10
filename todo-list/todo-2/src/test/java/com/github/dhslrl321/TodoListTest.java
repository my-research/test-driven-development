package com.github.dhslrl321;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class TodoListTest {

    TodoList sut;

    Item item = mock(Item.class);

    @Test
    void name() {
        sut = new TodoList();

        sut.add(item);

        assertThat(sut.size()).isEqualTo(1);
    }

    @Test
    void name2() {
        sut = new TodoList();

        sut.add(item);
        sut.add(item);

        assertThat(sut.size()).isEqualTo(2);
    }
}