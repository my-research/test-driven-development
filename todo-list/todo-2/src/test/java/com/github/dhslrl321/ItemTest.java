package com.github.dhslrl321;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.github.dhslrl321.State.IN_PROGRESS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ItemTest {

    Item sut;

    @BeforeEach
    void setUp() {
        sut = Item.newInstance(ItemId.of(1L), Title.of("A"));

        assertThat(sut.state()).isEqualTo(State.TODO);
    }

    @Test
    @DisplayName("item 의 상태 전이가 가능하다")
    void possible_transition() {
        sut.transitionTo(IN_PROGRESS);
        assertThat(sut.state()).isEqualTo(IN_PROGRESS);

        sut.transitionTo(State.DONE);
        assertThat(sut.state()).isEqualTo(State.DONE);
    }

    @Test
    @DisplayName("동일한 state 로 상태 전이는 불가능하다")
    void impossible() {
        sut.transitionTo(IN_PROGRESS);

        assertThatThrownBy(() -> sut.transitionTo(IN_PROGRESS))
                .isInstanceOf(IllegalArgumentException.class);
    }
}