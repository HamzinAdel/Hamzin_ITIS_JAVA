package com.company;

public class ArrayList {
    Object[] elements;
    int count;
    public ArrayList(int capacity){
        elements=new Object[capacity];
    }
    Object get(int i ){
        return  elements[i];
    }
    void add(Object o) {
        elements[count] = o;
        count++;
        
    }

}
