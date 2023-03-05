package com.github.dhslrl321;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class TodoItemFactoryTest {

    TodoItemFactory sut = new TodoItemFactory();

    @Test
    void name() {
        Item actual = sut.todo(Title.of("밥 먹기"));

        assertThat(actual.getTitle()).isEqualTo(Title.of("밥 먹기"));
        assertThat(actual.state()).isEqualTo(State.TODO);
    }

    @Test
    void fail() {
        assertThatThrownBy(() -> sut.todo(null))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void fail_blank() {
        assertThatThrownBy(() -> sut.todo(Title.of("")))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void id() {
        Item actual = sut.todo(Title.of("A"));

        assertThat(actual.getId()).isNotNull();
    }
}