package com.github.dhslrl321;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static com.github.dhslrl321.ItemId.idOf;
import static com.github.dhslrl321.Title.titleOf;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class Command_ItemListTest {

    public static final Item ITEM_1 = new Item(idOf(1L), titleOf("밥 먹기"));
    public static final Item ITEM_2 = new Item(idOf(2L), titleOf("밥 먹기"));
    public static final ItemId ID_1 = idOf(1L);

    ItemList sut;

    @BeforeEach
    void setUp() {
        sut = new ItemList();
    }

    @Test
    @DisplayName("총 todo list 에 아이템을 추가할 수 있다")
    void name() {
        assertThat(sut.size()).isEqualTo(0);

        sut.add(ITEM_1);
        assertThat(sut.size()).isEqualTo(1);

        sut.add(ITEM_2);
        assertThat(sut.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("id 로 삭제할 수 있다")
    void name3() {
        sut.add(ITEM_1);
        sut.add(ITEM_2);

        assertThat(sut.size()).isEqualTo(2);

        sut.remove(ID_1);

        assertThat(sut.size()).isEqualTo(1);
        assertThatThrownBy(() -> sut.getBy(ID_1))
                .isInstanceOf(NoSuchElementException.class);
    }
}