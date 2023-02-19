package com.github.dhslrl321;

import static com.github.dhslrl321.State.TODO;
import static org.valid4j.Validation.validate;

public class Item {

    private long id;
    private State state;

    public Item(long l) {
        id = l;
        state = TODO;
    }

    public State state() {
        return state;
    }

    public void transitionTo(State state) {
        validate(!this.state.equals(state), IllegalArgumentException.class);

        this.state = state;
    }
}
