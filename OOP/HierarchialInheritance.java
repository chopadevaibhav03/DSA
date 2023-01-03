package com.Vaibhav.OOP;

public class HierarchialInheritance {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.color = "Black";
        System.out.println(f1.color);
        Bird b1 = new Bird();
        b1.fly();



    }
}
class WildAnimal {
    String color;
    void eat(){
        System.out.println("Eat..");
    }
    void breathe(){
        System.out.println("Breathe...");
    }
}

// Derived class..
class Horse extends WildAnimal {
   void run(){
       System.out.println("run");
   }
}

// derived Class..
class Bird extends WildAnimal {
    Void fly(){
        System.out.println("Fly");
        return null;
    }
}

// derived class..
class Fishes extends WildAnimal {

    void swim(){
        System.out.println("swimming.");
    }
}
