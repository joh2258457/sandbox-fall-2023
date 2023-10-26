package org.example.linkedlists;

import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E> {

    private Node head; //convention having use head and tail
    private Node tail;
    private int count;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }



    @Override
    public void addFirst(E element) {
    Node newNode = new Node(element, head); //1 & 2

        if (head == null) { //corner case
            head = newNode;
            tail = head;
        }
        else {
            head = newNode; // 3
        }
        count ++;
    }

    @Override
    public void addLast(E element) {
        Node newNode = new Node(element, null); //Step 1

        if (tail == null) {
            tail = newNode;
            head = tail;
        }
        else {
            tail.next = newNode; //step 2
            tail = newNode; //step 3
        }
        count++;
    }

    @Override
    public E pollFirst() { //remove first

        E element; //step 1
        if (head == null) {
            element = null;
        }
        else {
            element = head.element;

            Node next = head.next; //2
            head.next = null; //3
            head = next; //4
        }
        count --;
        return element;
    }

    @Override
    public E pollLast() {
        E element;
        if (tail == null){
            element = null;
        }
        else{
            element = tail.element; //corner case

            if (head == tail) {
                head = null;
                tail = null;
            }
            //if list has more than one element
            else {
                Node current = head; //2
                Node previous = head; //2
                while(current.next != null) { //2
                    previous = current;
                    current = current.next;
                }
                tail = previous; //3
                tail.next = null; //4
            }
        }
        count --;
        return element;
    }

    @Override
    public E peekFirst() {
        return head.element;
    }

    @Override
    public E peekLast() {
        return tail.element;
    }

    @Override
    public void clear() {

        /*
        We iterate over the nodes and nullify the nodes.
        O(n) performance.
         */
        Node current = head;
        while(current.next != null) {
            Node next = current.next;
            current.next = null;
            current = next;
        }

        head = null;
        tail = null;
        count = 0;
    }


    @Override
    public boolean contains(E element) {
             /*
        We iterate over the nodes and check to see if the element is present.
        O(n) performance.
         */
        boolean contains = false;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            if (current.element == element) {
                contains = true;
                break;
            }
            current = next;
        }
        return contains;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("[");
        StringJoiner joiner = new StringJoiner(", ");
        Node current = head;

        while(current != null) {
            joiner.add(current.element.toString());
            current = current.next;
        }

        builder.append(joiner);
        builder.append("]");
        return builder.toString();
    }

    private class Node {
        Node next;
        E element; //because it is declared in the parent class, the E can be used here (its the payload, the value thats inside the Node)
        public Node(E element, Node next) {
            this.next = next;
            this.element = element;
        }

    }
}
