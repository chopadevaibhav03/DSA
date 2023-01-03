package com.Vaibhav.OOP;

public class MultiLevInheritance {
    public static void main(String[] args) {
        Dog puppy = new Dog();
        puppy.color = "Black";
        System.out.println(puppy.color);
        puppy.legs = 4;
        System.out.println(puppy.legs);
    }
}
// Base Class
class Animals {
    void eat(){
        System.out.println("Eat..");
    }
    void breathe(){
        System.out.println("Breathe...");
    }
}

// Derived class..
class Dog extends Animal {
    int legs;
}

// derived Class..
class Mammal extends Animal {
    String breed;
}