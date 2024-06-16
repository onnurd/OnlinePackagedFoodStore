package com.FoodStore;

import com.FoodStore.DataStructures.*;
import com.FoodStore.FileIO.FileInput;
import com.FoodStore.Products.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        IStack<TunaCan> tunaPile = new Stack<>();
        IStack<CornCan> cornPile = new Stack<>();
        IStack<PuddingPacket> puddingPile = new Stack<>();
        IStack<InstantNoodlePacket> instantNoodlePile = new Stack<>();

        FileInput fileInput = new FileInput("orders.csv");

        IQueue<Order> orderLine = new Queue<>();
        String[][] inputs = fileInput.getInput();

        IList<CargoPacket> cargoPacketList = new List<>();
        for (int i = 0; i < List.CAPACITY; i++) {
            cargoPacketList.add(new CargoPacket(new Order(-1, new Date(0, 0), new String[3])));
        }

        // Creating the foods
        for (int i = 0; i < Stack.CAPACITY; i++) {
            tunaPile.push(new TunaCan("Dec-24"));
            cornPile.push(new CornCan("Dec-24"));
            puddingPile.push(new PuddingPacket("Dec-24"));
            instantNoodlePile.push(new InstantNoodlePacket("Dec-24"));

            int orderID = Integer.parseInt(inputs[i][0]);
            Date orderDate = new Date(inputs[i][1]);
            String[] foodCategories = {inputs[i][2], inputs[i][3], inputs[i][4]};
            orderLine.enqueue(new Order(orderID, orderDate, foodCategories));

        }

        // Four different piles of food packages (Before processing orders)
        System.out.println("PILES OF FOOD PACKAGES BEFORE PROCESSING ORDERS\n");
        printArray(tunaPile.toArray());
        printArray(cornPile.toArray());
        printArray(puddingPile.toArray());
        printArray(instantNoodlePile.toArray());

        Object[] orderLineArray = orderLine.toArray().clone();

        // Processing the Orders
        CargoPacket cargoPacket;
        for (int i = 0; i < Queue.CAPACITY; i++) {

            Order order = orderLine.dequeue();

            cargoPacket = new CargoPacket(order);

            for (String food : order.getFoodCategories()) {
            	if (food.equals("tuna")) {
            		cargoPacket.getProductList().add(tunaPile.pop());
            	} else if (food.equals("corn")) {
            		cargoPacket.getProductList().add(cornPile.pop());
            	} else if (food.equals("pudding")) {
            		cargoPacket.getProductList().add(puddingPile.pop());
            	} else if (food.equals("noodle")) {
            		cargoPacket.getProductList().add(instantNoodlePile.pop());
            	}
            }

            cargoPacketList.replace(cargoPacket.getID() - 1, cargoPacket);
        }


        // Four different piles of food packages (After processing orders)
        System.out.println("\n\nPILES OF FOOD PACKAGES AFTER PROCESSING ORDERS\n");
        printArray(tunaPile.toArray());
        printArray(cornPile.toArray());
        printArray(puddingPile.toArray());
        printArray(instantNoodlePile.toArray());

        System.out.println("ORDERS");
        System.out.println();
        printArray(orderLineArray);


        // The list of cargo packets
        System.out.println();
        printArray(cargoPacketList.toArray());


        // Expiration dates of the packaged products of the cargo packet with ID 25
        for (int j = 0; j < cargoPacketList.getEntry( 25 - 1).getProductList().getLength(); j++) {
                System.out.print(cargoPacketList.getEntry(25 - 1).getProductList().getEntry(j) + "\t");
            }

        cargoPacketList.remove(20 - 1);
        System.out.println();
        System.out.println();
        printArray(cargoPacketList.toArray());

    }

    public static void printArray(Object[] array) {
        for (Object object : array) {
            if (object != null)
                System.out.println(object);
        }
        System.out.println();
    }

}
