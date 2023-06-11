package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly obj = new RWOnly();
        obj.setName("Demo");
        String name=obj.getName();
        System.out.println(name);
    }
}