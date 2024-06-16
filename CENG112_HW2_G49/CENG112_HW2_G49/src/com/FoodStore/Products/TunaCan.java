package com.FoodStore.Products;

import com.FoodStore.Date;

import java.util.Arrays;

public class TunaCan {

    private static int numberOfProduct = 0;
    private int netWeight;
    private int drainedWeight;
    private String[] ingredients;
    private Date expirationDate;

    public TunaCan(String date) {
        this.netWeight = 75;
        this.drainedWeight = 50;
        this.ingredients = new String[]{"tuna", "sunflower oil", "salt"};
        this.expirationDate = new Date(date, numberOfProduct);

        numberOfProduct++;
    }

    public int getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(int netWeight) {
        this.netWeight = netWeight;
    }

    public int getDrainedWeight() {
        return drainedWeight;
    }

    public void setDrainedWeight(int drainedWeight) {
        this.drainedWeight = drainedWeight;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "TunaCan{" +
                "netWeight=" + netWeight +
                ", drainedWeight=" + drainedWeight +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
