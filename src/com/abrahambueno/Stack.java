package com.abrahambueno;


import java.util.Arrays;

public class Stack {
    private int maxStack = 1000;
    private String[] stack;
    int x = 0;


    public void push(String word) {
        if (x >= 1000) {
            System.out.println("MAXIMUM STACK SIZE OF 1000 REACHED");
        } else {
            stack = biggerArray(word);

        }

    }
    public String[] biggerArray(String arr) {
        // increment counter
        x++;
        // new bigger array
        String[] biggerStack = new String[x];
        // populate the array with the words
        // max index = x - 1
        for (int i = 0; i < x - 1 ; i++) {
            biggerStack[i] = stack[i];
        }
        // push the word into the arr
        biggerStack[x - 1] = arr;
        return biggerStack;
    }

    public void pop() {
        stack = smallerArray(stack);
    }
    public String[]  smallerArray(String[] arr) {
        if (arr == null || x < 0 ) {
            return arr;
        }
        // decrement counter
        x--;
        // new array
        String[] newStack = new String[x];

        for (int i = 0; i < x ; i++) {
            newStack[i] = arr[i];
        }


        // return new array
        return newStack;
    }

    public String[] getStack() {
        return stack;
    }

    public void setStack(String[] stack) {
        this.stack = stack;
    }

    public int getX() {
        if (x == 0) {
            System.out.println("There are no items in your stack");
        } else {
            System.out.println(x);
        }
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + Arrays.toString(stack) +
                ", x=" + x +
                '}';
    }
}
