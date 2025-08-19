package com.tnsif.Assignment3;

public abstract class Item {
    int id;
    String title;

    public Item(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public abstract void display();

    @Override
    public abstract String toString();
}
