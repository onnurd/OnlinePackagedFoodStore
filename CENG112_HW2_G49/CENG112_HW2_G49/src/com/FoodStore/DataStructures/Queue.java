package com.FoodStore.DataStructures;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Queue<T> implements IQueue<T>{

    private T[] queue;
    private int frontIndex;
    private int numberOfOrders;
    public static final int CAPACITY = 30;

    public Queue() {
        this(CAPACITY);
    }

    @SuppressWarnings("unchecked")
	public Queue(int capacity) {

        this.queue = (T[]) new Object[capacity];
        this.frontIndex = 0;
    }

    public void enqueue(T newOrder) {
        if (!isFull()) {
            queue[(frontIndex + numberOfOrders) % CAPACITY] = newOrder;
            numberOfOrders++;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        else {
            T front = queue[frontIndex];
            queue[frontIndex] = null;
            frontIndex = (frontIndex + 1) % CAPACITY;
            numberOfOrders--;
            return front;
        }
    }

    public T getFront() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else
            return queue[frontIndex];
    }

    public Object[] toArray() {
        return queue;
    }

    public boolean isEmpty() {
        return numberOfOrders == 0;
    }

    public boolean isFull() {
        return numberOfOrders == CAPACITY;
    }

    @SuppressWarnings("unchecked")
	public void clear() {
        queue = (T[]) new Object[CAPACITY];
        frontIndex = 0;
        numberOfOrders = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
