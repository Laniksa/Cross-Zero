package com.company;

import java.util.Scanner;

public class Player {
    public static Player player1 = new Player("player1");
    public static Player player2 = new Player("player2");
    private String name;

   public Player(String name){
       this.name = name;
   }

   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name = name;
   }
}
