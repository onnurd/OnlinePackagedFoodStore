package com.FoodStore.DataStructures;

public interface IList<T> {

    void add(T newPacket);

    void add(int position, T newPacket);

    T remove(int position);

    T replace(int position, T newPacket);

    T getEntry(int position);

    T[] toArray();

    boolean contains(T packet);

    int getLength();

    boolean isEmpty();

    boolean isFull();

    void clear();

}
