package com.Vaibhav.OOP;

import java.util.SortedMap;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vaibhav";
        s1.rollno = 113;
        s1.password = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for (int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
}
    class Student {
        String name;
        int rollno;
        String password;
        int marks[];

       // copy constructor....
        // Shallow copy constructor..

//        Student(Student s1){
//            this.name = s1.name;
//            this.rollno = s1.rollno;
//            marks = new int[3];
//            this.marks = s1.marks;
//        }

        // deep copy constructor..
        Student(Student s1){
            marks = new int[3];
            this.name = s1.name;
            this.rollno = s1.rollno;
            for (int i=0;i< marks.length;i++){
                this.marks[i] = s1.marks[i];
            }
        }

        // Non Parametrized constructor
        Student(){
            marks = new int[3];
            System.out.println("i am a student......");
        }
        // Parametrized Constructor..
        Student(String name){
            marks = new int[3];
            this.name = name;
       }
       Student(int rollno){
           marks = new int[3];
           this.rollno = rollno;
       }
}
