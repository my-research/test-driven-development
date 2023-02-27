package com.github.dhslrl321;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TodoListTest {

    /**
     * todo item 들을 관리하는 책임
     *  - 추가 x
     *  - 삭제
     *  - aggregation
     */
    TodoList sut;

    @Test
    void name() {
        sut = new TodoList();

        sut.add(new Item(1L));

        assertThat(sut.size()).isEqualTo(1);
    }

    @Test
    void name2() {
        sut = new TodoList();

        sut.add(new Item(1L));
        sut.add(new Item(2L));

        assertThat(sut.size()).isEqualTo(2);
    }

    @Test
    void name3() {
        sut = new TodoList();
        sut.add(new Item(1L));
        sut.add(new Item(2L));

        assertThat(sut.size()).isEqualTo(2);
    }
}