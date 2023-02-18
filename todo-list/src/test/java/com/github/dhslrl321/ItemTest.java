package com.github.dhslrl321;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.github.dhslrl321.States.*;
import static org.assertj.core.api.Assertions.assertThat;

class ItemTest {

    Item sut;

    @BeforeEach
    void setUp() {
        sut = new Item(ItemId.idOf(1L), Title.titleOf("밥 먹기"));
    }

    @Test
    void name() {
        States actual = sut.state();

        assertThat(actual).isEqualTo(TODO);
    }

    @Test
    void name2() {
        sut.plan();

        assertThat(sut.state()).isEqualTo(PLAN);
    }

    @Test
    void name3() {
        sut.plan();
        sut.todo();

        assertThat(sut.state()).isEqualTo(TODO);
    }

    @Test
    void name4() {
        sut.inProgress();

        assertThat(sut.state()).isEqualTo(IN_PROGRESS);
    }

    @Test
    void name5() {
        sut.done();

        assertThat(sut.state()).isEqualTo(DONE);
    }
}