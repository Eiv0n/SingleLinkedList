package org.example;

import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(10);
        System.out.println(list);
        System.out.println(list.getValueOf(1));
        System.out.println(list.getValueOf(2));
        list.remove(1);
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.getSize());
        String listStringType = list.toString();
        System.out.println(listStringType);
    }
}