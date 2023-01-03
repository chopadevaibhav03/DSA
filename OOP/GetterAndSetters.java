package com.Vaibhav.OOP;

public class GetterAndSetters {
    public static void main(String[] args) {
        Pencil p1 = new Pencil();
        p1.setColor("Black");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Black");
        System.out.println(p1.getColor());
    }
}
class Pencil {
    private  String color;
    private  int tip;
//   Getters......
    String getColor(){
    return this.color;
    }
    int getTip(){
        return this.tip;
    }
    // Setters......
    void setColor(String newColor){
      this.color = newColor;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}




