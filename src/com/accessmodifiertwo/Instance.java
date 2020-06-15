package com.accessmodifiertwo;

public class Instance {
    int x=10;
    static String s="Rohan";
    public static void main(String[] args){
        Instance i = new Instance();
        i.x=100;
        i.s="Rohit";
        Instance i2 = new Instance();
        System.out.println(i2.x+"..."+i2.s);
    }
}
