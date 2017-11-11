











package com.company;


public class Main {

    public static void main(String[] args) {
        LinckedList<Integer> list = new LinckedList<>();
        list.add(6);
        list.add(3);
        list.add(1);

        list.add(9);

        list.add(0);
        list.remove(3);
        System.out.println(list.toString());

    }
}

