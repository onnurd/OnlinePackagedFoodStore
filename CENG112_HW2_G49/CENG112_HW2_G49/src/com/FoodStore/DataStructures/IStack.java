package com.FoodStore.DataStructures;

public interface IStack<T> {

    void push(T newFood);

    T pop();

    T peek();

    T[] toArray();

    boolean isEmpty();

    boolean isFull();

    void clear();

}
