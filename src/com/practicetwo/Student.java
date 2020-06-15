package com.practicetwo;

public class Student {
    String name;
    int rollNo;
    Student(String name, int rollNo)
    {
        this.name=name;
        this.rollNo=rollNo;
    }
    Student(){
        System.out.println("Empty constructor call");
    }
    public static void main(String[] args){
        Student s1=new Student("Rohan", 50);
        Student s2=new Student("Rohit", 51);
        System.out.println(s1.name+"..."+s1.rollNo);
        System.out.println(s2.name+"..."+s2.rollNo);
        Student s3=new Student();
        System.out.println(s3.name+"..."+s3.rollNo);
    }
}
