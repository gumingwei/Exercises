package com.mingwe.exercises01;

import java.util.Stack;

/**
 * Created by mingwei on 1/4/17.
 */
public class MinStack2 {

    private Stack<Integer> mData;

    private Stack<Integer> mMin;

    public MinStack2() {
        mData = new Stack<>();
        mMin = new Stack<>();
    }

    public void push(int data) {

    }

    public int pop() {
        return 0;
    }

    public int getMin() {
        return 1;
    }
}
