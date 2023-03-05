package com.github.dhslrl321;

import lombok.Getter;

import static org.valid4j.Validation.validate;

@Getter
public class Item {

    public static Item newInstance(ItemId id, Title title) {
        return new Item(id, title, State.TODO);
    }

    private final ItemId id;
    private final Title title;
    private State state;

    private Item(ItemId id, Title title, State state) {
        this.id = id;
        this.title = title;
        this.state = state;
    }

    public State state() {
        return state;
    }

    public void transitionTo(State state) {
        validate(!this.state.equals(state), IllegalArgumentException.class);

        this.state = state;
    }
}
