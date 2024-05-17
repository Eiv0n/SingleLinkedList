package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

// Single LinkedList без параметризации
public class SingleLinkedList {

    private Node headElement;

    private int size;

    public int getSize() {
        return size;
    }

    public int getFirst() {
        return headElement.getValue();
    }

    public int getLast() {
        Node goingThrough = headElement;
        while (goingThrough.getNext() != null) {
            goingThrough = goingThrough.getNext();
        } return goingThrough.getValue();
    }
    public void remove(int index) {
    int currentIndex = 0;
    Node goingThrough = headElement;
    if (index == 0){
        headElement = headElement.getNext();
        size--;
        return;
    }
    while (goingThrough != null) {
        if (currentIndex + 1 == index) {
            goingThrough.setNext(goingThrough.getNext().getNext());
            size--;
            return;
        } else {
            goingThrough = goingThrough.getNext();
            currentIndex++;
        }

    }
    }

    public int getValueOf(int index) {
        int currentIndex = 0;
        Node goingThrough = headElement;
        while (goingThrough != null) {
            if (currentIndex == index){
               return goingThrough.getValue();
            } else {
                goingThrough = goingThrough.getNext();
                currentIndex++;
            }
        } throw new IllegalArgumentException();
    }

    public void add(int value){

                if (headElement==null){
            this.headElement = new Node(value);

        } else {
            Node goingThrough = headElement;
            while (goingThrough.getNext() != null) {
                goingThrough = goingThrough.getNext();
            }
                     goingThrough.setNext(new Node(value));
        }
        size++;

        }

    public String toString() {
        int[] result = new int[size];
        int index = 0;
        Node goingThrough = headElement;
        while (goingThrough != null) {
            result[index++] = (goingThrough.getValue());
            goingThrough = goingThrough.getNext();
        }
        return Arrays.toString(result);

    }

    private static class Node{


        int value;
        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        private Node next;

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }


        public Node(int value) { // конструктор узла
            this.value = value;
        }

    }
}
