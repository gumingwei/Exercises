package com.mingwe.exercises01;

import java.util.Stack;

/**
 * Created by mingwei on 1/4/17.
 * 设计一个具有获取最小值功能的栈:
 * 策略二:
 * 压入规则：
 * 当前的数据data压入mData，判断mMin是否为空
 * 如果为空，同时压入mMin
 * 如果不为空，判断data和mMin的栈顶元素哪个大？
 * 如果data大，就把mMin的栈顶元素重复压入mMin
 * 如果data小，就把data压入mMin
 * 弹出规则：
 * 当前弹出的元素value等于mMin的栈顶元素时同时弹出mMin的栈顶元素。因为
 */
public class MinStack2 {

    private Stack<Integer> mData;

    private Stack<Integer> mMin;

    public MinStack2() {
        mData = new Stack<>();
        mMin = new Stack<>();
    }

    public void push(int data) {
        if (mMin.isEmpty()) {
            mMin.push(data);
        } else if (data < getMin()) {
            mMin.push(data);
        } else {
            int newMin = mMin.peek();
            mMin.push(newMin);
        }
        mData.push(data);
    }

    public int pop() {
        if (mMin.isEmpty()) {
            throw new RuntimeException("MinStack is Empty");
        }
        mMin.pop();
        return mData.pop();
    }

    public int getMin() {
        if (mMin.isEmpty()) {
            throw new RuntimeException("MinStack is Empty");
        }
        return mMin.peek();
    }

    public static void main(String[] args) {
        MinStack2 minStack = new MinStack2();
        minStack.push(6);
        minStack.push(4);
        minStack.push(3);
        minStack.push(2);
        minStack.push(8);
        minStack.push(9);
        minStack.pop();
        minStack.pop();
        minStack.pop();
        System.out.print(minStack.getMin());
    }
}
