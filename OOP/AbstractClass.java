package com.Vaibhav.OOP;

public class AbstractClass {
    public static void main(String[] args) {
//        Elephant e = new Elephant();
//        e.walk();
//        e.eat();

//        Cow c = new Cow();
//        c.walk();
//        c.eat();
//        System.out.println(c.color);

        Abcd myElephant =  new Abcd();

    }
}
abstract class Wild{
    String color;
    Wild() {
//        color = "Brown";
        System.out.println(" wild constructor called..");
    }
    void eat(){
        System.out.println("wilds are eat food..");
    }
    abstract void walk();
}

class Elephant extends Wild {
    Elephant(){
        System.out.println("Elephant constructor called");
    }
   void changeColor(){
       color = "Grey";
   }
    void walk(){
        System.out.println("walk in jungle..");
    }
}
class Abcd extends Elephant {
    Abcd(){
        System.out.println("Abcd contructor called..");
    }
}

class Cow extends Wild {
//    void changeColor(){
//        color = "white";
//    }
    void walk(){
        System.out.println("Walk on road..");
    }
}