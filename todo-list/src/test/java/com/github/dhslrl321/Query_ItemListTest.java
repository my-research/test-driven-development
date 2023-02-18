package com.github.dhslrl321;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static com.github.dhslrl321.ItemId.idOf;
import static com.github.dhslrl321.States.DONE;
import static com.github.dhslrl321.States.TODO;
import static com.github.dhslrl321.Title.titleOf;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class Query_ItemListTest {
    public static final Item ITEM_1 = new Item(idOf(1L), titleOf("밥 먹기"));
    public static final Item ITEM_2 = new Item(idOf(1L), titleOf("밥 먹기"));
    public static final ItemId ID_1 = idOf(1L);
    public static final ItemId ID_2 = idOf(2L);
    public static final Title ANY = titleOf("밥 먹기");
    ItemList sut;

    @BeforeEach
    void setUp() {
        sut = new ItemList();
    }

    @Test
    @DisplayName("ID 를 통해서 item 을 조회할 수 있다")
    void name4() {
        sut.add(ITEM_1);
        Item actual = sut.getBy(ID_1);

        assertThat(actual.getId()).isEqualTo(ID_1);
    }

    @Test
    @DisplayName("존재하지 않는 id 로 item 을 찾으면 예외가 발생한다")
    void name5() {
        sut.add(new Item(ID_1, ANY));

        assertThatThrownBy(() -> sut.getBy(ID_2))
                .isInstanceOf(NoSuchElementException.class);
    }

    @Test
    @DisplayName("state 별로 개수를 확인할 수 있다")
    void name2() {
        Item item = new Item(idOf(1L), titleOf("밥 먹기"));
        sut.add(item);

        assertThat(sut.size()).isEqualTo(1);
        assertThat(sut.countOf(TODO)).isEqualTo(1);
        assertThat(sut.countOf(DONE)).isEqualTo(0);

        item.done();
        assertThat(sut.countOf(TODO)).isEqualTo(0);
        assertThat(sut.countOf(DONE)).isEqualTo(1);
    }
}