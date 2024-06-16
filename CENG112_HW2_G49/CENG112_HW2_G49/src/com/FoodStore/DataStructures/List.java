package com.FoodStore.DataStructures;

import java.util.Arrays;

public class List<T> implements IList<T> {

    private T[] list;
    private int numberOfPackets;
    public static final int CAPACITY = 30;

    public List() {
        this(CAPACITY);
    }

    @SuppressWarnings("unchecked")
	public List(int capacity) {
        list = (T[]) new Object[capacity];
        numberOfPackets = 0;
    }

    public void add(T newPacket) {
        if (!isFull()) {
            list[numberOfPackets++] = newPacket;
        }
    }

    public void add(int position, T newPacket) {
        if (!isFull() && position >= 0 && position <= numberOfPackets) {
            if (position < numberOfPackets)
                makeRoom(position);
            list[position] = newPacket;
            numberOfPackets++;
        } else
            throw new IndexOutOfBoundsException();
    }

    private void makeRoom(int position) {
        int lastIndex = numberOfPackets - 1;
        for (int i = lastIndex; i >= position; i--) {
            list[i + 1] = list[i];
        }
    }

    public T remove(int position) {
        T result;
        if (!isEmpty() && position >= 0 && position <= numberOfPackets) {
            result = list[position];
            if (position < numberOfPackets) {
                numberOfPackets--;
                removeGap(position);
                list[numberOfPackets] = null;
            }
        } else
            throw new IndexOutOfBoundsException();
        return result;
    }

    private void removeGap(int position) {
        int lastIndex = numberOfPackets;

        for(int i = position; i < lastIndex; i++) {
            list[i] = list[i + 1];
        }
    }

    public T replace(int position, T newPacket) {
        T result;
        if (!isEmpty() && position >= 0 && position <= numberOfPackets) {
            result = list[position];
            list[position] = newPacket;
        } else
            throw new IndexOutOfBoundsException();
        return result;
    }

    public T getEntry(int position) {
        if (!isEmpty() && position >= 0 && position <= numberOfPackets) {
            return list[position];
        } else
            throw new IndexOutOfBoundsException();
    }

    public T[] toArray() {
        return list;
    }

    public boolean contains(T packet) {
        boolean found = false;
        int index = 0;
        while(!found && (index <= numberOfPackets)) {
            if (packet.equals(list[index++]))
                found = true;
        }
        return found;
    }

    public int getLength() {
        return numberOfPackets;
    }

    public boolean isEmpty() {
        return numberOfPackets == 0;
    }

    public boolean isFull() {
        return numberOfPackets == CAPACITY;
    }

    @SuppressWarnings("unchecked")
    public void clear() {
        list = (T[]) new Object[CAPACITY];
        numberOfPackets = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }
}
