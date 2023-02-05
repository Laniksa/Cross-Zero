package com.company;

import java.util.Scanner;

public class Play {
   // Scanner scan = new Scanner(System.in);

    public static void createPlayer(Scanner scan){

        System.out.println("Введите имя 1 игрока");
        String name1 = scan.nextLine();
        Player.player1.setName(name1) ;

        System.out.println("Введите имя 2 игрока");
        String name2 = scan.nextLine();
        Player.player2.setName(name2);
    }

    public static void start (Scanner scan){
        createPlayer(scan);
        System.out.println(Field.mas());

        while(true){
            System.out.println(Field.changeMasPlayer1(scan));
            Field.winningOptions('\u0058',Player.player1);

            System.out.println(Field.changeMasPlayer2(scan));
            Field.winningOptions('\u004F',Player.player2);
        }


    }
}
