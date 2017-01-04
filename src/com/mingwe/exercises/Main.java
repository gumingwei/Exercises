package com.mingwe.exercises;

import com.mingwe.exercises01.MinStack;

/**
 * Created by mingwei on 1/3/17.
 */
public class Main {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(6);
        minStack.push(4);
        minStack.push(3);
        minStack.push(2);
        minStack.push(8);
        minStack.push(9);
        minStack.pop();
        minStack.pop();
        minStack.pop();
        System.out.print(minStack.getMin() + "");
    }
}
