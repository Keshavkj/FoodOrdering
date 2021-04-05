package com.android.foodordering;

public class ItemModel {

    private int itemImage;
    private String itemName;
    private String itemType;

    public ItemModel(int itemImage, String itemName, String itemType)
    {
        this.itemImage = itemImage;
        this.itemName = itemName;
        this.itemType = itemType;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
}
