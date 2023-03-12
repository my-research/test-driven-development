package com.github.dhslrl321;

import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
public class TodoListView {

    // TODO view model 로 변경
    List<Item> items = new ArrayList<>();

    public void show() {
        items.forEach(it -> {
            String message = String.format("[TODO(%d)]: %s 가 현재 %s 상태",
                    it.getId().getValue(),
                    it.getTitle().getValue(),
                    it.getState().name());

            System.out.println(message);
        });
    }

    public void add(Item item) {
        items.add(item);
    }

    public int size() {
        return items.size();
    }
}
