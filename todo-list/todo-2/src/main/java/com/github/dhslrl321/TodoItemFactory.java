package com.github.dhslrl321;

import org.valid4j.Validation;

import static java.util.Objects.nonNull;
import static org.valid4j.Validation.validate;

public class TodoItemFactory {
    public Item todo(Title title) {
        validate(nonNull(title), IllegalArgumentException.class);
        validate(!title.getValue().isBlank(), IllegalArgumentException.class);

        return new Item(title, State.TODO);
    }
}
