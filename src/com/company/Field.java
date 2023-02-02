package com.company;

import java.util.Scanner;

public class Field {
    private static int column = 3;
    private static int row = 3;
    private static char X = '\u0058';
    private static char[][] ch = new char[row][column];
    private static char sim = '\u005f';
    Scanner scan = new Scanner(System.in);


    public static char[][] mas() {

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++ ){
                System.out.print(ch[i][j] = sim);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        return ch;
    }

    public static char[][] getCh() {
        return ch;
    }

    public static void setCh(char[][] ch) {
        Field.ch = ch;
    }

    public static char[][] changeMas(Scanner scan){
        System.out.println(Player.player1 +"Ход "+Player.player2+" запишите координату:  X");
        int numRow = scan.nextInt();
        System.out.println("Запишите координату: Y");
        int numCol = scan.nextInt();
        ch[numRow][numCol]= X;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++ ){
                System.out.print(ch[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        return ch;
    }

}
