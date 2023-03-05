package com.github.dhslrl321;

import lombok.Getter;

import static com.github.dhslrl321.State.TODO;
import static org.valid4j.Validation.validate;

public class Item {

    @Getter
    private long id;
    private State state;
    @Getter
    private Title title;

    public Item(long l) {
        id = l;
        state = TODO;
    }

    Item(Title title, State state) {
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
