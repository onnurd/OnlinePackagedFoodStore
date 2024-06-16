package com.FoodStore;

import com.FoodStore.DataStructures.IList;
import com.FoodStore.DataStructures.List;

public class CargoPacket {

    private int ID;
    private Date processDate;
    private IList<Object> productList;

    public CargoPacket(Order order) {
        this.ID = order.getID();
        this.processDate = order.getOrderDate();
        this.productList = new List<>(3);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public IList<Object> getProductList() {
        return productList;
    }

    public void setProductList(IList<Object> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "CargoPacket{" +
                "ID=" + ID +
                ", Product List=" + productList +
                '}';
    }
}
