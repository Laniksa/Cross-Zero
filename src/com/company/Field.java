package com.company;

import java.util.Scanner;

public class Field {
    private static final int column = 3;
    private static final int row = 3;
    private static final char X = '\u0058';
    private static final char O = '\u004F';
    private static char[][] ch = new char[row][column];
    private static final char sim = '\u005f';
   // Scanner scan = new Scanner(System.in);


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

//    public static char[][] getCh() {
//        return ch;
//    }

//    public static void setCh(char[][] ch) {
//        Field.ch = ch;
//    }

    public static char[][] changeMasPlayer1(Scanner scan){//ход 1 игрока
        System.out.println("Ход "+Player.player1.getName()+" запишите координату:  X");
        int numRow = scan.nextInt();
        System.out.println("Запишите координату: X");
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

    public static char[][] changeMasPlayer2(Scanner scan){//ход 2 игрока
        System.out.println("Ход "+Player.player2.getName()+" запишите координату:  X");
        int numRow = scan.nextInt();
        System.out.println("Запишите координату: Y");
        int numCol = scan.nextInt();
        ch[numRow][numCol]= O;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++ ){
                System.out.print(ch[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        return ch;
    }

    public static void winningOptions(char simbol, Player player){
        if (ch[0][0]==ch[0][1] && ch[0][0]==ch[0][2] && ch[0][0]==simbol ||
                ch[1][0]==ch[1][1] && ch[1][0]==ch[1][2] && ch[1][0]==simbol ||
                ch[2][0]==ch[2][1] && ch[2][0]==ch[2][2] && ch[2][0]==simbol ||

                ch[0][0]==ch[1][0] && ch[0][0]==ch[2][0] && ch[0][0]==simbol ||
                ch[0][1]==ch[1][1] && ch[0][1]==ch[2][1] && ch[0][1]==simbol ||
                ch[0][2]==ch[1][2] && ch[0][2]==ch[2][2] && ch[0][2]==simbol ||

                ch[0][0]==ch[1][1] && ch[0][0]==ch[2][2] && ch[0][0]==simbol ||
                ch[0][2]==ch[1][1] && ch[0][2]==ch[2][0] && ch[0][2]==simbol)
                {

            System.out.println("Выиграл "+player.getName());
        }

    }

}
