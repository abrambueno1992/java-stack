package com.abrahambueno;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Stack testing = new Stack();
        System.out.println("*** EMPTY STACK ***");
        testing.getX();
//        System.out.println("Number of items: " + testing.getX());
        testing.push("first");
        testing.push("second");
        testing.push("third");
        System.out.println("*** POPULATED STACK ***");
//        System.out.println("Number of items: " + testing.getX());
        testing.getX();
        System.out.println("stack: " + Arrays.toString(testing.getStack()));
        System.out.println("*** Pop value from stack ***");
        testing.pop();
        System.out.println("stack: " + Arrays.toString(testing.getStack()));
        System.out.println("*** Pop value from stack ***");
        testing.pop();
        System.out.println("stack: " + Arrays.toString(testing.getStack()));
        System.out.println("*** Pop value from stack ***");
        testing.pop();
        System.out.println("stack: " + Arrays.toString(testing.getStack()));
        System.out.println("*** Empty Stack ***");
        testing.getX();
//        System.out.println("Number of items: " + testing.getX());

    }
}
