package com.Vaibhav.OOP;

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChesPlayer{
    void moves();
}
class Queen implements ChesPlayer {
    public void moves(){
        System.out.println("left,right,up,down,diagonal - (in all 4 direction)");
    }
}
class Rook implements ChesPlayer {
    public void moves(){
        System.out.println("left,right,up,down");
    }
}
class King implements ChesPlayer {
    public void moves(){
        System.out.println("left,right,up,down,diagonal - (bye 1 step)");
    }
}