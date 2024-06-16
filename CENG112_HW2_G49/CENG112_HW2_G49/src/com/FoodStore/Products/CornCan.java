package com.FoodStore.Products;

import com.FoodStore.Date;

public class CornCan {

    private static int numberOfProduct = 0;
    private int netWeight;
    private int drainedWeight;
    private String productionCountry;
    private Date expirationDate;

    public CornCan(String date) {
        this.netWeight = 220;
        this.drainedWeight = 132;
        this.productionCountry = "turkey";
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

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "CornCan{" +
                "netWeight=" + netWeight +
                ", drainedWeight=" + drainedWeight +
                ", productionCountry='" + productionCountry + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
