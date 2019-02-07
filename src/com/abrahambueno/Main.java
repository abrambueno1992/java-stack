package com.abrahambueno;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Stack testing = new Stack();
        System.out.println("Number of items: " + testing.x);
        testing.push("first");
        testing.push("second");
        testing.push("third");
        System.out.println("Number of items: " + testing.x);
        System.out.println("Print the stack: " + Arrays.toString(testing.getStack()));
        testing.pop();
        System.out.println("Print the stack: " + Arrays.toString(testing.getStack()));

    }
}
