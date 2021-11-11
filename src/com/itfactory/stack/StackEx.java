package com.itfactory.stack;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("mar");
        stringStack.push("par");
        stringStack.push("cires");

        while (!stringStack.isEmpty()) {
            String valoare = stringStack.pop();
        }
    }
}
