package com.mingwe.exercises01;

import java.util.Stack;

/**
 * Created by mingwei on 1/5/17.
 * 如何用递归函数逆序一个栈
 * 设计两个函数
 * 函数一：
 * 递归把栈底的元素依次拿出来，把剩下的继续压入栈
 * 函数二：
 * 递归压入拿出来的元素
 */
public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        //printStack(stack);
        reserse(stack);
        printStack(stack);
    }

    public static int getAndRemoveLastElement(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reserse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int last = getAndRemoveLastElement(stack);
        reserse(stack);
        stack.push(last);
    }

    public static void printStack(Stack<Integer> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
