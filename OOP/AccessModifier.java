package com.Vaibhav.OOP;

public class AccessModifier {
    public static void main(String[] args) {
        Bankaccount myAcc = new Bankaccount();
        System.out.println(myAcc.username = "Vaibhav");
        System.out.println(myAcc.setPassword("12334"));
    }
}

class Bankaccount {
    public String username;
    private String password;
    public boolean setPassword(String pwd){
        password = pwd;
        return false;
    }
}