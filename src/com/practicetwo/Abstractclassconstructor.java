package com.practicetwo;

abstract  class P{
    public abstract void m1();
    P(){
        System.out.println("Hello");
    }
}
class C extends P{
    public void m1(){
        System.out.println("Hello Brother");
    }
}
class MainOne {
    public static void main(String[] args) {
        C c = new C();
        c.m1();
    }
}
//class TestOneOne{
//    public static void main(String[] args){
////            int[][] x=new int[3][];
////            System.out.println(x);
////            System.out.println(x[0]);
////            System.out.println(x[0][0]);
////            System.out.println(x[0].getClass().getName());
//    }
//}
