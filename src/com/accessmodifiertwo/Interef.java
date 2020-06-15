package com.accessmodifiertwo;
public interface Interef {
    public void m1();
    public void m2();
    public void m3();
}
abstract class ServiceProvider implements Interef {
    public void m1(){
        System.out.println("Hello method m1");
    }
    public void m2(){
        System.out.println("Hello method m2");
    }
    public void m4(){
        System.out.println("hello");
    }
}
class SubServiceProvider extends ServiceProvider{
    public void m3(){
        System.out.println("Hello method m3");
    }
}
