package com.company;

import java.util.Scanner;

public class Play {
    private static Player player1;
    private static Player player2;
    Scanner scan = new Scanner(System.in);

    public static void createPlayer(Scanner scan){

        System.out.println("Введите имя 1 игрока");
        player1.setName(scan.nextLine());
        System.out.println("Введите имя 2 игрока");
        player2.setName(scan.nextLine());
    }

    public static void start (Player player1, Player player2){
        System.out.println(player1+" Ваш ход, запишите координату");
        //int numRow = scan.nextInt()
        //Field.mas()

    }
}
