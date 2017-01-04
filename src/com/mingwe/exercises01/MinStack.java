package com.mingwe.exercises01;

import java.util.Stack;

/**
 * Created by mingwei on 1/3/17.
 * 设计一个具有获取最小值功能的栈:
 * 策略一:
 * 压入规则:
 * 把当前的数据data压入mData,然后判断mMin
 * 1.当mMin为空时，data也压入mMin。
 * 2.当mMin不为空时，比较data和mMin的栈顶元素哪个更小，如果data<=mMin.peek(),data压入mMin。如果data>mMin.peek(),则不压入。
 * 弹出规则:
 * 1.弹出一个元素value,然后比较当前的mMin的栈顶元素，由于压入规则可知，mMin栈顶的元素是mData栈的最小元素，不会出现出现value比mMin的
 * 栈顶元素更小的情况，value只可能大于mMin栈顶元素，当value等于mMin栈顶元素时弹出mMin的栈顶元素
 */
public class MinStack {

    private Stack<Integer> mData;

    private Stack<Integer> mMin;

    public MinStack() {
        mData = new Stack<>();
        mMin = new Stack<>();
    }

    public void push(int data) {
        if (mMin.isEmpty()) {
            mMin.push(data);
        } else if (data <= getMin()) {
            mMin.push(data);
        }
        mData.push(data);
    }

    public int pop() {
        if (mMin.isEmpty()) {
            throw new RuntimeException("mMinStack is Empty");
        }
        int value = mData.pop();
        if (value == getMin()) {
            mMin.pop();
        }
        return value;
    }

    public int getMin() {
        if (mMin.isEmpty()) {
            throw new RuntimeException("mMinStack is Empty");
        }
        return mMin.peek();
    }

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
        System.out.print(minStack.getMin());
    }
}