package com.example;

/**
 * Created by jason on 1/7/16.
 */

enum itemType { POTION, RING, ARMOR }

public class InventoryItem {

    private itemType type;
    private String name;

    public InventoryItem(itemType type, String name) {
        this.type = type;
        this.name = name;
    }

    public itemType getType() {
        return type;
    }

    public void setType(itemType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
