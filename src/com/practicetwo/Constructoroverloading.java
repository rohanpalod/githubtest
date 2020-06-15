package com.practicetwo;
class Number{
    Number(double d){
        this(10);
        System.out.println("Double-arg constructor");
    }
    Number(int i){
        this();
        System.out.println("Int-arg constructor");
    }
    Number(){
        System.out.println("No-arg constructor");
    }
    public static void main(String[] args){
        Number n1=new Number(10.5);
        Number n2=new Number(10);
        Number n3=new Number();
    }
}