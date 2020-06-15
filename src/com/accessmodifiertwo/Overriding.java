package com.accessmodifiertwo;
// Overriding concept in java
//class P{
//    public void m1(int i){
//        System.out.println("Your entered integer value is: "+i);
//    }
//}
//class C extends P{
//     public void m1(int i){
//        System.out.println("your entered overridden value is: "+i);
//    }
//}
//public class Overriding {
//    public static void main(String[] args){
//        P p=new P();
//        p.m1(10);    //parent method called
//        C c=new C();
//        c.m1(100);   //child method called
//        P p1=new C();
//        p1.m1(1000);  //child method called because in overriding method resolution takes care by JVM based on run time object.
//    }
//}


// Method hiding concept in java

//class P{
//    public static void m1(){
//        System.out.println("parent method");
//    }
//}
//class C extends P{
//    public static void m1(){
//        System.out.println("Child method");
//    }
//}
//class MethodHiding{
//    public static void main(String[] args){
//        P p = new P();
//        p.m1();
//        C c =new C();
//        c.m1();
//        P p1 = new C();
//        p1.m1();// Parent method called as in method hiding method resolution is take care by compiler based on reference type.
//    }
//}