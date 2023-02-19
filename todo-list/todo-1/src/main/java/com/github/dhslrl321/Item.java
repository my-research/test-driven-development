package com.github.dhslrl321;

import org.valid4j.Validation;

import static com.github.dhslrl321.State.*;
import static org.valid4j.Validation.validate;

public class Item {
    private final ItemId id;
    private final Title title;
    private State state;

    public Item(ItemId id, Title title) {
        this.id = id;
        this.title = title;
        this.state = TODO;
    }

    public void to(State state) {
        validate(!this.state.equals(state), IllegalArgumentException.class);

        this.state = state;
    }

    public State state() {
        return state;
    }

    public ItemId getId() {
        return this.id;
    }
}
