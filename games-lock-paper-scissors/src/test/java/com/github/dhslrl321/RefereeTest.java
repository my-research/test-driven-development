package com.github.dhslrl321;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.github.dhslrl321.Hands.*;
import static com.github.dhslrl321.Result.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RefereeTest {

    Referee sut = new Referee();

    @Test
    @DisplayName("주먹을 내면?")
    void tc1() {
        assertThat(sut.judge(ROCK, SCISSORS)).isEqualTo(WIN);
        assertThat(sut.judge(ROCK, PAPER)).isEqualTo(LOOSE);
        assertThat(sut.judge(ROCK, ROCK)).isEqualTo(DRAW);
    }

    @Test
    @DisplayName("가위를 내면?")
    void tc2() {
        assertThat(sut.judge(SCISSORS, ROCK)).isEqualTo(LOOSE);
        assertThat(sut.judge(SCISSORS, PAPER)).isEqualTo(WIN);
        assertThat(sut.judge(SCISSORS, SCISSORS)).isEqualTo(DRAW);
    }

    @Test
    @DisplayName("보자기를 내면?")
    void tc3() {
        assertThat(sut.judge(PAPER, ROCK)).isEqualTo(WIN);
        assertThat(sut.judge(PAPER, SCISSORS)).isEqualTo(LOOSE);
        assertThat(sut.judge(PAPER, PAPER)).isEqualTo(DRAW);
    }

    @Test
    @DisplayName("만약 안내면? 혹은 이상한걸 내면?")
    void tc4() {
        assertThatThrownBy(() -> sut.judge(null, null))
                .isInstanceOf(IllegalArgumentException.class);
    }
}