package com.wonit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ItemTest {

    Item sut;

    @Test
    void can_create() {
        Item actual = Item.newItem();

        assertThat(actual).isNotNull();
    }
}