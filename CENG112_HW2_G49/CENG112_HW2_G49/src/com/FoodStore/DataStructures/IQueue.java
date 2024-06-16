package com.FoodStore.DataStructures;

public interface IQueue<T> {

    void enqueue(T newOrder);

    T dequeue();

    T getFront();

    Object[] toArray();

    boolean isEmpty();

    boolean isFull();

    void clear();

}
