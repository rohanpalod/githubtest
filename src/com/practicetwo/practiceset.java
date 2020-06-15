package com.practicetwo;
//
//class Studentone{
//    int x=10;
//    public void m1(){
//        System.out.println(x+"hello");
//    }
//    String name;
//    int rollNo;
//    Studentone(String name,int rollNo){
//        this.name=name;
//        this.rollNo=rollNo;
//        System.out.println("Student name is "+name+" and "+name+" Roll Number is:"+rollNo);
//    }
//    Studentone(){
//        System.out.println("Empty constructor is envoked from this call.");
//    }
//    public static void main(String[] args){
//        Studentone s=new Studentone("Rohan",50);
//        System.out.println("Value of instance variable value will be shown in next line:");
//        System.out.println(s.x);
//        Studentone sOne=new Studentone();
//
//    }
//}



//class Studentone{
//    int x;
//    double d;
//    String s;
//    boolean b;
//    public static void main(String[] args){
//        Studentone s= new Studentone();
//        System.out.println(s.x);
//        System.out.println(s.d);
//        System.out.println(s.s);
//        System.out.println(s.b);
//    }
//}


//class College{
//    String name;
//    int rollNo;
//    String collegeName;
//    College(String name,int rollNo){
//        this.name=name;
//        this.rollNo=rollNo;
//        this.collegeName="JECRC";
//        System.out.println("Student name is: "+name+" and roll number is: "+rollNo+" and college name is: "+collegeName);
//    }
//    public static void main(String[] args){
//        College c=new College("Rohan",50);
//        College cOne=new College("rohit",51);
//    }
//}

//Q: Reference variable and primitive variables:-


//class Point{
//    public static void main(String[] args){
//        int x=1;
//        int y=x;
//        x=2;
//        System.out.println(x);
//        System.out.println(y);
//    }
//}
//class Point{
//    int x;
//    int y;
//    Point(int x,int y){
//        this.x=x;
//        this.y=y;
//    }
//
//    @Override
//    public String toString() {
//        return "Point{" +
//                "x=" + x +
//                ", y=" + y +
//                '}';
//    }
//
//    public static void main(String[] args){
//        Point point1= new Point(1,1);
//        Point point2=point1;
//        System.out.println(point1);
//        System.out.println(point2);
//        point1.x=2;
//        System.out.println("By changing value of x now new values of point1 are as follows: "+point1);
//        System.out.println("Since point1 and point2 are reference variable so here value of point2 will also be"+
//                "changed and the value of point 2 will be same as point1 that is: "+point2);
//    }
//}

//Q: Printing array elements:-
//import java.util.Arrays;
//
//class Array{
//    public static void main(String[] args){
//        int[] numbers=new int[5];
//        numbers[0]=1;
//        numbers[1]=2;
//        numbers[2]=3;
//        System.out.println(Arrays.toString(numbers));
//    }
//}



//Q: Printing multidimensional array
//import java.util.Arrays;
//
//class Array{
//    public static void main(String[] args){
//        int[][] numbers=new int[2][3];
//        System.out.println(Arrays.deepToString(numbers));
//    }
//}
//
//Q:Abstarct class concept by implementing abstract class method in the child classes
//abstract class Abstract{
//        public abstract void m1();
//        public abstract void m2();
//}
//abstract class SubAbstract extends Abstract{
//    public void m1(){
//        System.out.println("Abstract method m1 implemented");
//    }
//}
//class SubSubAbstract extends SubAbstract{
//    public void m2(){
//        System.out.println("Abstract method m2 implemented");
//    }
//}
//class MainTwo{
//    public static void main(String[] args){
//        SubSubAbstract abstract1=new SubSubAbstract();
//        abstract1.m1();
//        abstract1.m2();
//    }
//}


