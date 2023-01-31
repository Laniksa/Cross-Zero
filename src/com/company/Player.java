package com.company;

import java.util.Scanner;

public class Player {
    private String name;
    private Scanner scan = new Scanner(System.in);


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
