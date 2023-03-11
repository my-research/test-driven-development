package com.github.dhslrl321;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class TodoListTest {

    TodoList sut;

    Item item = mock(Item.class);

    @BeforeEach
    void setUp() {
        sut = new TodoList();
    }

    @Test
    void name() {
        sut.add(item);

        assertThat(sut.size()).isEqualTo(1);
    }

    @Test
    void name2() {
        sut.add(item);
        sut.add(item);

        assertThat(sut.size()).isEqualTo(2);
    }
}