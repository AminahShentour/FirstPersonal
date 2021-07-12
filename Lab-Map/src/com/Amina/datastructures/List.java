package com.Amina.datastructures;

public class List {
    private String[] elements = new String[8];

    public String get(int index){
    return this.elements[index];
    }
    
    public void set(int index, String value){
    this.elements[index] = value;
    }
    
}
