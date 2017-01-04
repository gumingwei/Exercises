package com.mingwe.exercises01;

import java.util.Stack;

/**
 * Created by mingwei on 1/4/17.
 * 用两个栈实现一个队列
 * <p/>
 * 一个栈作为压入栈，在压入数据是只往这个栈里压入，另一个栈作为
 */
public class TwoStackQueue {

    private Stack<Integer> mPushStack;

    private Stack<Integer> mPopStack;

    public TwoStackQueue() {
        mPushStack = new Stack<>();
        mPopStack = new Stack<>();
    }

    public void add(int data) {
        mPushStack.push(data);
    }

    /**
     * 出队
     *
     * @return
     */
    public int poll() {
        if (mPushStack.isEmpty() && mPopStack.isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        } else if (mPopStack.isEmpty()) {
            while (!mPushStack.isEmpty()) {
                mPopStack.push(mPushStack.pop());
            }
        }
        return mPopStack.pop();
    }

    /**
     * 获取栈顶元素
     *
     * @return
     */
    public int peek() {
        if (mPushStack.isEmpty() && mPopStack.isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        } else if (mPopStack.isEmpty()) {
            while (!mPushStack.isEmpty()) {
                mPopStack.push(mPushStack.pop());
            }
        }
        return mPopStack.peek();
    }

    public static void main(String[] args) {
        TwoStackQueue queue = new TwoStackQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(3);
        queue.add(5);
        System.out.print("p=" + queue.poll());
        System.out.print("p=" + queue.poll());
        System.out.print("p=" + queue.poll());
        System.out.print("p=" + queue.poll());
        System.out.print("p=" + queue.poll());
    }
}
