package com.accessmodifiertwo;

public class Constructor {
    String name;
    int age;
    Constructor(String name, int age){
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args){
        Constructor constructor = new Constructor("Rohan",21);
        System.out.println("Student name is: "+constructor.name+" and student age is :"+ constructor.age);
    }
}
