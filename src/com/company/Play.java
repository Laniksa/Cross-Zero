package com.company;

import java.util.Scanner;

public class Play {

    //private static Char X = ;
    Scanner scan = new Scanner(System.in);

    public static void createPlayer(Scanner scan){

        System.out.println("Введите имя 1 игрока");
        Player.player1.setName(scan.nextLine());
        System.out.println("Введите имя 2 игрока");
        Player.player2.setName(scan.nextLine());
    }

    public static void start (Player player1, Player player2, Scanner scan){
        System.out.println(player1+"Ход "+player1+" запишите координату:  X");
        int numRow = scan.nextInt();
        System.out.println("Запишите координату: Y");
        int numCol = scan.nextInt();

        //Field.setCh("\u0058");

    }
}
