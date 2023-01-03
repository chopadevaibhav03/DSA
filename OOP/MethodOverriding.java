package com.Vaibhav.OOP;

public class MethodOverriding {
    public static void main(String[] args) {
//        Human h = new Human();
//        h.man();
        Boy b = new Boy();
        b.man();
    }
}
class Human{
    void man(){
        System.out.println("I am Adult.");
    }
}
class Boy extends Human {
    void man(){
        System.out.println("I am teenager");
    }
}