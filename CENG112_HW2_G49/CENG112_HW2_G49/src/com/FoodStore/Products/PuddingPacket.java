package com.FoodStore.Products;

import com.FoodStore.Date;

public class PuddingPacket {

    private static int numberOfProduct = 0;
    private int netWeight;
    private String flavor;
    private Date expirationDate;

    public PuddingPacket(String date) {
        this.netWeight = 120;
        this.flavor = "banana";
        this.expirationDate = new Date(date, numberOfProduct);

        numberOfProduct++;
    }

    public int getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(int netWeight) {
        this.netWeight = netWeight;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "PuddingPacket{" +
                "netWeight=" + netWeight +
                ", flavor='" + flavor + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
