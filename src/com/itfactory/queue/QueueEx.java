package com.itfactory.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("mar");
        stringQueue.add("par");
        stringQueue.add("cires");

        while (!stringQueue.isEmpty()) {
            String elementDinCoada = stringQueue.poll();
            System.out.println(elementDinCoada);
        }
    }
}
