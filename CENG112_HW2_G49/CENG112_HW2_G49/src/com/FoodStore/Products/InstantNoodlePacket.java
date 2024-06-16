package com.FoodStore.Products;

import com.FoodStore.Date;

public class InstantNoodlePacket {

    private static int numberOfProduct = 0;
    private int netWeight;
    private int simmerDuration;
    private Date expirationDate;

    public InstantNoodlePacket(String date) {
        this.netWeight = 120;
        this.simmerDuration = 3;
        this.expirationDate = new Date(date, numberOfProduct);

        numberOfProduct++;
    }

    public int getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(int netWeight) {
        this.netWeight = netWeight;
    }

    public int getSimmerDuration() {
        return simmerDuration;
    }

    public void setSimmerDuration(int simmerDuration) {
        this.simmerDuration = simmerDuration;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "InstantNoodlePacket{" +
                "netWeight=" + netWeight +
                ", simmerDuration=" + simmerDuration +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
