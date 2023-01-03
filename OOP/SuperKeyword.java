package com.Vaibhav.OOP;

public class SuperKeyword {
    public static void main(String[] args) {
        Donkey d = new Donkey();
        d.color = "xyz";
        System.out.println(d.color);
    }
}
class Living {
    String color;
    Living(){
        System.out.println("Bull constructor is called..");
    }
}

class Donkey extends Living {
    Donkey(){
        super();
        System.out.println("Donkey constructor called");
    }
}