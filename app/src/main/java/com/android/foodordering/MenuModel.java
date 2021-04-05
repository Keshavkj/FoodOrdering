
package com.android.foodordering;

public class MenuModel {
    private int image;
    private String  foodType;


    public MenuModel(int image, String foodType)
    {
        this.image = image;
        this.foodType = foodType;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
}
