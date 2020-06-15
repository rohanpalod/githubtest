package com.accessmodifiertwo;
//Case1 overloading
//public class Overloading {
//    public void m1(int i){
//        System.out.println("Your entered integer value is: "+ i);
//    }
//    public void m1(float f){
//        System.out.println("Your entered float value is :"+d);
//    }
//    public void m1(){
//        System.out.println("You have called non-arg method");
//    }
//    public static void main(String[] args){
//        Overloading object=new Overloading();
//        object.m1();
//        object.m1('a'); //here compiler will perform implicitly conversion from char to int
//        object.m1(10.5f);
//    }
//}


//Case2 overloading
//public class Overloading{
//    public void m1(Object o){
//        System.out.println("Object class method called");
//    }
//    public void m1(String s){
//        System.out.println("String class method called: "+s);
//    }
//    public static void main(String[] args){
//        Overloading object=new Overloading();
//        object.m1(new Object());
//        object.m1("Rohan");
//        object.m1(null)//If we pass null value in method,then child will get preference and if child does not contain the value then only parent will get the chance, here string class is the child class of object class
//    }
//}

//Case3 Overloading
//class Overloading{
//    public void m1(String s){
//        System.out.println("String-arg method called");
//    }
//    public void m1(StringBuffer sb){
//        System.out.println("string buffer version method called");
//    }
//    public static void main(String[] args){
//        Overloading object=new Overloading();
//        object.m1("Rohan");
//        object.m1(new StringBuffer());
//        //object.m1(null)  Here null arg will give compilation error due to ambiguity problem
//    }
//}

//Case4 Overloading
//class Overloading{
//    public void m1(int i, float f){
//        System.out.println("int-float version called");
//    }
//    public void m1(float f, int i){
//        System.out.println("float-int version called");
//    }
//    public static void main(String[] args){
//        Overloading object= new Overloading();
//        object.m1(10,10.5f);
//        object.m1(10.5f,10);
//        //object.m1(10,10) ambiguity as it satisfies both method calls
//        //object.m1(10.5f,10.5f) cant have any method with signature m1(float,float)
//    }
//}

class Animal{

}
class Monkey extends Animal{

}
class Overloading{
    public void m1(Animal a){
        System.out.println("Animal-version called");
    }
    public void m1(Monkey m){
        System.out.println("Monkey-Version called");
    }
    public static void main(String[] args){
        Overloading object= new Overloading();
        Animal a= new Animal();
        object.m1(a);
        Monkey m= new Monkey();
        object.m1(m);
        Animal a1=new Monkey();
        object.m1(a1);
    }
}