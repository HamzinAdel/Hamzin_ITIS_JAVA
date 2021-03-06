package com.company;

public class LinckedList<T> {
    private Node<T> head;
    private int count;

    public LinckedList() {
        count = 0;
    }

    void add(T elem) {
        Node<T> node = new Node<>(elem, null);

        if (head == null) {
            head = node;
        } else {
            Node<T> cur = head;
            while (cur.getNext() != null) {
                cur = cur.getNext();
            }
            cur.setNext(node);
        }
        count++;
    }

    T get(int i) {
        if (i < 0 || i >= count) {
            throw new IndexOutOfBoundsException("Incorrect index: " + i);
        } else {

            Node<T> cur = head;
            int getIndex = 0;

            while (cur.getNext() != null && getIndex!=i  ) {
                cur = cur.getNext();
                getIndex++;

            }
            T getElem = cur.getValue();
            return getElem;
        }
    }

    void remove (int i) {
        if (i < 0 || i >= count) {
            throw new IndexOutOfBoundsException("Incorrect index: " + i);
        } else {
            Node<T> cur = head;

            int getIndex = 0;
            while (cur.getNext() != null) {
                if(getIndex==i) {


                }
                else {
                    cur = cur.getNext();

                }
                getIndex++;
            }
            cur.setNext(cur.next);
        }
    }




    @Override
    public String toString() {
        String s = "LinckedList{";
        if (head != null) {
            Node<T> cur = head;
            while (cur.getNext() != null) {
                T value = cur.getValue();

                if (value != null) {
                    s += value.toString();
                } else {
                    s += "null";
                }
                s += ", ";
                cur = cur.getNext();
            }
            s += cur.getValue() != null ? cur.getValue().toString() : "null";        }
        s += "}";
        return s;
    }

    ////
//String elemString(T getElem) {
////         String s = "Elem of the given index";
////
////    }
    private class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public T getValue() {
            return value;
        }


    }
}