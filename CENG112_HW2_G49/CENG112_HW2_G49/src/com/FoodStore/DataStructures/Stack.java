package com.FoodStore.DataStructures;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<T> implements IStack<T> {

    private T[] stack;
    private int topIndex;
    private int numberOfFoods;
    public static final int CAPACITY = 30;

    public Stack() {
        this(CAPACITY);
    }

    @SuppressWarnings("unchecked")
	public Stack(int capacity) {
        this.stack = (T[]) new Object[capacity];
        this.topIndex = -1;
    }


    public void push(T newFood) {
        if (!isFull()) {
            stack[topIndex + 1] = newFood;
            topIndex++;
            numberOfFoods++;
        }
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            T top = stack[topIndex];
            stack[topIndex] = null;
            topIndex--;
            numberOfFoods--;
            return top;
        }
    }

    @Override
    public T peek() {
        if (isEmpty())
            throw new EmptyStackException();
        else
            return stack[topIndex];
    }

    @Override
    public T[] toArray() {
        return stack;
    }

    @Override
    public boolean isEmpty() {
        return numberOfFoods == 0;
    }

    @Override
    public boolean isFull() {
        return numberOfFoods == CAPACITY;
    }

    @SuppressWarnings("unchecked")
	@Override
    public void clear() {
        stack = (T[]) new Object[CAPACITY];
        topIndex = -1;
        numberOfFoods = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }
}
