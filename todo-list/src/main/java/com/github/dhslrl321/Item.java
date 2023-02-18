package com.github.dhslrl321;

import static com.github.dhslrl321.States.*;

public class Item {
    private final ItemId id;
    private final Title title;
    private States state;

    public Item(ItemId id, Title title) {
        this.id = id;
        this.title = title;
        this.state = TODO;
    }

    public States state() {
        return state;
    }

    public void plan() {
        this.state = PLAN;
    }

    public void todo() {
        this.state = TODO;
    }

    public void inProgress() {
        this.state = IN_PROGRESS;
    }

    public void done() {
        this.state = DONE;
    }

    public ItemId getId() {
        return this.id;
    }
}
