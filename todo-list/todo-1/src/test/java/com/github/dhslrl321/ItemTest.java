package com.github.dhslrl321;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.github.dhslrl321.State.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ItemTest {

    Item sut;

    @BeforeEach
    @DisplayName("초기의 상태는 TODO 이다")
    void setUp() {
        sut = new Item(ItemId.idOf(1L), Title.titleOf("밥 먹기"));

        assertThat(sut.state()).isEqualTo(TODO);
    }

    @Test
    @DisplayName("상태를 옮길 수 있다")
    void name() {
        sut.to(IN_PROGRESS);
        assertThat(sut.state()).isEqualTo(IN_PROGRESS);

        sut.to(DONE);
        assertThat(sut.state()).isEqualTo(DONE);
    }

    @Test
    @DisplayName("동일한 상태로 전이는 불가능하다")
    void name6() {
        sut.to(IN_PROGRESS);
        assertThat(sut.state()).isEqualTo(IN_PROGRESS);

        assertThatThrownBy(() -> sut.to(IN_PROGRESS)).isInstanceOf(IllegalArgumentException.class);
    }
}